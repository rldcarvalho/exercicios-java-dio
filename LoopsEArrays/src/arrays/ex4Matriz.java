package arrays;

import java.util.Arrays;
import java.util.Random;

public class ex4Matriz {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println(Arrays.deepToString(matriz));
    }
}
