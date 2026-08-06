package Intremediario.Aula1a5;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    /*
     * O metodo String vai retornar uma string
     * */
    public String EuSouUmNinja(){
        return "Ola, Eu sou um ninja";
    }

    /*
    * Metodo Int vai retornar um int
    * */
    public int AnosParaSerTornarUmHokage(int idadeMinimaHokage){
        return idadeMinimaHokage - idade;
    }

}
