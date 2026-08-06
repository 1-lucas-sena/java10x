package Intremediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        Ninja ninjaComum = new NinjaBasico("Naruto Uzumaki", 12, TipoHabilidade.NINJUTSU);

        Ninja ninjaElite = new NinjaAvancado("Kakashi Hatake", 30, TipoHabilidade.TAIJUTSU, "Sharingan");

        System.out.println("--- TESTANDO NINJA BÁSICO ---");
        ninjaComum.mostrarInformacoes();
        ninjaComum.executarHabilidade();

        System.out.println("--- TESTANDO NINJA AVANÇADO ---");
        ninjaElite.mostrarInformacoes();
        ninjaElite.executarHabilidade();
    }
}
