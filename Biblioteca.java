
import java.util.*;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    livro.emprestar();
                    System.out.println("Emprestimo realizado com sucesso!");
                } else {
                    System.out.println("O livro não está disponível no momento.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros na biblioteca.");
            return;
        }
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
