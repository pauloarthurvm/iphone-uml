import java.util.Scanner;

public class NavegadorInternet {

    public void exibirPagina(Scanner scanner) {
        System.out.println("Qual pagina deseja exibir?");
        String pagina = scanner.nextLine();
        System.out.println("Abrindo a pagina: " + pagina);
    }

    public void adicionarAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando nova pagina.");
    }


}
