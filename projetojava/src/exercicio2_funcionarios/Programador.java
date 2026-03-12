package exercicio2_funcionarios;

public class Programador extends Funcionario{

    private int horaExtra = 10;
    
    
    @Override
    public double calcularSalario(){
    return getSalarioBase() + (horaExtra * 20);
}
}
