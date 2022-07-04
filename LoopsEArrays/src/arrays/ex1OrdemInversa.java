package arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
import java.util.Arrays;
import java.util.Scanner;

public class ex1OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
