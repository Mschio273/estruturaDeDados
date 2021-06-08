package br.com.estudos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestandoTempoSet {

    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();

        long inicioDaContagem = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        long finalDaContagem = System.nanoTime();
        long duracao = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do add HashSet: " + duracao);

        System.out.println("==================================================================================");

        inicioDaContagem = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            treeSet.add(i);
        }
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do add TreeSet: " + duracao);

        System.out.println("==================================================================================");
        inicioDaContagem = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            linkedSet.add(i);
        }
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;
        System.out.println("Tempo do add LinkedHashSet: " + duracao);

    }
}
