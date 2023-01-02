public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada = true;

    void status(){
        System.out.println("Caneta " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta tamanho " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, Caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar(){
        this.tampada = true;
        System.out.println("Tampando a caneta...");
    }

    void destampar(){
        this.tampada = false;
        System.out.println("Destampando Caneta...");
    }
}
