package Cliente;


import InterfaceAutenticavel.Autenticavel;

public class ClienteConstrutor {

    public static void main(String[] args) {

        Autenticavel cliente = new Cliente();
        cliente.setSenha(1010);
        cliente.autentica(1010);


        System.out.println(cliente.autentica(1010));

    }

}
