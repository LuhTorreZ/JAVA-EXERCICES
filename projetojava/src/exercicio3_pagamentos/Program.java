package exercicio3_pagamentos;

public class Program {

    public static void main(String[] args){

        Pagamento p1 = new Pix();
        Pagamento p2 = new CartaoCredito();
        Pagamento p3 = new Boleto();

        System.out.println("=== SISTEMA DE PAGAMENTOS ===");
        
        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}