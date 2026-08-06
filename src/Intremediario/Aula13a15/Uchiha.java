package Intremediario.Aula13a15;

public class Uchiha extends Ninja {

    public Uchiha(){
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
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchira, um ataque de fogo. E ja completei " + numeroDeMissoesConcluidas + " missoes");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Uasr o Sharingan no inicio e acabar rapido a batalha");
    }

    @Override
    public void inteligenciaDeCombate(){

        System.out.println("Meu nome é " + nome + " e essa minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        System.out.println("Meu nome é " + nome + " e essa minha inteligencia de combate " + qi);
    }
}
