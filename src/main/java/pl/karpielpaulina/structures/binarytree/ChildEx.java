package pl.karpielpaulina.structures.binarytree;

public class ChildEx {
    private String value;
    public ChildEx rightChild;
    public ChildEx leftChild;

    public ChildEx(String value) {
        this.value = value;
    }
    public ChildEx(){
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ChildEx getRightChild() {
        return rightChild;
    }

    public void setRightChild(ChildEx rightChild) {
        this.rightChild = rightChild;
    }

    public ChildEx getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(ChildEx leftChild) {
        this.leftChild = leftChild;
    }
}
