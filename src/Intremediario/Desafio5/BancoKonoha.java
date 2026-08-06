package Intremediario.Desafio5;

public class BancoKonoha {


    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.saldo >= valor) {
            origem.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente para transferência.");
        }
    }
}
