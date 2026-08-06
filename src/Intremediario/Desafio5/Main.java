package Intremediario.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaNaruto = new ContaCorrente(500.0);
        ContaPoupanca contaSasuke = new ContaPoupanca(100.0);


        BancoKonoha banco = new BancoKonoha();


        System.out.println("--- Antes da Transferência ---");
        contaNaruto.consultarSaldo();
        contaSasuke.consultarSaldo();

        System.out.println("\n--- Executando a Ação ---");
        banco.transferir(contaNaruto, contaSasuke, 200.0);

        System.out.println("\n--- Depois da Transferência ---");
        contaNaruto.consultarSaldo();
        contaSasuke.consultarSaldo();
    }
}