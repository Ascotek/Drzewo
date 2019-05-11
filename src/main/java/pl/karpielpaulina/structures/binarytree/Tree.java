package pl.karpielpaulina.structures.binarytree;

import pl.karpielpaulina.structures.Tree.Node;

public class Tree {
   private ChildEx root;           //node kolko = kazde drzewo ma nody i jeden root

    public ChildEx getRoot() {
        return root;
    }

    public void setRoot(ChildEx root) {
        this.root = root;
    }


    public int length(ChildEx child) {
        int maxLength =0;

        if(child.getRightChild() == null && child.getLeftChild() == null){
            return 0;
        }

        if(child.getRightChild()!= null) {
            int rightChildLength = 1 + length(child.getRightChild());
            if(maxLength < rightChildLength ) maxLength = rightChildLength;
        }
        if(child.getLeftChild()!= null) {
            int leftChildLength =  1 + length(child.getLeftChild());
            if(maxLength < leftChildLength ) maxLength = leftChildLength;

        }
       return maxLength ;

    }

    void preOrder (ChildEx node){
        System.out.println(node.getValue());

        if(node.getLeftChild()!= null) {
            preOrder(node.getLeftChild());
        }
        if(node.getRightChild()!= null) {
            preOrder(node.getRightChild());
        }

    }
    void preOrder1 (ChildEx node){

        if(node.getLeftChild()!= null) {
            preOrder(node.getLeftChild());
        }
        System.out.println(node.getValue());
        if(node.getRightChild()!= null) {
            preOrder(node.getRightChild());
        }

    }





}
