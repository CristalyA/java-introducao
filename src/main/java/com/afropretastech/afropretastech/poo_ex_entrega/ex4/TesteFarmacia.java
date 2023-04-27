package com.afropretastech.afropretastech.poo_ex_entrega.ex4;

public class TesteFarmacia {

    public static void main(String[] args) {

        Farmacia r1  = new Farmacia("Analgesico","Medicação","20/08/2025",2,1.25);
        Farmacia r2 = new Farmacia("Absorvente", "Utilidades","30/09/2029",6,2);

        r1.visualizar();
        r2.visualizar();

    }

}
