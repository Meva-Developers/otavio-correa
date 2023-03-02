package JavaUtilWrappersLambda;

import Bytebank.Conta;

public class GuardadorDeContas {
    private Object[] referencias;
    private int posicaoOcupada; //esse atributo já inicia em 0

    public GuardadorDeContas() {
        this.referencias = new Object[10];
        this.posicaoOcupada = 0; //porem aqui estou deixando explicito #opcional
    }

    public void adiciona(Object ref) {
        this.referencias[this.posicaoOcupada] = ref;
        this.posicaoOcupada++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoOcupada;
    }

    public Conta getReferencia(int pos) {
        return (Conta) this.referencias[pos];
    }
}
