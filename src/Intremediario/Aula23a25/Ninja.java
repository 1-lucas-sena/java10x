package Intremediario.Aula23a25;

public class Ninja {
    private String nome;
    private int idade;
    // O atributo bolsa é do tipo BolsaGenerica, que guarda EquipamentosNinja
    private BolsaGenerica<EquipamentosNinja> bolsa;

    public Ninja(String nome, int idade, BolsaGenerica<EquipamentosNinja> bolsa) {
        this.nome = nome;
        this.idade = idade;
        this.bolsa = bolsa;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public BolsaGenerica<EquipamentosNinja> getBolsa() {
        return bolsa;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", " + bolsa +
                '}';
    }
}