package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class ex2Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Digite a nota entre 0 e 10");
            nota = scan.nextInt();

            if(nota <= 10 && nota >= 0){
                break;
            }

            System.out.println("Nota inválida...");
        }




    }
}
