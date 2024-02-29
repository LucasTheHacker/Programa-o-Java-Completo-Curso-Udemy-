package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner input = new Scanner(System.in);
        Product produto =  new Product(); //Instancio/Crio uma variável do tipo Product

        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        produto.name = input.nextLine();
       

        System.out.print("Price: ");
        produto.price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        produto.quantity = input.nextInt();
        System.out.println();

        System.out.println(produto.toString());

        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        produto.addProducts(input.nextInt());
        
        System.out.println();
        System.out.println(produto.toString());
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        produto.removeProducts(input.nextInt());

        System.out.println();
        System.out.println(produto.toString());
        
        input.close();
    }
}
