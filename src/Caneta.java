public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada = true;

    public void status(){
        System.out.println("Caneta " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta tamanho " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);

    }
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro, Caneta tampada");
            this.destampar();
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar(){
        this.tampada = true;
        System.out.println("Tampando a caneta...");
    }

    public void destampar(){
        this.tampada = false;
        System.out.println("Destampando Caneta...");
        this.rabiscar();
    }

}
