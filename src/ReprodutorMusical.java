import java.util.Scanner;

public class ReprodutorMusical {

    boolean estaTocandoMusica;
    String musicaSelecionada;

    ReprodutorMusical() {
        estaTocandoMusica = false;
        musicaSelecionada = "";
    }

    public void tocarPausar() {
        estaTocandoMusica = !estaTocandoMusica;
        if (estaTocandoMusica) {
            System.out.println("Musica está TOCANDO.\n");
        } else {
            System.out.println("Musica esta PAUSADA.\n");
        }
    }

    public void selecionarMusica(Scanner scanner) {
        System.out.println("Selecione uma musica");
        System.out.println("1 - Backstreet Boys");
        System.out.println("2 - Avril Lavine");
        System.out.println("3 - Johnny Cash");
        System.out.println("4 - U2");
        int musica = scanner.nextInt();
        switch (musica) {
            case 1:
                musicaSelecionada = "Backstreet Boys";
                break;
            case 2:
                musicaSelecionada = "Avril Lavine";
                break;
            case 3:
                musicaSelecionada = "Johnny Cash";
                break;
            case 4:
                musicaSelecionada = "U2";
                break;
        }
        System.out.println("\nA musica selecionada é: " + musicaSelecionada + "\n");
    }

}
