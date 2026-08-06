package Inicinte.Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o nome do ninja para registro: ");
            ninjasEAldeias[i][0] = scan.nextLine();
            System.out.println("Digite o nome da Vila do ninja: ");
            ninjasEAldeias[i][1] = scan.nextLine();
            System.out.println("Digite o nivel do ninja: ");
            ninjasEAldeias[i][2] = scan.nextLine();
        }

        for (int i = 0; i < ninjasEAldeias.length; i++) {

            System.out.println("Nome do ninja: " + ninjasEAldeias[i][0]);
            System.out.println("Idade do ninja: " + ninjasEAldeias[i][1]);
            System.out.println("Nivel do ninja: " + ninjasEAldeias[i][2]);

        }
        scan.close();
    }
}
