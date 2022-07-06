package Set;
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        System.out.println(notas);

        //System.out.println("Exiba a posição da nota 5.0: ");

        //System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

        //System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        //System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        //System.out.println("Remova a nota da posição 0");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        Collections.addAll(notas2, 7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());

    }
}
