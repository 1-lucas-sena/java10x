package Intremediario.Aula1a5;

public class Main {
    public static void main(String[] args) {
        //Criar o Naruto - objeto ninja
        Uzumake Naruto = new Uzumake();
        Naruto.nome = "Naruto Uzumake";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabio();


        //Criar un o Sasuke - - objeto ninja
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchira";
        Sasuke.aldeia ="Aldeia da Folha";
        Sasuke.idade = 18;
        //Aplicanod metodos aos meus Objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);
        System.out.println(Sasuke.EuSouUmNinja());
        System.out.println(Sasuke.AnosParaSerTornarUmHokage(45));


        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia ="Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();


        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia ="Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.AtivarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia ="Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.ModoSabio();
        Boruto.AtivarJougan();
        Boruto.AtivarKarna();


    }
}
