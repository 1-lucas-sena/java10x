package Inicinte.TiposDeDados;

public class DadosPrimitivos {

    public static void main(String[] args) {
        /*
        * Dados Primitivos: - int, double, float, char, boolean, short
        * Objetivo criar um ninja
        * */

       int idade = 16;
       double altura = 1.65;
       char inicial = 'N';
       boolean vivoOuMorto = true;
       Long saldoBancario = 99999999L; //Valor bem maior que o do int

       System.out.print(idade);
       System.out.println(idade);
       System.out.print(idade);

        System.out.println(inicial); //sout atalho de print

        System.out.println("O saldo bancario é = " + saldoBancario);
    }
}
