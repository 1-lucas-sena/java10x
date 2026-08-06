package Desafio1;

public class Desafio1 {
    public static void main(String[] args) {

        //ninja Naruto
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String nomeMissaoNinja1 = "Recuperar a cabaca de pinga";
        char dificuldadeMissaoNinja1 = 'B';
        boolean statutusMissaoNinja1 = false;

        System.out.println("--------------" + nomeNinja1 + "--------------");
        if(idadeNinja1 >= 15) {
            statutusMissaoNinja1 = true;
            System.out.println("O ninja " + nomeNinja1 + " concluiu a missao " + nomeMissaoNinja1 + " de rank " + dificuldadeMissaoNinja1 + "!");
        } else if (dificuldadeMissaoNinja1 == 'C' || dificuldadeMissaoNinja1 == 'D') {
            System.out.println("O ninja " + nomeNinja1 + " concluiu a missao " + nomeMissaoNinja1 + " de rank " + dificuldadeMissaoNinja1 + "!");
        }else {
            System.out.println("O ninja " + nomeNinja1 + " nao concluiu a missao " + nomeMissaoNinja1 + " de rank " + dificuldadeMissaoNinja1 + "!");
        }


        String nomeNinja2 = "Sakura Uemada";
        int idadeNinja2 = 14;
        String nomeMissaoNinja2 = "Gato na Arvore";
        char dificuldadeMissaoNinja2 = 'C';
        boolean statutusMissaoNinja2 = false;

        String nomeNinja3 = "Sasuke Uchira";
        int idadeNinja3 = 16;
        String nomeMissaoNinja3 = "Encontar uma revista para ";
        char dificuldadeMissaoNinja3 = 'A';
        boolean statutusMissaoNinja3 = false;
    }
}
