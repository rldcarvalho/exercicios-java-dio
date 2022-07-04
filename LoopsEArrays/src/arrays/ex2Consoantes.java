package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class ex2Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palavra;
        int quantidadeConsoantes = 0;
        System.out.println("Entre com a palavra: ");
        palavra = scan.next();
        String[] array =palavra.split("(?!^)");
        List<String> consoantes = new ArrayList<String>();

        boolean temVogais;

        for (int i = 0; i < array.length; i++) {
            temVogais = (array[i].equalsIgnoreCase("a") |
                    array[i].equalsIgnoreCase("e") |
                    array[i].equalsIgnoreCase("i") |
                    array[i].equalsIgnoreCase("o") |
                    array[i].equalsIgnoreCase("u"));
            if(!temVogais){
                consoantes.add(array[i]);
                quantidadeConsoantes++;
            }
        }

        System.out.println("Total de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes);



    }
}
