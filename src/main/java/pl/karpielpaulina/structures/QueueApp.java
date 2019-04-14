package pl.karpielpaulina.structures;

import java.util.LinkedList;

public class QueueApp {

    LinkedList<String> lista = new LinkedList<>();

    void add(String string){
        lista.add(string);
    }

    String pull() {
        return lista.removeFirst();
    }
}
