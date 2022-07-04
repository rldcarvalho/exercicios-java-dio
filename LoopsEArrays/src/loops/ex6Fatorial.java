package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class ex6Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 1;

        System.out.print("entre com um numero inteiro: ");
        int numero = scan.nextInt();

        for (int i = numero; i > 0; i--) {
            total *= i;
        }

        System.out.println(numero + "! = " + total);
    }
}
