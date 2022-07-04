package loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ex4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int numero;

        System.out.print("Digite a quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {

            System.out.print("Digite um número: ");
            numero = scan.nextInt();

            if ((numero % 2) == 0){
                quantidadePares++;
            }else{ quantidadeImpares++;}
        }

        System.out.println("Quantidade de números pares = " + quantidadePares);
        System.out.println("Quantidade de números impares = " + quantidadeImpares);

    }

}
