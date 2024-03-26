package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // Posicao, Elemento

        System.out.println(list.size());

        list.remove("Anna"); // Percorre a lista procurando a string. (Custo computacional elevado)
        // É possível remover com base em predicado

        for (String listElement : list) {
            System.out.println(listElement);
        }
        System.out.println("----------------------");

        list.removeIf(x -> x.charAt(0) == 'M');// Função lambda predicado

        for (String listElement : list) {
            System.out.println(listElement);
        }

        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        // Quando não acha o elemento, retorna index -1
        System.out.println("---------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String listElement : result) {
            System.out.println(listElement);
        }

    }
}
