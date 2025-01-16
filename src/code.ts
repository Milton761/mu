// import UIComponent from "./src/UIComponent";

import UIComponent from "./model/UIComponent";

interface UIStructure {
    id: string;
    name: string;
    type: string;
    children?: UIStructure[];
    properties: {
        x?: number;
        y?: number;
        width?: number;
        height?: number;
        fills?: Paint[];
    };
}

function inspectNode(node: BaseNode) {
    return UIComponent.parseFrom(node)
}

function extractStructure(node: BaseNode): UIStructure {
    const structure: UIStructure = {
        id: node.id,
        name: node.name,
        type: node.type,
        properties: {}
    };

    if ('x' in node) {
        const sceneNode = node as SceneNode;
        structure.properties = {
            x: sceneNode.x,
            y: sceneNode.y
        };
    }

    if ('width' in node) {
        const sizedNode = node as FrameNode;
        structure.properties = {
            ...structure.properties,
            width: sizedNode.width,
            height: sizedNode.height
        };
    }

    if ('fills' in node) {
        const paintNode = node as GeometryMixin;
        structure.properties.fills = paintNode.fills as Paint[];
    }

    if ('children' in node) {
        const parentNode = node as FrameNode;
        structure.children = parentNode.children.map(child => extractStructure(child));
    }

    return structure;
}

figma.showUI(__html__, {
    width: 450,
    height: 600,
    title: "UI Structure Extractor",
    visible: true
});

figma.ui.onmessage = (msg: { type: string, count?: number }) => {

    console.log("Message received a: ", msg);

    if (msg.type === 'create-shapes') {
        const numberOfRectangles = msg.count || 0;
        const nodes: SceneNode[] = [];

        for (let i = 0; i < numberOfRectangles; i++) {
            const rect = figma.createRectangle();
            rect.x = i * 150;
            rect.fills = [{type: 'SOLID', color: {r: 1, g: 0.5, b: 0}}];
            figma.currentPage.appendChild(rect);
            nodes.push(rect);
        }

        figma.currentPage.selection = nodes;
        figma.viewport.scrollAndZoomIntoView(nodes);
    } else if (msg.type === 'extract-structure') {
        const selection = figma.currentPage.selection;
        const structures = selection.length ?
            selection.map(node => extractStructure(node)) :
            [extractStructure(figma.currentPage)];

        figma.ui.postMessage({
            type: 'structure-data',
            data: structures
        });
        return; // Don't close plugin when extracting aaa
    } else if (msg.type === 'inspect-node') {
        console.log("Inspecting node clicked s");
        const selection = figma.currentPage.selection;
        const uiComponents = selection.length ?
            selection.map(node => inspectNode(node)) :
            [inspectNode(figma.currentPage)];

        figma.ui.postMessage({
            type: 'inspect-element',
            data: uiComponents
        });
        return; // Don't close plugin when extracting aaa
    }

    console.log("Closing plugin");
    // figma.closePlugin();
};