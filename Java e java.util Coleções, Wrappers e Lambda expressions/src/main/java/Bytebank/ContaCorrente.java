package Bytebank;

import InterfaceBanco.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo+=valor;
    }

    @Override
    public boolean saca(double valor) { //A assinatura do método não muda, por isso ainda é @Override
        double valorAsacar = valor + 0.2;
        return super.saca(valorAsacar);
    }


    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
