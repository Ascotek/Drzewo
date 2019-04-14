package pl.karpielpaulina.structures;

import javax.print.attribute.standard.QueuedJobCount;
import java.util.*;

public class SetApp {
    public static void main(String[] args) {
        Set<Integer > set  = new HashSet<>();
        set.add(56);
        set.add(3);
        set.add(5);
        set.add(777);
        set.add(8);

        for (Integer integer : set) {
            System.out.println(integer);
        }



        Set<Integer > set2  = new TreeSet<>();
        Set<Integer > set3  = new LinkedHashSet<>();

        System.out.println("------------------");

        StosApp stos = new StosApp();

        stos.push("Pawel");
        stos.push("Piotr");
        stos.push("Asia");
        stos.push("Pa");
        System.out.println(stos.pop());
        System.out.println(stos.pop());

        System.out.println("------------------");

        QueueApp kolejka = new QueueApp();

        kolejka.add("Pawel");
        kolejka.add("Iza");
        kolejka.add("P");

        System.out.println(kolejka.pull());
        System.out.println("------------------");

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Paula");

        System.out.println(map.get(2));

        System.out.println("------------------");



}}

