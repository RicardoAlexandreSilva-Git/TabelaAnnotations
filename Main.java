import factory.TabelaFactory;
import model.Usuario;
import service.TabelaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TabelaService<Usuario> service = new TabelaService<>();
        boolean rodando = true;

        while(rodando) {
            System.out.println("\nDigite uma palavra:");
            String palavra = s.nextLine();

            Usuario usuario = TabelaFactory.criarUsuario(palavra);
            service.adicionar(usuario);

            System.out.println("\n1 - Continuar");
            System.out.println("2 - Mostrar tabela");
            System.out.println("3 - Sair");

            int opcao = Integer.parseInt(s.nextLine());

            switch (opcao) {
                case 1:
                    break;

                case 2:
                    service.mostrarTabela();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        System.out.println("\nPrograma encerrado.");
    }

}
