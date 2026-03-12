package exercicio3_pagamentos;

public class CartaoCredito extends Pagamento{

    @Override
    public double processarPagamento(){
        System.out.println("Uma compra no valor de  " + getValor() + " Reais, foi APROVADA em seu Cartão de crédito");
        return getValor();
    }

}
