package Inicinte.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
         * Ternários são mareiras de reduzir o código
         * Variável = (condição) ? valorSeVerdadeiro : valorSeFalso
         * */

        int numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Mais de 10" : "Menos de 10";
        System.out.println(nivelDoNinja);
    }

}
