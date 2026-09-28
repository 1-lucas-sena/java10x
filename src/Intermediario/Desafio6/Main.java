package Intermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

        // Inicializando com os 7 ninjas exigidos no desafio
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Vila da Folha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Vila da Folha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Vila da Folha"));
        listaDeNinjas.add(new Ninja("Gaara", 19, "Vila da Areia"));
        listaDeNinjas.add(new Ninja("Temari", 20, "Vila da Areia"));
        listaDeNinjas.add(new Ninja("Killer Bee", 36, "Vila da Nuvem"));
        listaDeNinjas.add(new Ninja("Darui", 26, "Vila da Nuvem"));

        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n========== MENU GERENCIADOR DE NINJAS ==========");
            System.out.println("1. Exibir lista de ninjas completa");
            System.out.println("2. Adicionar ninja no início da lista (addFirst)");
            System.out.println("3. Remover o primeiro ninja da lista (removeFirst)");
            System.out.println("4. Acessar ninja em posição específica (get)");
            System.out.println("5. Ver tamanho da lista e status");
            System.out.println("6. Sair do sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("\n--- LISTA COMPLETA DE NINJAS ---");
                    if (listaDeNinjas.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        for (int i = 0; i < listaDeNinjas.size(); i++) {
                            System.out.println("[" + i + "] " + listaDeNinjas.get(i));
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- ADICIONAR NINJA NO INÍCIO ---");
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite a vila: ");
                    String vila = scanner.nextLine();

                    listaDeNinjas.addFirst(new Ninja(nome, idade, vila));
                    System.out.println("Ninja adicionado no início da lista com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- REMOVER PRIMEIRO NINJA ---");
                    if (!listaDeNinjas.isEmpty()) {
                        Ninja removido = listaDeNinjas.removeFirst();
                        System.out.println("Ninja removido: " + removido.getNome());
                    } else {
                        System.out.println("A lista já está vazia. Impossível remover!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- ACESSAR NINJA POR ÍNDICE ---");
                    System.out.print("Digite o índice (0 a " + (listaDeNinjas.size() - 1) + "): ");
                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice < listaDeNinjas.size()) {
                        System.out.println("Ninja na posição [" + indice + "]: " + listaDeNinjas.get(indice));
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 5:
                    System.out.println("\n--- STATUS DA LISTA ---");
                    System.out.println("Tamanho atual: " + listaDeNinjas.size());
                    if (listaDeNinjas.isEmpty()) {
                        System.out.println("Status: Fila Vazia");
                    } else {
                        System.out.println("Status: Fila com elementos");
                        System.out.println("Próximo elemento (topo/início): " + listaDeNinjas.peek().getNome());
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}