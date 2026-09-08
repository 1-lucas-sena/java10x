package Intremediario.Aula20a22;

public enum RankDeMissoes {

    D("Fácil", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Difícil", 5),
    S("Altissimo", 8);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade){
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
