package Avancado.Stream;

public class Ninja {
    private String nome;
    private String Vila;
    private int idade;


    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        Vila = vila;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", Vila='" + Vila + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVila() {
        return Vila;
    }

    public void setVila(String vila) {
        Vila = vila;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
