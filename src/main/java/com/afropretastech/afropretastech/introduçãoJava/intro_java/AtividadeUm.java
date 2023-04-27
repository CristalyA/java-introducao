package com.afropretastech.afropretastech.introduçãoJava.intro_java;

import java.util.Scanner;

public class AtividadeUm {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int horas, sobraHoras , minutos , segundos , total;

        System.out.println("\nQuantos segundos são ?");
        segundos = ler.nextInt();

        horas = segundos / 3600;
        sobraHoras = segundos % 3600;
        minutos = sobraHoras/60;
        segundos = sobraHoras % 60 ;

        System.out.println("\nSão "+ horas +"horas, "+ minutos + "minutos e" + segundos+ " segundos.");


    }
}

//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso
// em horas, minutos e segundos.
