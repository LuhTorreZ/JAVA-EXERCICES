package exercicio2_funcionarios;

public class Gerente extends Funcionario {

    public double bonus(){
        return getSalarioBase()* 0.10;
    }
    
    @Override
    public double calcularSalario(){
        return getSalarioBase() + bonus();
    }

}
