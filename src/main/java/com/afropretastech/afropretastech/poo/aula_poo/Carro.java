package com.afropretastech.afropretastech.poo.aula_poo;

public class Carro {

    String nome;
    String marca;
    int ano;
    int velocidade;

    //metodo
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }

    void freiar(int reduzir){
        velocidade -= reduzir;
    }

    void buzinar(){
        System.out.println("BIBIBIBI");
    }

}
