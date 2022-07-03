package cumprimento;

import java.util.Scanner;
/*O objetivo do exercício era incentivar a criação de diversos métodos*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hora;
        String mensagem;

        System.out.println("Digite o horário no formato 24h: ");
        hora = scan.nextInt();

        if (hora >= 6 && hora < 12){
            mensagem = bomDia();
        } else if (hora >= 12 && hora < 18) {
            mensagem = boaTarde();
        } else { mensagem = boaNoite();};

        exibeCumprimento(mensagem);

    }

    public static String bomDia(){return "Bom Dia";};
    public static String boaTarde(){return "Boa Tarde";};
    public static String boaNoite(){return "Boa Noite";};
    public static void exibeCumprimento(String mensagem){System.out.println(mensagem);};

}
