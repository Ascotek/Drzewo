package pl.karpielpaulina.structures.binarytree;

import java.util.ArrayList;

public class KopiecAdd {

    public void sort(int arr[]) {
        buildHeap(arr);
        for (int i = arr.length-1; i > 0; i--) {
            swap(arr, 0, i); buildMaxHeap(arr, 0, i-1); }
    } /* Budujemy stertę */
    public static void buildHeap(int arr[]) {
        for (int i = (arr.length-1)/2; i >= 0; i--)
            buildMaxHeap(arr, i, arr.length-1);
    } /* Podmieniamy największy element w stercie */
    public static void buildMaxHeap(int arr[], int i, int N) {
        int left = 2*i ; int right = 2*i + 1;
        int max = i; if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max]) max = right;
        if (max != i) {
            swap(arr, i, max); buildMaxHeap(arr, max, N); }
    } /* Zamieniamy dwa elementy w tablicy */
    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 9, 8, 1, 100};

        KopiecAdd kopiec = new KopiecAdd();

        kopiec.sort(arr);



    }
}
