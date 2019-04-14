package pl.karpielpaulina.structures;

import java.util.ArrayList;

public class CustomArrayList {

    String[] data = new String[5];
    int i = 0;

    void add(String value) {
        data[i] = value;
        i++;
    }

    String get(int index) {
        if (index > data.length) {

        }
        return data[index];
    }

    void remove(int index) {

        data[index] = null;

        for (int i = index; i < length() - 1; i++) {
            data[i] = data[i + 1];
        }
        i--;

    }

    int length() {
        return i;
    }

    void remove(String values) {

    }

}
