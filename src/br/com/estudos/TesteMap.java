package br.com.estudos;

import java.util.*;

//Map nao suporta elementos duplicados
//HashMap nao é synchronized
//Hashtable é synchronized
//HashMap é mais rapido que Hashtable
//TreeMap nao é Synchronized
//TreeMap é ordenado "a-z"
public class TesteMap {

    public static void main(String[] args) {

        Map<String, String> teste = new /* Hashtabel */HashMap<>();
        SortedMap<String, String> teste1 = new TreeMap<>();

        teste.put("carro", "corsa");
        teste.put("moto", "honda");
        teste.put("carro", "celta");
        teste.put("chevrolet", "celta");

        teste1.put("carro", "corsa");
        teste1.put("moto", "honda");
        teste1.put("carro", "celta");
        teste1.put("chevrolet", "celta");

        Set<String> keys = teste.keySet();

        for (String key : keys ) {
            System.out.println(key + " " + teste.get(key));
        }

        System.out.println();

        System.out.println(teste.get("carro"));

        Set<Map.Entry<String, String>> teste2 = teste.entrySet();

        System.out.println();

        for (Map.Entry<String, String> e : teste2) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("===================================================================");

        for (String key : keys ) {
            System.out.println(key + " " + teste1.get(key));
        }

        System.out.println();

        System.out.println(teste1.get("carro"));

        Set<Map.Entry<String, String>> teste3 = teste1.entrySet();

        System.out.println();

        for (Map.Entry<String, String> e : teste3) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
