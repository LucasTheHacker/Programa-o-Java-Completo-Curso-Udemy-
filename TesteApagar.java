package application;

import java.util.ArrayList;
import java.util.List;

public class TesteApagar {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (Integer elemento : list) {
            System.out.println(elemento);
        }

        list.add(2, 25); // Utilizando a sobrecarga de posição

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.size()); // Tamanho

        list.remove(2); //Index
        
        list.removeIf(x -> x.charAt(0) == 'M';)

        for (Integer integer : list) {
            System.out.println(integer);
        }
        
    }

}
