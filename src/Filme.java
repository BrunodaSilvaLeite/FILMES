// Classe Filme
public class Filme {
    //Encapsular Atributos
    private String titulo;
    private int minutos;
    private Genero genero;

    //garantindo que o valor atribuído a genero só pode ser um dos valores especificados
    public enum Genero {
        Terror, Comédia, Romance
    }

    // Metodo construtor que exige alguns parametros
    public Filme(String titulo, int minutos, Genero genero) throws Exception {
        setTitulo(titulo);
        setMinutos(minutos);
        setGenero(genero);
    }

    // GetTitulo para retornar o titulo
    public String getTitulo() {
        return titulo;
    }
    // GetMinutos para retornar os minutos
    public int getMinutos() {
        return minutos;
    }

    // GetGenero para retornar o genero
    public Genero getGenero() {
        return genero;
    }

    // Metodo que recebe valor do titulo e valida se não esta vazio
    public void setTitulo(String titulo) throws Exception {
      /* Eu inicialmente tentei usar 'titulo == ""' para verificar se a string estava vazia, mas isso não funcionou.
        Por isso, utilizei 'trim()' e 'isEmpty()' para validar e garantir que a string não tivesse apenas espaços em branco. */

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new Exception("O Título está vazio.");
        }
        this.titulo = titulo;
    }

    // Metodo que recebe um valor em minutos e valida se não é menor ou igual a 0
    public void setMinutos(int minutos) throws Exception {
        if (minutos <= 0) {
            throw new Exception("A duração deve ser maior que zero.");
        }
        this.minutos = minutos;
    }

    // Metodo que recebe um genero de filme e set o genero
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}