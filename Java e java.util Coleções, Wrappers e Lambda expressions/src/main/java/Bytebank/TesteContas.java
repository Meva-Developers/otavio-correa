package Bytebank;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(22, 22);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(20, 20);
        cp.deposita(200.00);

        cc.transfere(10.00, cp);

        System.out.println("CC:" + cc.getSaldo());
        System.out.println("CP:" + cp.getSaldo());
    }

}

//VER ULTIMOS MINUTOS DO Conta Corrente e Poupança