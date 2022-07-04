package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.print("Digite a tabuada a ser exibida de 1 a 10: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada + ":");

        for (int i = 1; i < 11; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

    }
}
