package Intremediario.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade ) {
        this.idade = idade;
        this.nome = nome;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {

        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Habilidade do Ninja: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade " + habilidade + " executada");

    }
}
