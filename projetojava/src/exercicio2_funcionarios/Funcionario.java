package exercicio2_funcionarios;

public class Funcionario {

    private String nome;
    double salarioBase = 1640;

    public void setNome(String a){
        this.nome = a;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

}
