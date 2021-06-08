package br.com.estudos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestandoTempoListas {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long inicioDaContagem = System.nanoTime();

        for (int i = 0; i<1000000; i++) {
            arrayList.add(i);
        }

        long finalDaContagem = System.nanoTime();
        long duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do add ArrayList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();

        for (int i = 0; i<1000000; i++) {
            linkedList.add(i);
        }

        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do add linkedList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        arrayList.remove(5000);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo de remoção ArrayList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        linkedList.remove(5000);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo de remoção linkedList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        arrayList.get(76543);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do get ArrayList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        linkedList.get(76543);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do get linkedList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        arrayList.set(76543, 2);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do set ArrayList: " + duracao);

        System.out.println("===================================================================================");

        inicioDaContagem = System.nanoTime();
        linkedList.set(76543, 2);
        finalDaContagem = System.nanoTime();
        duracao = finalDaContagem - inicioDaContagem;

        System.out.println("Tempo do set linkedList: " + duracao);

    }
}
