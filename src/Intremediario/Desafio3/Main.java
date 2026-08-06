package Intremediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maxNinja = 3;
        int nunAtualNinja = 0;
        Ninja[] ninjasDaVila = new Ninja[maxNinja];
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

                        System.out.println("Qual tipo de ninja deseja cadastrar?");
                        System.out.println("1 - Ninja Comum");
                        System.out.println("2 - Ninja Uchiha");
                        int tipoNinja = scan.nextInt();
                        scan.nextLine();


                        Ninja novoNinja;

                        if (tipoNinja == 2) {
                            Uchiha uchiha = new Uchiha();

                            System.out.println("Digite a habilidade especial:");
                            uchiha.habilidadeEspecial = scan.nextLine();

                            novoNinja = uchiha;
                        } else {
                            novoNinja = new Ninja();
                        }


                        System.out.println("Digite o nome do Ninja:");
                        novoNinja.nome = scan.nextLine();

                        System.out.println("Digite a idade do Ninja:");
                        novoNinja.idade = scan.nextInt();
                        scan.nextLine();


                        System.out.println("Digite o nome da missão do Ninja:");
                        novoNinja.missao = scan.nextLine();

                        System.out.println("Digite o nível de dificuldade da missão (Ex: Rank D, Rank S):");
                        novoNinja.nivelDificuldade = scan.nextLine();

                        System.out.println("Digite o status atual da missão (Ex: Em andamento, Concluída):");
                        novoNinja.statusMissao = scan.nextLine();

                        ninjasDaVila[nunAtualNinja] = novoNinja;
                        nunAtualNinja++;

                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Número máximo de ninjas já cadastrados");
                    }
                    break;

                case 2:
                    if(nunAtualNinja == 0) {
                        System.out.println("Nenhum ninja foi cadastrado.");
                    } else {
                        for (int i = 0; i < nunAtualNinja; i++) {
                            System.out.println("--- Dados do Ninja " + (i + 1) + " ---");
                            ninjasDaVila[i].mostrarInformacoes();
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