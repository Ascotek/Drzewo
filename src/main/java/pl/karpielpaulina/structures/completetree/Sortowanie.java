package pl.karpielpaulina.structures.completetree;

public class Sortowanie {
    public static void main(String[] args) {
        Sortowanie kopiec = new Sortowanie();

        int tab[] = {12, 11, 9, 8, 1, 100};
        int n = tab.length;

        kopiec.sortowanieTab(tab);

        System.out.println("Posortowany kopiec: " );

        wyswietlanieTablicy(tab);
    }
    void budowanie (int tab[], int n, int i){
        int najwieksza = i;  // inicjalizacja najwiekszej liczby jako korzen
        int l = 2*i + 1;  // lewy
        int r = 2*i + 2;  //prawy


        //Jezeli lewe dziecko jest wieksze niz korzen
        if (l < n && tab[l]>tab[najwieksza]) {
            najwieksza = l;
        }

        //Jezeli prawe dziecko jest wieszke niz liczba najwieksza
        if(r<n && tab[r]>tab[najwieksza]){
            najwieksza = r;
        }

        //Jezeli liczba najwieskza nie jest korzeniem
        if(najwieksza != i){
            int zamiana = tab[i];
            tab[i] = tab[najwieksza];
            tab[najwieksza] = zamiana;

            //Ostateczne dzrewo
            budowanie(tab, n, najwieksza);

        }
    }
    public void sortowanieTab(int tab[]){
        int n = tab.length;

        //Tworzenie kopca

        for(int i=n/2-1; i>=0; i--){
            budowanie(tab, n, i);
        }

        //Jeden po drugim wyodrebnia element z kopca
        for(int i=n-1; i>=0; i--){
            //przesuniecie obecnego korzenia na koniec
            int temp = tab[0];
            tab[0] = tab[i];
            tab[i] = temp;

            //max wartosc kopca
            budowanie(tab,i,0);
        }
    }

    static void wyswietlanieTablicy (int tab[]){
        int n = tab.length;
        for(int i=0; i<n; ++i){
            System.out.println(tab[i] + " ");
        }
        System.out.println();
    }
}
