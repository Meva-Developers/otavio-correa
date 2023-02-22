package Gerente;

import AutenticadorUtil.AutenticadoComposicao;
import Funcionario.Funcionario;
import InterfaceAutenticavel.Autenticavel;

//O gerente está herdando a classe funcionário.
public class Gerente extends Funcionario implements Autenticavel {


    private AutenticadoComposicao composicao;


    public Gerente() {
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

