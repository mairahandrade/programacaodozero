package org.example;

import java.util.Scanner;

public class CalculadoraDePartidas {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite quantidade de vitórias: ");
        int vitorias = Scanner.nextInt();

        System.out.print("Digite quantidade de derrotas: ");
        int derrotas =  Scanner.nextInt();

        int saldoVitorias = calcularSaldo( vitorias, derrotas);
        String nivel = calcularNivel(saldoVitorias);


        System.out.println("O Herói tem de saldo de " + vitorias + " vitórias" + " e está no nível " + nivel);

        Scanner.close();
    }

            public static int calcularSaldo(int vitorias, int derrotas){

            return vitorias - derrotas;
        }

        public static String calcularNivel (int vitorias){


                if (vitorias < 10) {
                    return  "Ferro";
                } else if (vitorias >= 10 && vitorias <= 20) {
                    return  "Bronze";
                } else if (vitorias >= 21 && vitorias <= 50) {
                   return  "Prata";
                } else if (vitorias >= 51 && vitorias <= 80) {
                   return  "Ouro";
                } else if (vitorias >= 81 && vitorias <= 90) {
                   return  "Diamante";
                } else if (vitorias >= 91 && vitorias <= 100) {
                  return  "Lendário";
                } else {
                    return  "Imortal";



                }
            }
        }
