import UIComponent from "../../model/UIComponent";
import ComponentExtractor from "../ComponentExtractor";

export default class Unknown implements ComponentExtractor {
    execute(node: BaseNode): UIComponent {
        return new UIComponent(
            node.type,
            {
                name: "Unknown component"
            },
            []
        )
    }
}