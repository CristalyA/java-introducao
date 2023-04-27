package com.afropretastech.afropretastech.introduçãoJava.exibirVariaveis;

import java.util.Scanner;

public class ExibirVariaveis {


    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int quantidade;
        long identificador;
        float altura;
        double area;
        char tipo;
        String palavra;

        System.out.println("Digite um valor (int) : ");
        quantidade= leia.nextInt();

        System.out.println("Digite um valor (long) : ");
        identificador= leia.nextLong();

        System.out.println("Digite um valor (float) : ");
        altura= leia.nextFloat();

        System.out.println("Digite um valor (double) : ");
        area = leia.nextDouble();

        System.out.println("Digite um valor (char) : ");
        tipo= leia.next().charAt(1);

        System.out.println("Digite um valor (String) : ");
        palavra= leia.next();

        System.out.println("\nValor é :" + quantidade);
        System.out.println("\nValor é :" + identificador);
        System.out.println("\nValor é :" + altura);
        System.out.println("\nValor é :" + area);
        System.out.println("\nValor é :" + tipo);
        System.out.println("\nValor é :" + palavra);
    }
}
