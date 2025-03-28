import java.util.Scanner;

public class AparelhoTelefonico {

    boolean estaEmLigacao;
    int mensagensDeVoz;

    AparelhoTelefonico() {
        estaEmLigacao = false;
        mensagensDeVoz = 0;
    }

    public void ligar(Scanner scanner) {
        System.out.println("Para quem quer ligar?");
        long numero = scanner.nextLong();
        estaEmLigacao = true;
        System.out.println("Voce ligou para " + numero);
        estaEmLigacao = false;
    }

    public void atender() {
        System.out.println("Atendendo ligacacao...");
        estaEmLigacao = true;
        System.out.println("Voce esta em ligacao");
        estaEmLigacao = false;
        System.out.println("Ligacao terminada");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Você tem " + mensagensDeVoz + " mensagens de voz");
        while(mensagensDeVoz > 0) {
            System.out.println("Ouvindo mensagem " + mensagensDeVoz);
            mensagensDeVoz--;
        }
        System.out.println("Não há mensagens de voz.");
    }

}
