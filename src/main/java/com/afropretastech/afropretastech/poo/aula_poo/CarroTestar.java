package com.afropretastech.afropretastech.poo.aula_poo;

public class CarroTestar {

    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.velocidade = 60;

        c1.acelerar(10);

        System.out.println(c1.velocidade);

        c1.freiar(30);

        System.out.println(c1.velocidade);


    }

}
