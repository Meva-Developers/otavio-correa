package Desing;

import Funcionario.Funcionario;

public class DesingConstrutor{

    public static void main(String[] args) {
        Desing dg = new Desing();
        dg.setNome("Pedro");
        dg.setCpf("789.456.123/25");
        dg.setSalario(5000.00);

        System.out.println(dg.getNome());
        System.out.println(dg.getCpf());
        System.out.println(dg.getSalario());
        System.out.println(dg.getBonificacao());
        System.out.println(dg.getBonificacao() + dg.getSalario());

    }
}
