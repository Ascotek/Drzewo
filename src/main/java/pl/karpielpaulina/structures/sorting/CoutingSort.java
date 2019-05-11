package pl.karpielpaulina.structures.sorting;

public class CoutingSort {


    int []coutingSort (int [] tab){


        int biggestElement = Integer.MIN_VALUE;;
        int smallestElement = Integer.MAX_VALUE;

        for (int value : tab) {
            if(value> biggestElement){
                biggestElement = value;
            }
            if(value< smallestElement){
                smallestElement = value;
            }
        }
        int [] pom = new int [biggestElement - smallestElement +1];

        for(int i=0; i<tab.length; i++){
            int value = tab[i];
            pom[value-smallestElement]++;

        }
        System.out.println("POM");
        for (int i : pom) {
            System.out.print(i + " ");
        }
        System.out.println("POM");


        int []tablica = new int[tab.length];
        int index = 0;
        for (int i = 0; i < pom.length; i++) {
            for (int j = 0; j < pom[i]; j++, index ++) {
                tablica[index] = i + smallestElement;
            }
        }
        return tablica;
    }

}
