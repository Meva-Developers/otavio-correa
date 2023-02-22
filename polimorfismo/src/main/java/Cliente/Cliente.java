package Cliente;

import AutenticadorUtil.AutenticadoComposicao;
import InterfaceAutenticavel.Autenticavel;

public class Cliente implements Autenticavel {


    private AutenticadoComposicao composicao;

    //contrutor padrão
    public Cliente() {
        this.composicao = new AutenticadoComposicao();
    }

    @Override
    public void setSenha(int senha) {
        this.composicao.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.composicao.autentica(senha);
    }
}