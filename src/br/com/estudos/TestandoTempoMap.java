package br.com.estudos;

import java.util.*;

public class TestandoTempoMap {

    public static void main(String[] args) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        long inicioDaContagem = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, i);
        }

        long finalDaContagem = System.nanoTime();
        long duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do add HashMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            treeMap.put(i, i);
        }

        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do add TreeMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            linkedHashMap.put(i, i);
        }

        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do add LinkedHashMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        hashMap.remove(5000);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo de remoção HashMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        treeMap.remove(5000);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo de remoção TreeMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        linkedHashMap.remove(5000);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo de remoção LinkedHashMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        hashMap.get(76543);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do get HashMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        treeMap.get(76543);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do get TreeMap: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        linkedHashMap.get(76543);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do get LinkedHashMap: " + duracao);

    }
}
