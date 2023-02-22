package AutenticadorUtil;

public class AutenticadoComposicao {

    private int senha;

    public boolean setSenha(int senha) {
        this.senha = senha;
        return false;
    }


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }


}
