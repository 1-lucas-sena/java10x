package Intremediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }


    @Override
    public void depositar(double valor) {
        saldo += (valor*0.99);
        System.out.println("Valor deppositado: " + valor);
    }
}
