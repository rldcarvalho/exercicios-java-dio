package OrientacaoAObjetos;

public class Carro {
    public static void main(String[] args) {

        Carro carro1 = new Carro("prata", "fox", 50);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());

        carro1.setCor("preto");

        System.out.println(carro1.encherTanque(6.99));
        System.out.println(carro1.getCor());
    }
    String cor;

    String modelo;

    int capacidadeTanque;

    public Carro(){
        
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double encherTanque(Double precoGasolina) {
        return precoGasolina * this.capacidadeTanque;
    }
}
