package Intermediario.Aula23a25;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Sakura Haruno");

        System.out.println("--------------TESTES LIST----------------");
        System.out.println(ninjasList);
        System.out.println(ninjasList.size());
        System.out.println(ninjasList.contains("Naruto Uzumaki"));
        System.out.println(ninjasList.get(2));
        System.out.println(ninjasList.getFirst());
        System.out.println(ninjasList.getLast());
        System.out.println(ninjasList.getClass());
        ninjasList.add("Sakura Haruno");
        System.out.println(ninjasList.removeLast());
        System.out.println(ninjasList.set(3 , "Kakashi Hatake" ));
        System.out.println(ninjasList);

        System.out.println("--------------TESTES Generics--------------");

        EquipamentosNinja kunaiDeFerro = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shurikenDeFogo = new EquipamentosNinja("Shiriken de fogo");
        EquipamentosNinja pergaminhoDeSapo = new EquipamentosNinja("Pergaminho de invocação sapo");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        bolsaGenerica.adicionarEquipamento(kunaiDeFerro);
        bolsaGenerica.adicionarEquipamento(shurikenDeFogo);
        bolsaGenerica.adicionarEquipamento(pergaminhoDeSapo);

        System.out.println(bolsaGenerica);



        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken de vento");

        BolsaGenerica<EquipamentosNinja> bolsaNaruto = new BolsaGenerica<>();
        bolsaNaruto.adicionarEquipamento(kunai);
        bolsaNaruto.adicionarEquipamento(shuriken);


        Ninja naruto = new Ninja("Naruto Uzumaki", 17, bolsaNaruto);



        EquipamentosNinja espada = new EquipamentosNinja("Espada Kusanagi");

        BolsaGenerica<EquipamentosNinja> bolsaSasuke = new BolsaGenerica<>();
        bolsaSasuke.adicionarEquipamento(espada);


        Ninja sasuke = new Ninja("Sasuke Uchiha", 17, bolsaSasuke);



        List<Ninja> listaDeNinjas = new ArrayList<>();
        listaDeNinjas.add(naruto);
        listaDeNinjas.add(sasuke);


        System.out.println("--- LISTA DE NINJAS DA ALDEIA ---");
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }
    }


}
