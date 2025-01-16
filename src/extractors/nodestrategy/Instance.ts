import {InstanceNode} from "@figma/plugin-typings/plugin-api-standalone";
import UIComponent from "../../model/UIComponent";
import ComponentExtractor from "../ComponentExtractor";

export class Instance implements ComponentExtractor {
    execute(node: BaseNode): UIComponent {
        console.log("name", node.name);
        const instanceNode = node as InstanceNode;

        const type = instanceNode.type;
        const properties = {
            name: instanceNode.name
        }

        return new UIComponent(
            type,
            properties,
            []
        )
    }
}