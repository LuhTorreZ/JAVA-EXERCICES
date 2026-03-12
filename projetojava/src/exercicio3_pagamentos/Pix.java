package exercicio3_pagamentos;

public class Pix extends Pagamento {

    @Override
    public double processarPagamento(){

        System.out.println("Pix enviado no valor de " + getValor() + " Reais");
        
        return getValor();
    }


}
