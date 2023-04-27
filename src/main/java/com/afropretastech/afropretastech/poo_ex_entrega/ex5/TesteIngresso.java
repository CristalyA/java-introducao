package com.afropretastech.afropretastech.poo_ex_entrega.ex5;

public class TesteIngresso {

    public static void main(String[] args) {

        Ingresso i1 = new Ingresso("Homem de Ferro", "Super herois/ação", "18:30H", "2:55", 2);
        Ingresso i2 = new Ingresso("Pets", "Desenho animado", "14:00H", "2:10", 3);

        i1.visualizar();
        i2.visualizar();

    }
}
