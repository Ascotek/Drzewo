package pl.karpielpaulina.structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
       /* ArrayList <String> arrayList = new ArrayList<> ();
        List linkedList = new LinkedList();
        arrayList.add("Klej");
        arrayList.get(0);
        arrayList.remove(1);*/

     /*   CustomArrayList list = new CustomArrayList();
        list.add("Kasia");
        list.add("Basia");
        list.add("Jola");
        list.add("Ania");
        list.add("Monika");


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.length());
        list.remove(2);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("--------------------");
        for(int i=0; i<list.length();i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.length());



    }*/
        CustomLinkedList list = new CustomLinkedList();
        list.add("Kasia");
        list.add("Basia");
        list.add("Jola");
        list.add("Ania");
        list.add("Monika");
        list.add("P");
        list.add("L");
        list.add("Jola");
        list.add("Ania");
        list.add("Monika");

        System.out.println("--------------------");

        System.out.println();
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.length());

        System.out.println("--------------------");

        list.remove(1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.length());

        System.out.println("--------------------");


        list.printAll();




    }


    }
