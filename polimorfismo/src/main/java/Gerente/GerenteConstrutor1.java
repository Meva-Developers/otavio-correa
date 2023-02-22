package Gerente;

public class GerenteConstrutor1 {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Otavio");
        g1.setCpf("123.456.789/11");
        g1.setSalario(5000.00);
        g1.setSenha(2222);
        g1.autentica(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());
        System.out.println(g1.getBonificacao() + g1.getSalario());
        System.out.println(g1.autentica(2222));

    }

}
