package br.com.estudos;

import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("teste1");
        queue.add("teste2");
        queue.add("teste3");
        queue.add("teste4");
        queue.add("teste5");

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);



    }
}
