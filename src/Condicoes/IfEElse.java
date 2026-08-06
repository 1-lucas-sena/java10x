package Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
        * Objetivo passar o ninja de nivel de acrodo com o numero de missoes
        * */
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean isHokage = false;
        short numeroDeMissoes = 10;

        if (numeroDeMissoes >= 20) {
            isHokage = true;
        }
        if (isHokage) {
            System.out.println("Naruto Uzumaki é um Hokage");
        } else {
            System.out.println("O Naruto ainda nao completou as missoes necessarias");
        }
    }
}
