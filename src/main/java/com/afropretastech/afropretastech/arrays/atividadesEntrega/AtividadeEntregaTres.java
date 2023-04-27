package com.afropretastech.afropretastech.arrays.atividadesEntrega;

public class AtividadeEntregaTres {
    public static void main(String[] args) {

            int listInteiros[] [] = {{10,15,35},{70,120,140},{50,100,150}};

            for(int indiceLinha =0; indiceLinha<3;indiceLinha++){

                for(int indiceColuna =0; indiceColuna<3; indiceColuna++ ){

                    System.out.println("O valor de armazenamento da posição ["+indiceLinha+"]["+indiceColuna+"] " +
                            "e: " +listInteiros[indiceLinha][indiceColuna]);
                }
            }

        }
    }

//EXERCÍCIO 3.  Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos são as diferenças dos elementos de mesma posição das matrizes N1 e N2.