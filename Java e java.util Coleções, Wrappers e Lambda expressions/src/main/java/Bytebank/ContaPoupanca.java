package Bytebank;
//Construtores não são herdados, preciso reescrever os contrutores e através do SUPER podemos fazer a chamada para o construtor da classe mãe.
public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero){
        super(agencia, numero);

    }

    @Override
    public void deposita(double valor) {
        super.saldo+=valor;
    }

}
