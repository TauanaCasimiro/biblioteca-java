import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
 
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.titulo + " - " + livro.autor + " (" + livro.ano + ")");
        }
    }
}