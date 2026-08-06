package Intremediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }


    @Override
    public void depositar(double valor) {
        this.saldo += valor; // Sem taxa aqui!
        System.out.println("Valor depositado na Conta Corrente: R$ " + valor);
    }
}
