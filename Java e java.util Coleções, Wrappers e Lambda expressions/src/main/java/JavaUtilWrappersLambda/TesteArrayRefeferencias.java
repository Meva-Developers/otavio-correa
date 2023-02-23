package JavaUtilWrappersLambda;

import Bytebank.Cliente;
import Bytebank.Conta;
import Bytebank.ContaCorrente;
import Bytebank.ContaPoupanca;

public class TesteArrayRefeferencias {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(50, 333);
        referencias[0] = cc1;


        ContaPoupanca cc2 = new ContaPoupanca(80, 100);
        referencias[1] = cc2;

        Cliente cliente = new Cliente(77, 55);
        referencias[2] = cliente;

        //Object referenciaGenerica = contas[1];


        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(ref.getNumero());
        System.out.println(cc2.getNumero());
        //System.out.println(referenciaGenerica.getNumero());
        //System.out.println(referencias[2].getNumero());


    }

}
