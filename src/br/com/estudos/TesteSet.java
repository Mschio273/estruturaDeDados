package br.com.estudos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Set nao suporta elementos duplicados
//HashSet nao mostra os valores em sequencia
//TreeSet mostra os valores em sequencia

public class TesteSet {
    public static void main(String[] args) {

        Set<Integer> teste1 = new HashSet<>();
        Set<Integer> teste2 = new TreeSet<>();

        System.out.println(teste1.add(52));
        System.out.println(teste1.add(97));
        System.out.println(teste1.add(34));
        System.out.println(teste1.add(69));
        System.out.println(teste1.add(97));

        System.out.println(teste1);

        System.out.println(teste2.add(52));
        System.out.println(teste2.add(97));
        System.out.println(teste2.add(34));
        System.out.println(teste2.add(69));
        System.out.println(teste2.add(97));

        System.out.println(teste2);
    }
}
