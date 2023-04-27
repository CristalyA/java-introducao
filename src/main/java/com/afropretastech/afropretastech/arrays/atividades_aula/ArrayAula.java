package com.afropretastech.afropretastech.arrays.atividades_aula;

public class ArrayAula {

    public static void main(String[] args) {

        int[] x =  new int [10];
        x [9] = 8;

        System.out.println("O tamnaho do array é: "+ x.length);

        for(int i = 0; i < x.length; i++){
            x[i] = i * 2;

            System.out.println("O valor da posição é "+i);
        }

    }


}
