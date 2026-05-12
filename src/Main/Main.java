package Main;

import exceptions.OpcaoInvalidaException;
import exceptions.PalavraInvalidaException;
import factory.TabelaFactory;
import model.Usuario;
import service.TabelaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TabelaService<Usuario> service = new TabelaService<>();
        boolean rodando = true;

        while (rodando) {
            try {
                System.out.println("\nDigite uma palavra:");
                String palavra = s.nextLine();
                service.validarPalavra(palavra);

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

                    case 3:
                        rodando = false;
                        break;

                    default:
                        throw new OpcaoInvalidaException("Opção inválida.");
                }
            } catch (PalavraInvalidaException e) {

                System.out.println("\nErro de validação: " + e.getMessage()
                );

            } catch (OpcaoInvalidaException e) {

                System.out.println("\nErro no menu: " + e.getMessage()
                );

            } catch (NumberFormatException e) {

                System.out.println("\nDigite apenas números no menu.");

            } catch (Exception e) {

                System.out.println("\nErro inesperado: " + e.getMessage());
                System.out.println("\nPrograma encerrado.");
            }

        }
    }
}