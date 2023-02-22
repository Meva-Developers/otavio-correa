package Diretor1;

import AutenticadorUtil.AutenticadoComposicao;
import Funcionario.Funcionario;
import InterfaceAutenticavel.Autenticavel;

public class Diretor1 extends Funcionario implements Autenticavel {



    private AutenticadoComposicao composicao;

    public Diretor1 (){
        this.composicao = new AutenticadoComposicao();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
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