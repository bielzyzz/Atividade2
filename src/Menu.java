import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("============ MENU ===========");
            System.out.println("= 1. Criar Gato             =");
            System.out.println("= 2. Criar Cachorro         =");
            System.out.println("= 3. Sair                   =");
            System.out.print  ("===== SELECIONE UMA OPÇÃO:   ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do gato: ");
                    String nomeGato = scanner.next();
                    Gato gato = new Gato(nomeGato);
                    gato.descricao();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Digite o nome do cachorro: ");
                    String nomeCachorro = scanner.next();
                    Cachorro cachorro = new Cachorro(nomeCachorro);
                    cachorro.descricao();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}