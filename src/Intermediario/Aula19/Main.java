package Intermediario.Aula19;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------- Naruto Uzumaki ----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 40, RankNinja.JOUNIN, Biju.KURAMA);
        System.out.println("Biju do Naruto: " + naruto.biju);
        System.out.println("Altura do Naruto (atributo final): " + naruto.altura);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        naruto.tacarKunai();

        System.out.println("\n---------------- Sasuke Uchiha ----------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 20, RankNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        System.out.println("\n---------------- Itachi Uchiha ----------------");
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 20);
        itachi.habilidadeEspecial();

        System.out.println("\n---------------- Madara Uchiha ----------------");
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 40, 75, RankNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(300);

        System.out.println("\n--- IMPRIMINDO OBJETO MADARA (toString) ---");
        System.out.println(madara.toString());
        System.out.println(madara);

        System.out.println("\n--- TESTANDO ANBU ---");
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.anbu();
        ninjaAnbu.nome = "Kakashi (Anbu)";
        System.out.println("Nome do Anbu: " + ninjaAnbu.nome);
    }
}