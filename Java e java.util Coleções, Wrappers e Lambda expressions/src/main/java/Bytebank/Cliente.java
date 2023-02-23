package Bytebank;

public class Cliente extends Conta {

    public Cliente(int agencia, int numero) {
        super(321, 0101);
    }

    @Override
    public void deposita(double valor) {
        super.saldo =+ valor;
    }
}
