package CalcularAreaComReturn;

public class CalcularArea {

    public static double area(double lado){
        return (lado * lado);
    }

    public static double area(double ladoA, double ladoB){
        return (ladoA * ladoB);
    }

    public static double area(double ladoMaior, double ladoMenor, double altura){
        return ((ladoMaior + ladoMenor) / 2) * altura;
    }

}
