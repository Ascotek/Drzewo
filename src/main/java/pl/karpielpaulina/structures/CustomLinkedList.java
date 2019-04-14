package pl.karpielpaulina.structures;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList {

    private CustomNode root = null;
    private CustomNode tail = null;


    void add(String value) {
        if (root == null) {
            CustomNode newNode = new CustomNode();
            newNode.setData(value);
            root = newNode;
            tail = newNode;
        } else {
            CustomNode newNode = new CustomNode();
            newNode.setData(value);
            tail.setNext(newNode);
            tail = newNode;

        }

    }

    String get(int index) {

        int count = 0;
        CustomNode temp = root;
        while (temp != null) {
            if (index == count) {
                return temp.getData();
            }
            count++;
            temp = temp.getNext();

        }
        return null;
    }

    void remove(int indexToRemove) {
        int count = 0;
        CustomNode temp = root;
        while (temp != null) {

            if (indexToRemove - 1 == count) {                 //indeks mnijeszy o 1
                CustomNode next = temp.getNext().getNext(); //ustawia na 4 element
                temp.setNext(next);                        //ustawia na 2

                return;
            } else {
                count++;
                temp = temp.getNext();
            }
        }


    }

    int length() {
        int count = 0;
        CustomNode temp = root;
        while (temp != null) {
            temp = temp.getNext();
            count++;
        }
        return count;

    }
    void printAll(){
        int count = 0;
        CustomNode temp = root;
        while (temp != null) {
            System.out.println(temp.getData());
            count++;
            temp = temp.getNext();

        }
    }
}
