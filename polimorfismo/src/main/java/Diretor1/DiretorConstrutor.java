package Diretor1;

public class DiretorConstrutor {

    public static void main(String[] args) {

        Diretor1 d1 = new Diretor1();

        d1.setNome("Heitor Olavo");
        d1.setCpf("111.222.333/44");
        d1.setSalario(10000.00);
        d1.setSenha(2023);
        d1.autentica(2023);


        System.out.println(d1.autentica(2023));
        System.out.println(d1.getNome());
        System.out.println(d1.getSalario());
        System.out.println(d1.getCpf());
        System.out.println(d1.getBonificacao() + d1.getSalario());
    }


}
