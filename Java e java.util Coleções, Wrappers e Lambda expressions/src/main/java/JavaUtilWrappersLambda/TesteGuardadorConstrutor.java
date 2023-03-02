package JavaUtilWrappersLambda;

import Bytebank.Cliente;
import Bytebank.Conta;
import Bytebank.ContaCorrente;

public class TesteGuardadorConstrutor {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(77,777);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(88,888);
        guardador.adiciona(cc2);

        Conta cc3 = new ContaCorrente(99,999);
        guardador.adiciona(cc3);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println("A quantidade de contas armazenas dentro do Array é " + tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getAgencia());

        Conta refe = guardador.getReferencia(0);
        System.out.println(refe.getNumero());

        Conta refer = guardador.getReferencia(1);
        System.out.println(refer.getAgencia());

        Conta refere = guardador.getReferencia(1);
        System.out.println(refere.getNumero());

        Conta referen = guardador.getReferencia(2);
        System.out.println(referen.getAgencia());

        Conta referenc = guardador.getReferencia(2);
        System.out.println(referenc.getNumero());

    }

}
