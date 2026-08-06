package Inicinte.Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] ninjasDaVila = new String[5];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do ninja para registro!");
            ninjasDaVila[i] = scan.nextLine();
        }

        for (int i = 0; i < ninjasDaVila.length; i++) {
            System.out.println(ninjasDaVila[i]);
        }
        scan.close();
    }
}
