package Intremediario.Aula12;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface, HokageInterface {

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }


    @Override
    public void ninjaDeElite() {
        System.out.println(nome + ": E sou da Ambu");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": É Hokage");
    }
}
