package com.afropretastech.afropretastech.introduçãoJava.estruturaReeticao;

public class AtividadeForDois {
    public static void main(String[] args) {

        int numero, somaImpar =0;

        for (numero = 1; numero <= 500; numero++){
            if ((numero % 2 != 0) &&(numero % 3 == 0)){
                somaImpar += numero;
            }
        }
        System.out.println("\nA soma dos números ímpares e múltiplos de 3 é : "+somaImpar);



    }
}
//Desenvolver um sistema que efetue a soma de todos os números ímpares que são
// múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
