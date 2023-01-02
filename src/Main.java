public class Main {
    public static void main(String[] args) {
        Caneta canetaPreta = new Caneta();

        canetaPreta.cor = "Preta";
        canetaPreta.modelo = "Bic Cristal";
        canetaPreta.ponta = 0.5f;
        canetaPreta.carga = 95;
        canetaPreta.destampar();
        canetaPreta.status();
        canetaPreta.rabiscar();

        Caneta canetaVermelha = new Caneta();
        canetaVermelha.modelo = "Bic Cristal";
        canetaVermelha.cor = "Vermelha";
        canetaVermelha.ponta = 0.7f;
        canetaVermelha.carga = 77;
        canetaVermelha.status();
        canetaVermelha.rabiscar();
    }
}