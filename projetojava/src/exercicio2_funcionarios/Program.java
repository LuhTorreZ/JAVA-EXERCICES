package exercicio2_funcionarios;

public class Program {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente();
        Funcionario f2 = new Programador();

        System.out.println("=== Sistema de Funcionários ===");
        System.out.println("Salário gerente: " + f1.calcularSalario());
        System.out.println("Salário programador: " + f2.calcularSalario());

    }
}