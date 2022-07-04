package loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class ex3MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int numeroMaior = 0;
        int somatorio = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            if (numero > numeroMaior){
                numeroMaior = numero;
            }
            somatorio += numero;
        }

        System.out.println("Numero maior = " + numeroMaior);
        System.out.println("Média = " + (somatorio/5));
    }
}
