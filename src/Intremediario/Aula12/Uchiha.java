package Intremediario.Aula12;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }
}
