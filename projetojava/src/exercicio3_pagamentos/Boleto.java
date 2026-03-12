package exercicio3_pagamentos;
public class Boleto extends Pagamento {

    @Override
    public double processarPagamento(){
        System.out.println("Boleto Pago no valor de  " + getValor() + " Reais");
        return getValor();
    }


}
