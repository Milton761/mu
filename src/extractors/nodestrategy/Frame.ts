import UIComponent from "../../model/UIComponent";
import ComponentExtractor from "../ComponentExtractor";

export class Frame implements ComponentExtractor {
    execute(node: BaseNode): UIComponent {
        const frameNode = node as FrameNode;
        const type = frameNode.type;
        const properties = {
            name: frameNode.name
        }

        const children = frameNode.children.map(child => {
            return UIComponent.parseFrom(child)
        })

        return new UIComponent(
            type,
            properties,
            children
        )
    }

}