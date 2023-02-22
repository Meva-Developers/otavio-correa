package Funcionario;

public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //método abstrato não tem corpo, não tem implementação, porém os filhos precisam ter a implementação.
    public abstract double getBonificacao(); // método abstrato obriga os filhos implementarem.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
