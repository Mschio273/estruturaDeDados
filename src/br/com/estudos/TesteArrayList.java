package br.com.estudos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {

        List<String> lista = new /*LinkedList*/ArrayList<>();

        lista.add("hello");
        lista.add("world");
        lista.add("cruel");

//        lista.remove(2);

        System.out.println(lista);

        for (String teste: lista) {
            System.out.println(teste);
        }

        Collections.sort(lista);

        System.out.println(lista);

    }
}
