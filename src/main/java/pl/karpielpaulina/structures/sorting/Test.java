package pl.karpielpaulina.structures.sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BoubleSort sortBouble = new BoubleSort();

        int []tab = {3,3,2,56,12,2,2,5,7,7,18};

        int[] sort = sortBouble.sort(tab);

        for (int i=0; i<sort.length; i++){
            System.out.println(sort[i]);
        }

        System.out.println("----------------");

        CoutingSort couting = new CoutingSort();

        int sorts [] = couting.coutingSort(tab);

        for (int i : sorts) {
            System.out.print(i + " ");
        }





    }
}
