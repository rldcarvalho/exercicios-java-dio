package emprestimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorEmprestado;
        int parcelas;
        double valorParcela;

        System.out.println("Digite o valor do empréstimo: ");
        valorEmprestado = scan.nextInt();
        System.out.println("Digite o numero de parcelas desejadas: ");
        parcelas = scan.nextInt();

        valorParcela = calculaEmprestimo(valorEmprestado, parcelas);

        System.out.println("O valor das prestações será de: " + valorParcela);

    }

    public static double calculaEmprestimo(double valorEmprestado, int parcelas){
        double valorParcela;
        double juros;
        double totalComJuros;

        juros = valorEmprestado * 0.02 * parcelas;
        totalComJuros = valorEmprestado + juros;
        valorParcela = totalComJuros / parcelas;

        return valorParcela;
    }
}
