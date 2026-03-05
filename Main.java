public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
biblioteca.listarLivros();
        System.out.println("Livros adicionados com sucesso!");
    }

}