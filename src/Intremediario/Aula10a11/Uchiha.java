package Intremediario.Aula10a11;

public class Uchiha extends Ninja{

    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchira, um ataque de fogo.");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Uasr o Sharingan no inicio e acabar rapido a batalha");
    }
}
