package com.afropretastech.afropretastech.introduçãoJava.estrutura_decisao;

import java.util.Scanner;

public class IfElseTres {
    public static void main(String[] args) {

        int idade;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual a idade ?");
        idade = input.nextInt();

        if(idade >= 10 && idade <=14){
            System.out.println("\nInfantil");
        } else if (idade >= 15 && idade <=17) {
            System.out.println("\nJuvenil");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("\nAdulto");
        } else {
            System.out.println("\n Não tem categoria.");
        }


    }
}

//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto
