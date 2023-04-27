package com.afropretastech.afropretastech.poo_ex_entrega.ex3;

public class TesteProduto {

    public static void main(String[] args) {

        Produto g1 = new Produto("GTA","Cris","Jogo de missão","Faca",2023);
        Produto g2 = new Produto("COD","And","Jogo de missão","Metralhadora",2022);

        g1.visualizar();
        g2.visualizar();
    }

}
