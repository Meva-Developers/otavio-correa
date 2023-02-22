package SistemaInterno;

import InterfaceAutenticavel.Autenticavel;

public class SistemaInterno {

    private int senha;

    public void autentica(Autenticavel fa) {

        boolean autentica = fa.autentica(this.senha);
        if (autentica) {
            System.out.println("Entrando no sistema....");
        } else {
            System.out.println("Senha incorreta.");
        }

    }
}