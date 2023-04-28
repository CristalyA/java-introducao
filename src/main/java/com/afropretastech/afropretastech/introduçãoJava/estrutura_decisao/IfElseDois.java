package com.afropretastech.afropretastech.introduçãoJava.estrutura_decisao;

import java.util.Scanner;

public class IfElseDois {

    public static void main(String[] args) {

        int n1, n2, n3, ordem;

        Scanner input = new Scanner(System.in);

        System.out.println("Quais são os numeros ?");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if ((n1 >= n2) && (n1 >= n3) && (n2 >= n3)) {
            System.out.println(" A ordem descrescente é " + n1 +","+ n2+ "," + n3+".");
        }
        if ((n1 >= n2) && (n1 >= n3) && (n3 >= n2)) {
            System.out.println(" A ordem descrescente é " + n1 +"," +n3+"," + n2+".");
        }
        if ((n2 >= n1) && (n2 >= n3) && (n1 >= n3)) {
            System.out.println(" A ordem descrescente é " + n2 +","+ n1+"," + n3+".");
        }
        if ((n2 >= n1) && (n2 >= n3) && (n3 >= n1)) {
            System.out.println(" A ordem descrescente é " + n2+"," + n3 +","+ n1+".");
        }
        if ((n3 >= n1) && (n3 >= n2) && (n1 >= n2)) {
            System.out.println(" A ordem descrescente é " + n3 +","+ n1 +","+ n2+".");
        }
        if ((n3 >= n1) && (n3 >= n2) && (n2 >= n1)) {
            System.out.println(" A ordem descrescente é " + n3+"," + n2+"," + n1+".");
        }
    }
}

//Faça um programa que entre com três números e coloque em ordem crescente.
