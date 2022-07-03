package controleFluxo;

public class ControleFluxo {
    public static void main(String[] args) {
        int numeroMes = 9;

        if (numeroMes == 1){
            System.out.println("Janeiro");
        } else if (numeroMes == 2) {
            System.out.println("Fevereiro");
        }else if (numeroMes == 3) {
            System.out.println("Março");
        }else if (numeroMes == 4) {
            System.out.println("Abril");
        }else if (numeroMes == 5) {
            System.out.println("Maio");
        }else if (numeroMes == 6) {
            System.out.println("Junho");
        }else if (numeroMes == 7) {
            System.out.println("Julho");
        }else if (numeroMes == 8) {
            System.out.println("Agosto");
        }else if (numeroMes == 9) {
            System.out.println("Setembro");
        }else if (numeroMes == 10) {
            System.out.println("Outubro");
        }else if (numeroMes == 11) {
            System.out.println("Novembro");
        }else if (numeroMes == 12) {
            System.out.println("Dezembro");
        }

        String mes = "julho";
        if (mes == "janeiro" || mes == "julho" || mes == "dezembro"){
            System.out.println("Férias");
        }

        String diaSemana = "sexta";

        switch (diaSemana){
            case ("segunda"):
                System.out.println(2);
                break;
            case ("terça"):
                System.out.println(3);
                break;
            case ("quarta"):
                System.out.println(4);
                break;
            case ("quinta"):
                System.out.println(5);
                break;
            case ("sexta"):
                System.out.println(6);
                break;
            case ("sabado"):
                System.out.println(7);
                break;
            case ("domingo"):
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
        }

        int num = 3;

        switch (num){
            case (1):
            case (2):
            case (3):
                System.out.println("Certo");
                break;
            case (4):
                System.out.println("Errado");
                break;
            case (5):
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }

}
