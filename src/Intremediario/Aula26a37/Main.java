
package Intremediario.Aula26a37;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja("Naruto", "naruto@nmail", 987654321);

        NinjaRecord sasukeRecord = new NinjaRecord("Sasuke", "sasuke@nmail", 987654321);

        System.out.println(naruto);
        System.out.println(sasukeRecord);
        System.out.println(sasukeRecord.emailCaixaAlta());

        //Array
        System.out.println("------------Array_____________");
        String [] nomeNinjasArray = new String[4];
        nomeNinjasArray[0] = "Naruto Uzumaki";
        nomeNinjasArray[1] = "Sasuke Uchira";
        nomeNinjasArray[2] = "Sakura Haruno";

        System.out.println("nomeNinjasArray: " + nomeNinjasArray);
        System.out.println("nomeNinjasArray[0]: " + nomeNinjasArray[0]);
        System.out.println("nomeNinjasArray[0]: " + nomeNinjasArray[3]);
        System.out.println("Tamanho do array: " + nomeNinjasArray.length);

        //Listas
        System.out.println("------------Listas_____________");
        List<String> nomeNinjalist = new ArrayList<>();
        nomeNinjalist.add("Naruto Uzumaki");
        nomeNinjalist.add("Sasuke Uchiha");
        nomeNinjalist.add("Sakura Haruno");

        System.out.println("nomeNinjalist: " + nomeNinjalist);
        System.out.println("Tamanho do array: " + nomeNinjalist.size());
        System.out.println("Primeiro da lista" + nomeNinjalist.getFirst());
        System.out.println("Ultimo da lista: " +nomeNinjalist.getLast());

        //Stack -pilha
        System.out.println("------------Ninjas Array_______");
        Stack<String> ninjasStack = new Stack();
        ninjasStack.push("Naruto Uzumaki");
        System.out.println("Minha Stack atual = " + ninjasStack);

        ninjasStack .push("Sasuke Uchira");
        System.out.println("Minha Stack atual = " + ninjasStack);

        ninjasStack.push("Sakura Haruno");
        System.out.println("Minha Stack atual = " + ninjasStack);

        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com o pop() = " + ninjasStack);

        System.out.println("Proximo elemento da topo: " + ninjasStack.peek() );

        System.out.println("Tamanho da minha stack: " + ninjasStack.size() + " elementos");

        //Queues - FILA

        System.out.println("------------Queue____________");
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.offer("Naruto Uzumaki");
        ninjasQueue.offer("Sasuke Uchiha");
        ninjasQueue.offer("Sakura Haruno");

        System.out.println("Minha Queue: " + ninjasQueue);
        System.out.println("Tamanho da minha queue: " + ninjasQueue.size());
        System.out.println("Proximo elemento da topo: " + ninjasQueue.peek());
        System.out.println("Retirando o proximo elemento da topo: " + ninjasQueue.poll());
        System.out.println("Tamanho da minha queue: " + ninjasQueue.size());
        System.out.println("Proximo elemento da topo: " + ninjasQueue.peek());

        if(ninjasQueue.isEmpty()) {
            System.out.println("Fila Vazia");
        }else{
            System.out.println("Fila Cheia");
            }


        System.out.println("------------Hashset____________Sem duplicatas");
        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.add("Naruto Uzumaki");
        ninjaSet.add("Sasuke Uchiha");
        ninjaSet.add("Sakura Haruno");
        ninjaSet.add("Naruto Uzumaki");

        System.out.println("ninjaSet: " + ninjaSet);
        System.out.println("Tamanho da minha set: " + ninjaSet.size());
        System.out.println("Proximo elemento da topo: " + ninjaSet);

        System.out.println("------------Treeset____________sem duplicatas e em ordem logica");
        Set<String> ninjaTree = new TreeSet<>();
        ninjaTree.add("Naruto Uzumaki");
        ninjaTree.add("Sasuke Uchiha");
        ninjaTree.add("Sakura Haruno");
        ninjaTree.add("Naruto Uzumaki");

        System.out.println("ninjaTree: " + ninjaTree);
        System.out.println("Tamanho da minha set: " + ninjaTree.size());

        System.out.println("------------LinkedHashSet____________");
        Set<String> ninjaLinkedHashSet = new LinkedHashSet<>();
        ninjaLinkedHashSet.add("Naruto Uzumaki");
        ninjaLinkedHashSet.add("Sasuke Uchiha");
        ninjaLinkedHashSet.add("Sakura Haruno");
        ninjaLinkedHashSet.add("Naruto Uzumaki");

        System.out.println("ninjaLinkedHashSet: " + ninjaLinkedHashSet);

    }
}
