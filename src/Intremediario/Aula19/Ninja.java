package Intremediario.Aula19;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    RankNinja rank;

    // Atributo imutável (constante)
    final double altura = 1.80;

    // Construtor Padrão
    public Ninja() {
    }

    // Construtor com parâmetros essenciais
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Sobrecarga de Construtor (com missões e rank)
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Método que pode ser sobrescrito pelas subclasses
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial.");
    }

    // Método final: não pode ser sobrescrito por nenhuma classe filha
    public final void tacarKunai() {
        System.out.println("Sou um método da classe MAE! Tacando kunai...");
    }

    // Sobrecarga do método Inteligencia de Combate (sem parâmetro)
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha inteligência de combate.");
    }

    // Sobrecarga do método Inteligencia de Combate (com parâmetro)
    @Override
    public void inteligenciaDeCombate(int qi) {
        System.out.println("Meu nome é " + nome + " e minha inteligência de combate (QI) é: " + qi);
    }

    @Override
    public String toString() {
        return "Ninja {" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", missoes=" + numeroDeMissoesConcluidas +
                ", rank=" + rank +
                ", altura=" + altura +
                '}';
    }
}