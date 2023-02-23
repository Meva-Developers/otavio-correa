package TesteTributavel;

import Bytebank.ContaCorrente;
import Imposto.CalculadorImposto;
import SeguroDeVida.SeguroDeVida;

public class TributavelConstrutor {

    public static void main(String[] args) {
        ContaCorrente cc=new ContaCorrente(555,555);
        cc.deposita(100.00);

        SeguroDeVida seguro=new SeguroDeVida();

        CalculadorImposto calcula=new CalculadorImposto();
        calcula.registra(cc);
        calcula.registra(seguro);

        System.out.println(calcula.getTotalImposto());
        System.out.println(cc.getValorImposto());
    }

}
