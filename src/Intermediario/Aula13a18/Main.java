package Intermediario.Aula13a18;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumake", "Aldeia da Folha", 17, 40, RankNinja.JOUNIN );

        //naruto.altura = 1.76;
        //ao aplicar o final no atributito ele se tornou imutável

        System.out.println("Naruto Uzumake: " + naruto.altura);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        naruto.tacarKunai();

        Uchiha sasuke = new Uchiha("Sasuke Uchira","Aldeia da Folha",17, 20, RankNinja.GENIN );

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itache = new Uchiha("Itache Uchira", "Aldeia da Folha", 20);
        itache.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchira", "Aldeia da Folha", 40, 75, RankNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(300);

        System.out.println(madara.toString());

        Anbu ninjaanbu = new Anbu();
        ninjaanbu.anbu();
        ninjaanbu.nome = "Ninja Anbu";
        System.out.println("Ninja Anbu: " + ninjaanbu.nome);

    }
}
