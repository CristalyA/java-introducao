package com.afropretastech.afropretastech.introduçãoJava.intro_java;

import java.util.Scanner;

public class AtividadeQuatro {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double x1,x2,y1,y2,d;

        System.out.println("Quais são as medidas ? ");
        x1 = ler.nextDouble();
        x2 = ler.nextDouble();
        y1 = ler.nextDouble();
        y2 = ler.nextDouble();

        d = Math.sqrt((Math.pow((x2 - x1),2)+Math.pow((y2 - y1),2)));

        System.out.println("\nA ditância é :" +d);


    }
}

//Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano,
// P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: