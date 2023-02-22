package SistemaInterno;

import Cliente.Cliente;
import Diretor1.Diretor1;
import Gerente.Gerente;

public class SistemaInteroConstrutor {


    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.autentica(2222);


        Diretor1 d = new Diretor1();
        d.autentica(2023);

        Cliente c = new Cliente();
        c.autentica(1010);


        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(d);
        si.autentica(c);
    }

}
