package Intremediario.Aula10a11;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumake";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchira";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itache = new Uchiha("Itache Uchira", "Aldeia da Folha", 20);
        itache.habilidadeEspecial();
    }
}
