package Intremediario.Aula10a11;

public abstract class Ninja implements EstrategiaDeBatalha  {

    String nome;
    String aldeia;
    int idade;

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


}
