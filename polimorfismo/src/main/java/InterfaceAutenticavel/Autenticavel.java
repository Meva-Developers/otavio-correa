package InterfaceAutenticavel;

//A Classe quer a interface, precisa assinar um contrato que é
//setSenha
//autentica
public abstract interface Autenticavel {


    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);

}
