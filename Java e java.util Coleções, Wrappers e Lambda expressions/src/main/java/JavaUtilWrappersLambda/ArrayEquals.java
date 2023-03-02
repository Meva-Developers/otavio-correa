package JavaUtilWrappersLambda;

import Bytebank.Conta;
import Bytebank.ContaCorrente;

import java.util.ArrayList;


public class ArrayEquals {

    public static void main(String[] args) {



//        boolean igual = cc1.ehIgual(cc2);
//        boolean igual1 = cc2.ehIgual(cc1);
//        boolean igual2 = cc1.ehIgual(cc1);
//        boolean igual3 = cc2.ehIgual(cc2);
//
//        System.out.println(igual);
//        System.out.println(igual1);
//        System.out.println(igual2);
//        System.out.println(igual3);

        ArrayList<Conta> lista = new ArrayList<Conta>();


        Conta cc1 = new ContaCorrente(99, 999);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(33, 333);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(33,333);

        boolean existe = lista.contains(cc1);

        System.out.println("Já existe? " + existe);


        for(Conta conta :lista){
            System.out.println(conta);
        }

    }

}


