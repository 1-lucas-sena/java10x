package Intremediario.Desafio4;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habilidade Principal: " + habilidade);
        System.out.println("Especialidade Avançada: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O Ninja Avançado " + nome + " usou o " + habilidade +
                " combinado com sua especialidade em " + especialidade + "!");
    }
}
