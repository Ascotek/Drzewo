package pl.karpielpaulina.structures.binarytree;
/*Długosc drzewa*/


import pl.karpielpaulina.structures.completetree.CompleteBinaryTree;

import java.util.Comparator;
import java.util.SortedMap;

public class BinaryTreeApp {
    public static void main(String[] args) {
        ChildEx root = new ChildEx("A");
        ChildEx childB = new ChildEx ("B");
        root.setLeftChild(childB);

        ChildEx childD = new ChildEx ("D");
        childB.setLeftChild(childD);

        ChildEx childE = new ChildEx("E");
        childB.setRightChild(childE);

        ChildEx childC = new ChildEx("C");
        root.setRightChild(childC);

        ChildEx childF = new ChildEx ("F");
        childC.setLeftChild(childF);

        ChildEx childG = new ChildEx("G");
        childC.setRightChild(childG);

        Tree tree = new Tree();
        tree.setRoot(root);

        System.out.println(tree.length(childC));

        System.out.println("--------------------");

        tree.preOrder(root);
        System.out.println("--------------------");

        tree.preOrder1(root);

        System.out.println("--------------------");










    }
}
