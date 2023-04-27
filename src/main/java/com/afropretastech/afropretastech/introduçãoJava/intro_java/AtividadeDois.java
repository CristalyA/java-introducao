package com.afropretastech.afropretastech.introduçãoJava.intro_java;

import java.util.Scanner;

public class AtividadeDois {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int anos, meses, dias , total;

        System.out.println("\nQuantos dias de vida são ?");
        dias = ler.nextInt();

        anos = dias / 365;
        dias = dias % 365;
        meses = dias /30 ;
        dias = dias % 30;

        System.out.println("\nSão " +anos+"anos, "+meses+" meses e "+dias+ "dias.");

    }
}

//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos,
// meses e dias.
