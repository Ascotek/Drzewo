package pl.karpielpaulina.structures.sorting;

public class BoubleSort {


    int[] sort(int[] array) {
        int current = 0;
        int change = 1;
        while (change > 0) {
            change = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {           //rosnaca tablica, jak zmienie znak na przeciwny to wartosci beda od wiekszej do mniejszej
                    current = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = current;
                    change++;
                }
            }
        }
        return array;
    }
}
