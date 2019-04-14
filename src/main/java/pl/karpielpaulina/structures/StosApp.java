package pl.karpielpaulina.structures;

import java.util.LinkedList;

public class StosApp {

    LinkedList<String> lista = new LinkedList<>();

    String pop (){
        return lista.removeLast();
    }

    void push (String value){
        lista.add(value);
        }


    }

