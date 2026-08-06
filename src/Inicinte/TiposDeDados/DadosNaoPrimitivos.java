package Inicinte.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) { // psvm atalho
        /*
         * Dados nao primitivos: String, Array, Class, enum
         * Objetivo crair um ninja e atribuir metodos a ele
         */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println(nome);
        System.out.println(nomeUpperCase);
        System.out.println(nome.toUpperCase());

        String aldeia= "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeia);
        System.out.println(aldeiaLowerCase);
        System.out.println(aldeia.length());

    }
}
