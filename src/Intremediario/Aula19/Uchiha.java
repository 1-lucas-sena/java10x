package Intremediario.Aula19;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha (Jutsu Bola de Fogo)! Completei " + numeroDeMissoesConcluidas + " missões.");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Usar o Sharingan no início para prever os movimentos e encerrar a batalha rapidamente.");
    }
}