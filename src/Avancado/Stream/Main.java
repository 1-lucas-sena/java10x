package Avancado.Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 19));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 28));
        ninjas.add(new Ninja("Temari", "Suna", 39));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 57));

        System.out.println("----------------STREAMS____________:");

        //.stream
        System.out.println("-------------Filtragem por Vila___________________");
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha"))
                .forEach(System.out::println);

        System.out.println("--------------Ordenacão por idade___________________");
        ninjas.stream()
                .sorted((n1, n2)-> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("--------Ordenação por Ordem Alfabética (A-Z)_______________");
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        System.out.println("--------Mapeamento - Obter apenas os Nomes_______________");
        ninjas.stream()
                .map(ninja -> ninja.getNome())
                .forEach(System.out::println);

        System.out.println("--------Filtragem Composta (Konoha + Maior de 17 anos)____________");
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha") && ninja.getIdade() > 17)
                .forEach(System.out::println);

        System.out.println("--------Limitar Resultado - 3 Primeiros Ninjas_____________");
        ninjas.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-------Vilas Únicas (Sem Repetição)__________________");
        ninjas.stream()
                .map(ninja -> ninja.getVila())
                .distinct()
                .forEach(System.out::println);

        System.out.println("-------Ordenação por Idade (Decrescente)____________");
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n2.getIdade(), n1.getIdade()))
                .forEach(System.out::println);

        System.out.println("---------Ninja mais velho:___________________");


        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println(ninjaMaisVelho);
    }
}
