package com.afropretastech.afropretastech.arrays.atividades_aula;

public class ArrayTemperaturaDiaria {


    public static void main(String[] args) {

        double [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4]= 33.1;

        System.out.println("O valor da temperatura do dia " + temperaturas[0]);

        for (int i = 0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia" + (i+i) +" é: "+ temperaturas[i]);
        }

        for(double temp : temperaturas){
            System.out.println(temp);
        }

    }


}
