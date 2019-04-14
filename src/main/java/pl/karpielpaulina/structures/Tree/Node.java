package pl.karpielpaulina.structures.Tree;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String value;
    List<Node> children = new LinkedList<>();

    void addChild(Node node){
        children.add(node);
    }

    List<Node>getChildren(){
        return children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node(String value) {
        this.value = value;
    }
}
