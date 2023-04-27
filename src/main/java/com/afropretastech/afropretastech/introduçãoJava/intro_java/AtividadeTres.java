package com.afropretastech.afropretastech.introduçãoJava.intro_java;

import java.util.Scanner;

public class AtividadeTres {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota1, nota2 , nota3 , media , soma;

        System.out.println("Quais são as notas ? ");
        nota1 = ler.nextDouble();
        nota2 = ler.nextDouble();
        nota3 = ler.nextDouble();

        soma = nota1 + nota2 + nota3;

        media = ((nota1*2) + (nota2*3) + (nota3*5)) /10;

        System.out.println("\nMedia é : " + media);


    }

}
//Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
// Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,respectivamente.