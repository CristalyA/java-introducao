package com.afropretastech.afropretastech.introduçãoJava.estruturaReeticao;

import java.util.Scanner;

public class AtividadeWhileTres {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valor, somaValores = 0, mediaValores=0, contagemValores = 0;

        System.out.println("Insira um valor: ");
        valor = ler.nextInt();

        while (valor > 0 ){
            somaValores += valor;
            contagemValores ++;
            mediaValores = somaValores / contagemValores;

        }

        System.out.println("\nA soma de valores é : "+somaValores);
        System.out.println("\nA contagem de valores é: "+contagemValores);
        System.out.println("\nA média de valores é :"+mediaValores);
    }
}

//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
// apresente no final o total do somatório, a média e o total de valores lidos.
// O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
// valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
