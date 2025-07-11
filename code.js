"use strict";
function extractStructure(node) {
    const structure = {
        id: node.id,
        name: node.name,
        type: node.type,
        properties: {}
    };
    if ('x' in node) {
        const sceneNode = node;
        structure.properties = {
            x: sceneNode.x,
            y: sceneNode.y
        };
    }
    if ('width' in node) {
        const sizedNode = node;
        structure.properties = Object.assign(Object.assign({}, structure.properties), { width: sizedNode.width, height: sizedNode.height });
    }
    if ('fills' in node) {
        const paintNode = node;
        structure.properties.fills = paintNode.fills;
    }
    if ('children' in node) {
        const parentNode = node;
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
figma.ui.onmessage = (msg) => {
    if (msg.type === 'create-shapes') {
        const numberOfRectangles = msg.count || 0;
        const nodes = [];
        for (let i = 0; i < numberOfRectangles; i++) {
            const rect = figma.createRectangle();
            rect.x = i * 150;
            rect.fills = [{ type: 'SOLID', color: { r: 1, g: 0.5, b: 0 } }];
            figma.currentPage.appendChild(rect);
            nodes.push(rect);
        }
        figma.currentPage.selection = nodes;
        figma.viewport.scrollAndZoomIntoView(nodes);
    }
    else if (msg.type === 'extract-structure') {
        const selection = figma.currentPage.selection;
        const structures = selection.length ?
            selection.map(node => extractStructure(node)) :
            [extractStructure(figma.currentPage)];
        figma.ui.postMessage({
            type: 'structure-data',
            data: structures
        });
        return; // Don't close plugin when extracting aaa
    }
    figma.closePlugin();
};
