import java.util.Scanner;

public class Carro {
    Scanner scanner = new Scanner(System.in);
    String marca;
    String modelo;
    String cor;
    float motor;
    int aro;
    int combustivel = 0;
    boolean partida = false;
//    boolean turbo = false;
//    boolean rebaixado = false;

    void status(){
        System.out.println(this.marca + " " + this.modelo);
        System.out.println(this.cor);
        System.out.println("Aro "+ this.aro);
        System.out.println("Motor " + this.motor);
    }

    void ligar(){
        if (this.combustivel > 5) {
            System.out.println("Ligando Carro...");
            System.out.println(this.modelo + " Ligado!");
        } else {
            System.out.println("Carro sem combustível!");
            this.abastecer();
        }
    }

    void abastecer(){
        int valorAbastecido;
        System.out.println("Quanto de combustivel deseja colocar?");
        valorAbastecido = scanner.nextInt();
        this.combustivel = valorAbastecido / 5;
        System.out.println("Quantidade de litros no tanque: " + this.combustivel);
        this.ligar();

    }

    void trocaAro() {
        System.out.print("Qual aro deseja colocar: ");
        this.aro = scanner.nextInt();

        this.status();
    }

}
