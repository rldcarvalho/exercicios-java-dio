package Listas;
/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
import java.text.DecimalFormat;
import java.util.*;

public class Exercicio1 {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        /*
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite a média da temperatura do mês " + (i + 1) + " :");
            double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);
        }
         */
        Collections.addAll(temperaturas, 30.0, 28.0, 27.0, 25.0, 20.0, 15.0);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = (soma/temperaturas.size());

        System.out.println("Média das temperaturas: " + df.format(media) );

        System.out.println("Meses com a temperatura acima da média: ");

        Iterator<Double> iterator1 = temperaturas.iterator();
        int contador = 0;
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            contador++;
            if (next > media){
                switch (contador){
                    case 1:
                        System.out.println(contador + " Janeiro, Temperatura: " + next);
                        break;
                    case 2:
                        System.out.println(contador + " Fevereiro, Temperatura: " + next);
                        break;
                    case 3:
                        System.out.println(contador + " Março, Temperatura: " + next);
                        break;
                    case 4:
                        System.out.println(contador + " Abril, Temperatura: " + next);
                        break;
                    case 5:
                        System.out.println(contador + " Maio, Temperatura: " + next);
                        break;
                    case 6:
                        System.out.println(contador + " Junho, Temperatura: " + next);
                        break;
                    default: break;
                }
            }
        }
    }
}
