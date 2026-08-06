package Intremediario.Aula13a15;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir 2 novos atributos missoaes concluidas e um rank

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    RankNinja rank;



    public void habilidadeEspecial(){

        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial ");
    }

    public Ninja(){

    }
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //Sobrecarga de Metodo Inteligencia de combate
    public void inteligenciaDeCombate(){

        System.out.println("Meu nome é " + nome + " e essa minha inteligencia de combate");
    }

    public void inteligenciaDeCombate(int qi) {

        System.out.println("Meu nome é " + nome + " e essa minha inteligencia de combate " + qi);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
