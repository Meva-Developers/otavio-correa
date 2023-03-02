package JavaUtilWrappersLambda;

import Bytebank.Cliente;
import Bytebank.Conta;
import Bytebank.ContaCorrente;

import java.util.ArrayList;

public class ArrayListTeste {

    public static void main(String[] args) {

                //generics
        ArrayList <Conta> lista = new  ArrayList <Conta> ();

        //ArrayList <Cliente> lista1 = new ArrayList<Cliente>();

//        Cliente cliente = new Cliente();
//        lista.add(cliente);

        Conta cc1 = new ContaCorrente(99,999);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(33,333);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(33,333);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(55,555);
        lista.add(cc4);

        Conta cc5 = new ContaCorrente(88,888);
        lista.add(cc5);

        System.out.println("Tamanho " + lista.size());

        Conta ref = (Conta)lista.get(1);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho " + lista.size());

        for(int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }
        System.out.println("---------------------------------");

        for(Object oRef : lista){
            System.out.println(oRef);
        }

    }

}
