package arrays;

import java.util.Arrays;
import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class ex3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        double[] array = new double[20];
        double[] sucessor = new double[20];

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(100);
            sucessor[i] = array[i] + 1;
        }

        System.out.println("Array: \n" + Arrays.toString(array));
        System.out.println("Array de sucessores: \n" + Arrays.toString(sucessor));
    }
}
