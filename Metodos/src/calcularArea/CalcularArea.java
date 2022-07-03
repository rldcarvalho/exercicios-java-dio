package calcularArea;

public class CalcularArea {

    public static void area(double lado){
        System.out.println("A área do quadrado é " + (lado * lado));
    }

    public static void area(double ladoA, double ladoB){
        System.out.println("A área do retângulo é " + (ladoA * ladoB));
    }

    public static void area(double ladoMaior, double ladoMenor, double altura){
        System.out.println("A área do trapézio é " + ((ladoMaior + ladoMenor) / 2) * altura);
    }

}
