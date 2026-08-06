package Inicinte.Condicoes;

import java.util.Scanner;

public class EstudosSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Casos específicos
        * Objetivo: pedir par o usuário selecionar um dos ninjas
        * */

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um dos Ninjas");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("1 - Sakura haruno");


        int escolha = scan.nextInt();
        System.out.println("O ninja escolhido foi o " + escolha);

        switch (escolha) {
            case 1:
                System.out.println("Escolheu o Naruto Uzumaki");
                break;

            case 2:
                System.out.println("Escolheu o Sasuke Uchiha");
                break;

            case 3:
                System.out.println("Escolheu o Sakura haruno");
                break;

            default:
                System.out.println("Escolha errada - núm5eros de 1 a 3 ");
        }




        scan.close();

    }
}
