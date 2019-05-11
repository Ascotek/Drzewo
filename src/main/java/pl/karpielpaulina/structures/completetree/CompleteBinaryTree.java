package pl.karpielpaulina.structures.completetree;

import java.util.ArrayList;

public class CompleteBinaryTree {
    public static void main(String[] args) {
        CompleteBinaryTree tree = new CompleteBinaryTree();

        tree.add(80);
        tree.add(5);
        tree.add(3);
        tree.add(2);
        tree.add(100);
        tree.add(42);
        tree.add(1);
        tree.add(250);
        tree.add(6);
        tree.add(45);
        tree.add(11);
        tree.add(18);



        System.out.print(tree.arrayList);

    }

    private ArrayList<Integer> arrayList = new ArrayList<>();

    int getParentIndex(int childIndex) {
        int o = childIndex;
        return (o - 1) / 2;
    }

    int getRightIndex(int parentIndex) {
        int l = parentIndex;
        return (2 * l) + 2;

    }

    int getLeftIndex(int parentIndex) {
        int k = parentIndex;
        return (2 * k) + 1;
    }

    void add(Integer value) {
        arrayList.add(value);

        int koncowyElement = arrayList.size() - 1;
        addAtIndex(koncowyElement);

    }

    private void addAtIndex(int koncowyElement) {
        if(koncowyElement == 0){
            return;
        }
        int value = getValue(koncowyElement);
        int parentIndex = getParentIndex(koncowyElement);
        if (parentIndex >= 0) {
            int parentValue = getValue(parentIndex);
            int childValue = getValue(koncowyElement);
            if (parentValue < value) {
                arrayList.set(parentIndex, value);
                arrayList.set(koncowyElement, parentValue);
                addAtIndex(parentIndex);                    //zastosowanie rekurencja
            }
        }
    }

    Integer getValue(int index) {
        return arrayList.get(index);
    }


}
