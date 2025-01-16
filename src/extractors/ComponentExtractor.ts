import UIComponent from "../model/UIComponent";

export default interface ComponentExtractor {
    execute(node: BaseNode): UIComponent;
}