public class Carro {
    String marca;
    String modelo;
    String cor;
    float motor;
    int aro;
    int combustivel = 0;
    boolean turbo = false;
    boolean partida = false;

    void status(){
        System.out.println(this.marca + " " + this.modelo);
        System.out.println(this.cor);
        System.out.println("Aro "+ this.aro);
        System.out.println("Motor " + this.motor);
    }

}
