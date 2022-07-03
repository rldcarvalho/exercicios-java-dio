package CalcularAreaComReturn;

public class Main {
    public static void main(String[] args) {
        double quadrado = CalcularArea.area(3);
        System.out.println("A área do quadrado é " + quadrado);

        double retangulo = CalcularArea.area(3, 5);
        System.out.println("A área do retângulo é " + retangulo);

        double trapezio = CalcularArea.area(3, 5, 7);
        System.out.println("A área do trapézio é " + trapezio);
    }
}
