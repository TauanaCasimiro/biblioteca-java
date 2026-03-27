import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Biblioteca biblioteca = new Biblioteca();

            System.out.println("Digite o título do livro:");
            String titulo = scanner.nextLine();

            System.out.println("Digite o autor do livro:");
            String autor = scanner.nextLine();

            System.out.println("Digite o ano do livro:");
            int ano = scanner.nextInt();

            Livro novoLivro = new Livro(titulo,autor,ano);
            biblioteca.adicionarLivro(novoLivro);

            biblioteca.listarLivros();
        }
        System.out.println("Livro adicionado com sucesso!");
}
}
    