package com.aulajava;

import java.util.Locale;
import java.util.Scanner;

public class SaldoBancario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldoContaCorrente = 10.0;
        double limiteEspecial = 30.0;

        System.out.println("Digite um valor para saque");
        double valorSolicitado = sc.nextDouble();

        if (saldoContaCorrente < valorSolicitado &&
                valorSolicitado <= (saldoContaCorrente + limiteEspecial)) {
            System.out.println(" Saldo Insuficiente, deseja usar o cheque especial?");
            char resposta = sc.next().charAt(0);
            if (resposta == 's' || resposta == 'S') {
                double saldoAtual = saldoContaCorrente - valorSolicitado;
                System.out.println("SALDO ATUAL : R$ " + saldoAtual);
            }
            if(resposta== 'n' || resposta== 'N'){
                System.out.println(" Operação cancelada");
            }

            else {
                System.out.println("Digite uma opção válida");
            }

        }
        else if (saldoContaCorrente < valorSolicitado &&
                valorSolicitado >(saldoContaCorrente + limiteEspecial)) {
            System.out.println("Saldo insuficiente");
        }
        else {
            saldoContaCorrente= saldoContaCorrente-valorSolicitado;
            System.out.println(" Seu novo saldo é : R$ "+ saldoContaCorrente);
        }

        sc.close();
        }


    }


