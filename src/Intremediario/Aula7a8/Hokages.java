package Intremediario.Aula7a8;

public abstract class Hokages {

    String nome;
    int idade;
    boolean isVivo;

    public Hokages() {
    }

    public Hokages(String nome, int idade, boolean isVivo) {
        this.nome = nome;
        this.idade = idade;
        this.isVivo = isVivo;
    }

    public abstract void sabedoriaHokage();
}
