package Intremediario.Aula19;

public class Uzumaki extends Ninja {

    Biju biju;


    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki (Rasengan)!");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Aproveitar a enorme quantidade de chakra e vencer o inimigo no cansaço!");
    }
}