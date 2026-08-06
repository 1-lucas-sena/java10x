package Intremediario.Aula13a15;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto Uzumake", "Aldeia da Folha", 17, 40, RankNinja.JOUNIN );
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

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
    }
}
