package com.afropretastech.afropretastech.arrays.atividades_aula;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroAlunos = 5;
        double[] notaAlunos = new double[numeroAlunos];

        for (int i =0;i<numeroAlunos; ++i){
            System.out.println("Qual a nota do "+(i+1)+" aluno.");
            notaAlunos[i] = input.nextDouble();
        }

        for (int i =0;i<numeroAlunos; ++i){
            System.out.println("Nota :" +notaAlunos[i]);
        }


    }
}
