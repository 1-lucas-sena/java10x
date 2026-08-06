package Inicinte.Desafio;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        int maxNinja = 3;
        int nunAtualNinja = 0;
        String[] ninjasDaVila  = new String[maxNinja];
        int[] idadeNinja = new int[maxNinja];
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        while (opcao != 3) {
            System.out.println("Menu de Cadastro Ninja");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma das opções: ");

            opcao = scan.nextInt();
            scan.nextLine();
            switch (opcao) {
                case 1:
                    if(nunAtualNinja < maxNinja) {
                        System.out.println("Digite o nome do Ninja");
                        ninjasDaVila[nunAtualNinja] = scan.nextLine();
                        System.out.println("Digite a idade do ninja " + ninjasDaVila[nunAtualNinja]);
                        idadeNinja[nunAtualNinja] = scan.nextInt();
                        nunAtualNinja ++;
                        System.out.println("Ninja cadastrado com sucesso");
                    }else {
                        System.out.println("Numero máximo de ninjas ja cadastrados");
                    }
                    break;
                case 2:
                    if(nunAtualNinja == 0) {
                        System.out.println("Nenhum ninja foi cadastado");
                    }else {
                        for (int i = 0; i < nunAtualNinja; i++) {
                            System.out.println("Ninja " + (i + 1) + ": " + ninjasDaVila[i] + " e tem " + idadeNinja[i] + " anos.");

                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do Cadastro");
                    break;

                default:
                    System.out.println("Digite um numero valido, entre 1 e 3");
            }



        }
        scan.close();

    }
}
