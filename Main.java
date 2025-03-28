

import java.util.Scanner;

public class Main {
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        biblioteca.adicionarLivro(new Livro("Java para Iniciantes", "José Silva", "Tecnologia"));
        biblioteca.adicionarLivro(new Livro("Design Patterns", "Erich Gamma", "Tecnologia"));
        biblioteca.adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Ficção"));
        biblioteca.adicionarLivro(new Livro("A Arte da Guerra", "Sun Tzu", "Filosofia"));

        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Listar livros");
            System.out.println("2. Emprestar livro");
            System.out.println("3. Devolver livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;
                case 2:
                    System.out.print("Digite o título do livro para emprestar: ");
                    String tituloEmprestimo = scanner.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestimo);
                    break;
                case 3:
                    System.out.print("Digite o título do livro para devolver: ");
                    String tituloDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(tituloDevolucao);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcaoo invalida.");
            }
        }
    }
}
