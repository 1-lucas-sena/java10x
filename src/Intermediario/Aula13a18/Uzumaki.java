package Intermediario.Aula13a18;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Aproveitar a quantidade de chakara e vencer no cansaço.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar");
    }

    //@Override   Esta protegido por ser um metodo final
    //public void tacarKunai(){
    //    System.out.println("Sou um método da classe FILHA!!!");
   // }
}
