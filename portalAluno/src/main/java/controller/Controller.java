/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.controller;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Controller {

    public class FormaPagamento {

        private int numeroPagamento;
        public int pix;
        public int boleto;
        public int cartao;
        public double dinheiro;
        public double cheque;
        public double deposito;
        public double transferencia;
        public double valorMensalidade;
        public double recibo;

        public void pagar(int pix, int boleto, double dinheiro, int cartao, double cheque, double deposito, double valorMensalidade, double recibo) {
            Scanner L = new Scanner(System.in);
            System.out.println("Escolha a Opção de pagamento");
            System.out.println("[1] Pix");
            System.out.println("[2] boleto");
            System.out.println("[3] dinheiro");
            System.out.println("[4] cartao");
            System.out.println("[5] cheque");
            System.out.println("[5] deposito");

            int opcao = L.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("== Pix ==");
                    this.recibo = this.pix - this.valorMensalidade;
                    if ((this.pix - this.valorMensalidade) >= 0) {
                        reciboPix();
                    }

                    break;
                case 2:
                    System.out.println("== Boleto ==");
                    this.recibo = this.boleto - this.valorMensalidade;
                    if ((this.boleto - this.valorMensalidade) >= 0) {
                        reciboBoleto();
                    }

                    break;
                case 3:
                    System.out.println("== Dinheiro ==");
                    this.recibo = this.dinheiro - this.valorMensalidade;
                    if ((this.dinheiro - this.valorMensalidade) >= 0) {
                        reciboDinheiro();
                    }

                    break;
                case 4:
                    System.out.println("== Cartao ==");
                    this.recibo = this.cartao - this.valorMensalidade;
                    if ((this.cartao - this.valorMensalidade) >= 0) {
                        reciboCartao();
                    }

                    break;
                case 5:
                    System.out.println("== Cheque ==");
                    this.recibo = this.cheque - this.valorMensalidade;
                    if ((this.cheque - this.valorMensalidade) >= 0) {
                        reciboCheque();
                    }

                    break;
                case 6:
                    System.out.println("== Deposito ==");
                    this.recibo = this.deposito - this.valorMensalidade;
                    if ((this.deposito - this.valorMensalidade) >= 0) {
                        reciboDeposito();
                    }

                    break;

                default:
                    System.out.println("Volte sempre :)");

            }
        }

        public void reciboPix() {
            System.out.println("Valor Total a pagar: " + this.valorMensalidade);
            System.out.println("Valor Total." + this.valorMensalidade);
            System.out.println("Valor Pago." + this.pix);
        }

        public void reciboBoleto() {
            System.out.println("Valor Total a pagar: " + this.valorMensalidade);
            System.out.println("Valor Total." + this.valorMensalidade);
            System.out.println("Valor Pago." + this.boleto);
        }

        public void reciboDinheiro() {
            System.out.println("Valor Total a pagar: " + this.valorMensalidade);
            System.out.println("Valor Total." + this.valorMensalidade);
            System.out.println("Valor Pago." + this.dinheiro);
        }

        public void reciboCartao() {
            System.out.println("Valor Total a pagar: " + this.valorMensalidade);
            System.out.println("Valor Total." + this.valorMensalidade);
            System.out.println("Valor Pago." + this.cartao);
        }

        public void reciboCheque() {
            System.out.println("Valor Total a pagar: " + this.valorMensalidade);
            System.out.println("Valor Total." + this.valorMensalidade);
            System.out.println("Valor Pago." + this.cheque);
        }

        public void reciboDeposito() {
            System.out.println("Valor Total a pagar: " + this.valorMensalidade);
            System.out.println("Valor Total." + this.valorMensalidade);
            System.out.println("Valor Pago." + this.deposito);
        }
    }
}
