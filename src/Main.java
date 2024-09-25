
public class Main {
    public static void main(String[] args) {
        // Criando Try e Catch para retorno de tratativa de erros
        try {
            // Passar todos os parâmetros ao criar o objeto Filme
            Filme filme = new Filme("LongLegs", 120 , Filme.Genero.Terror);

            System.out.println("Filme criado: " + filme.getTitulo() );
            System.out.println("Duração:" + filme.getMinutos());
            System.out.println("Genero:" + filme.getGenero());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}