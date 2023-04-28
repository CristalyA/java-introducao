package com.afropretastech.afropretastech.introduçãoJava.estrutura_decisao;

import java.util.Scanner;

public class IfElseUm {

    public static void main(String[] args) {

        int n1,n2,n3, maiorNumero=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Quais são os valores ? ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();


        if((n1>n2)&& (n1>n3)){

            maiorNumero = n1;
            System.out.println("O maior é: "+n1);
        } if((n2>n3) && (n2>n1)){
            maiorNumero= n2;
            System.out.println("O maior é: "+n2);
        }if ((n3>n1) && (n3>n2)){
            maiorNumero = n3;
            System.out.println("O maior é: "+n3);
        } else {
            System.out.println("Insira novamente os numeros");
        }

    }

}
//Faça um programa que receba três inteiros e diga qual deles é o maior