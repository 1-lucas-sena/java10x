package Inicinte.Condicoes;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = É uma forma de trazer o usuário para dentro do aplicação
        * Objetivo: O usuário vai criar un ninja e vamos validar os dados
        * */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = scan.nextLine();
        System.out.println("Nome: " + nomeDoNinja);

        System.out.println("Digite a idade do ninja: ");
        int idadeDoNinja = scan.nextInt();
        System.out.println("Idade: " + idadeDoNinja);

        if  (idadeDoNinja >= 18) {
            System.out.println("O ninja " + nomeDoNinja + " tem mais de 18 e pode pegar missões fora da vila!");
        } else {
            System.out.println("O ninja " + nomeDoNinja + "é muito novo para missões externas!");
        }

        scan.close();
    }
}
