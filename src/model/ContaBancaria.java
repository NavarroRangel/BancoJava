package model;

import java.util.Scanner;

public class ContaBancaria {
    private int numeroDaConta;
    private String  titular;
    private double limiteDoCartao;



    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    public boolean lancaCompra(String descricao, double valor) {
        if (this.limiteDoCartao >= valor) {
            this.limiteDoCartao -= valor;
            System.out.println("Compra Realizada debitado do cartão: R$ -" + valor);
            System.out.println("Saldo Atual: " + this.limiteDoCartao);
            return true;
        } else {
            System.out.println("SEM LIMITE");
            return false;
        }

    }

}

