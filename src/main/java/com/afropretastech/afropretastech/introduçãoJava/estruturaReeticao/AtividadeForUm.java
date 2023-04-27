package com.afropretastech.afropretastech.introduçãoJava.estruturaReeticao;

import java.util.Scanner;

public class AtividadeForUm {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int habitantes, filhos;
        double salario, totalSalario = 0, totalFilhos = 0, mediaSalario = 0, mediaFilhos = 0, maiorSalario = 0,
                contSalario = 0, percentualSalario = 0;

        for (habitantes = 0; habitantes < 3; habitantes++) {
            System.out.println("\nDigite o salario do habitante: R$");
            salario = ler.nextDouble();

            if (maiorSalario < salario) {
                maiorSalario += salario;
            }
            maiorSalario = salario;

            if (salario <= 100) {
                contSalario++;
            }

            totalSalario += salario;
            mediaSalario = totalSalario / 3;
            percentualSalario = (contSalario / 3) * 100;

            System.out.println("\nQuantidade de filhos: ");
            filhos = ler.nextInt();

            totalFilhos += filhos;
            mediaFilhos = totalFilhos / 3;
        }
        System.out.println("\nMédia salarial é : "+mediaSalario);
        System.out.println("\nMédia dos filhos é :"+mediaFilhos);
        System.out.println("\nO maior salário é: "+maiorSalario);
        System.out.println("\nO percentual de pessoas com sálario de até R$100 é : "+percentualSalario+"%.");
    }
}

//1- A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes,
// coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$100,00.