package com.afropretastech.afropretastech.poo_ex_entrega.ex1;

import com.afropretastech.afropretastech.poo_ex_entrega.ex1.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Cristaly", "Medeiros", "Feminino", "77788899921", 25);
        Cliente c2 = new Cliente("Michelle", "Souza", "Feminino", "22233388825", 22);

        c1.visualizar();
        c2.visualizar();

    }
}
