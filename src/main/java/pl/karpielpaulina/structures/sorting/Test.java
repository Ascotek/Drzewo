package pl.karpielpaulina.structures.sorting;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        BoubleSort sortBouble = new BoubleSort();

        int []tab = {3,2,55,12,5,7,18};

        int[] sort = sortBouble.sort(tab);

        for (int i=0; i<sort.length; i++){
            System.out.println(sort[i]);
        }



    }
}
