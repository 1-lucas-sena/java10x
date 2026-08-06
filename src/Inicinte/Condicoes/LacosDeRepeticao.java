package Inicinte.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de Repetição: repetir infinitamente ou ate o objetivo
        * Temos o While e o for
        * */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 10;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez o clone nº " + numeroDeClones);
        }
        System.out.println("O Naruto atingiu o numero máximo de clones no While");
        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("O Naruto fez o clone no for " + (i+1));
        }
    }
}
