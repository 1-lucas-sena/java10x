package Intremediario.Aula20a22;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki --------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17,
                40,1.83);

        System.out.println(naruto.getNome());

        System.out.println("--------------- Sasuke Uchira ---------------");
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da Folha", 17,
                20, 1.79);
        System.out.println(sasuke.getNome());
        sasuke.setNome("Sasuke Uchiha");
        System.out.println(sasuke.getNome());

        System.out.println("--------------- Missões ---------------");
        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D );
        missao1.exibirDetalhes();
    }
}
