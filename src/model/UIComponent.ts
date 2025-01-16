import ComponentExtractorContext from "../extractors/ComponentExtractorContext";

export default class UIComponent {

    type: string;
    properties: { [key: string]: string };
    children: Array<UIComponent>;

    constructor(
        type: string = 'unknown',
        properties: { [key: string]: string } = {},
        children: Array<UIComponent> = []
    ) {
        this.type = type
        this.properties = properties
        this.children = children
    }

    static parseFrom(node: BaseNode | SceneNode): UIComponent {
        const extractorContext = new ComponentExtractorContext();
        return extractorContext.extract(node);
    }
}