package SeguroDeVida;

import InterfaceBanco.Tributavel;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 50;
    }
}
