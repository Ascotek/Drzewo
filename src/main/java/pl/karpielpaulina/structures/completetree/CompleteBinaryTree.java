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

        System.out.println("--------------------");


        tree.remove();
        tree.remove();


        System.out.println(tree.arrayList);


    }
    private ArrayList<Integer> arrayList = new ArrayList<>();

    int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    int getLeftValue(int parentIndex) {
        int leftChildIndex = getLeftChildIndex(parentIndex);
        return getValue(leftChildIndex);
    }

    int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    int getRightValue(int parentIndex) {
        int rightChildIndex = getRightChildIndex(parentIndex);
        return getValue(rightChildIndex);
    }

    int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }


    int getTreeLength() {
        return arrayList.size();
    }

   /* int getParentIndex(int childIndex) {
        int o = childIndex;
        return (o - 1) / 2;
    }*/

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
        if (koncowyElement == 0) {
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
                addAtIndex(parentIndex);                    //zastosowanie rekursywnie
            }
        }
    }

    Integer getValue(int index) {
        return arrayList.get(index);
    }

    boolean isLeaf(int index) {
        return (2 * index) + 2 > arrayList.size();
    }

    boolean hadLeftChild(int index) {
        return 2 * index + 1 < arrayList.size();
    }

    boolean hadRightChild(int index) {
        return (2 * index + 2) < arrayList.size();
    }


    private void remove() {
        int lastElementIndex = arrayList.size() - 1;
        int headValue;
        if(lastElementIndex < 0){
            return;
        }
        int lastValue = arrayList.remove(lastElementIndex);
        if(lastElementIndex == 0){
            headValue = lastValue;
        }else{
            headValue = getValue(0);
            arrayList.set(0, lastValue);//zamiana 3 z 25
            int currentIndex = 0;

            removeSwap(currentIndex);
        }

        System.out.println("Remove value: " + headValue);

    }

    private void removeSwap(int currentIndex) {
        if (isLeaf(currentIndex)) {
            return;
        }
        int highestChildIndex = removeFrom(currentIndex);

        int currentValue = getValue(currentIndex);
        int highestChildValue = getValue(highestChildIndex);

        if(currentValue < highestChildValue ){
            arrayList.set(currentIndex, highestChildValue);
            arrayList.set(highestChildIndex, currentValue);
            removeSwap(highestChildIndex);
        }

    }

    private int removeFrom (int currentIndex){
        int highestChildIndex=-1;
        if (hadLeftChild(currentIndex) && hadRightChild(currentIndex)) {
            int leftChildIndex = getLeftChildIndex(currentIndex);
            int leftValue = getValue(leftChildIndex);
            int rightChildIndex = getRightChildIndex(currentIndex);
            int rightValue = getValue(rightChildIndex);

            if (leftValue > rightValue) {
                highestChildIndex = leftChildIndex;
            } else {
                highestChildIndex = rightChildIndex;
            }
        } else if (hadLeftChild(currentIndex)) {
            highestChildIndex = getLeftChildIndex(currentIndex);
        }
        return highestChildIndex;
    }





}
