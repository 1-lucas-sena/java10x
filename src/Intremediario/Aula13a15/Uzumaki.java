package Intremediario.Aula13a15;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Aproveitar a quantidade de chakara e vencer no cansaço.");
    }
}
