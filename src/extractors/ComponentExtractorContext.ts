import ComponentExtractor from "./ComponentExtractor";
import {Instance} from "./nodestrategy/Instance";
import UIComponent from "../model/UIComponent";
import Unknown from "./nodestrategy/Unknown";
import {Frame} from "./nodestrategy/Frame";

export default class ComponentExtractorContext {

    private componentExtractors: { [key: string]: ComponentExtractor } = {};

    constructor() {
        this.componentExtractors["INSTANCE"] = new Instance();
        this.componentExtractors["FRAME"] = new Frame();

        this.componentExtractors["DOCUMENT"] = new Unknown();
        this.componentExtractors["PAGE"] = new Unknown();
        this.componentExtractors["SLICE"] = new Unknown();
        this.componentExtractors["GROUP"] = new Unknown();
        this.componentExtractors["COMPONENT_SET"] = new Unknown();
        this.componentExtractors["COMPONENT"] = new Unknown();
        this.componentExtractors["BOOLEAN_OPERATION"] = new Unknown();
        this.componentExtractors["VECTOR"] = new Unknown();
        this.componentExtractors["STAR"] = new Unknown();
        this.componentExtractors["LINE"] = new Unknown();
        this.componentExtractors["ELLIPSE"] = new Unknown();
        this.componentExtractors["POLYGON"] = new Unknown();
        this.componentExtractors["RECTANGLE"] = new Unknown();
        this.componentExtractors["TEXT"] = new Unknown();
        this.componentExtractors["STICKY"] = new Unknown();
        this.componentExtractors["CONNECTOR"] = new Unknown();
        this.componentExtractors["SHAPE_WITH_TEXT"] = new Unknown();
        this.componentExtractors["CODE_BLOCK"] = new Unknown();
        this.componentExtractors["STAMP"] = new Unknown();
        this.componentExtractors["WIDGET"] = new Unknown();
        this.componentExtractors["EMBED"] = new Unknown();
        this.componentExtractors["LINK_UNFURL"] = new Unknown();
        this.componentExtractors["MEDIA"] = new Unknown();
        this.componentExtractors["SECTION"] = new Unknown();
        this.componentExtractors["HIGHLIGHT"] = new Unknown();
        this.componentExtractors["WASHI_TAPE"] = new Unknown();
        this.componentExtractors["TABLE"] = new Unknown();
    }

    extract(node: BaseNode): UIComponent {
        const extractor = this.componentExtractors[node.type];
        if (extractor) {
            return extractor.execute(node);
        }

        throw new Error(`No extractor found for node type: ${node.type}`);
    }
}
