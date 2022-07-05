package Listas;
/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Responda as perguntas a seguir com 's' para sim e 'n' para não.");
        System.out.print("Telefonou para vítima? ");
        respostas.add(scan.next());
        System.out.print("Esteve no local do crime? ");
        respostas.add(scan.next());
        System.out.print("Mora perto da vítima? ");
        respostas.add(scan.next());
        System.out.print("Devia para vítima? ");
        respostas.add(scan.next());
        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(scan.next());

        //System.out.println(respostas);

        Iterator<String> contador = respostas.iterator();
        int quantidadeSim = 0;
        while (contador.hasNext()){
            String resposta = contador.next();
            if (Objects.equals(resposta, "s")){
                quantidadeSim++;
            }
        }

        //System.out.println(quantidadeSim);

        switch(quantidadeSim) {
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente"); break;
        }
    }

}
