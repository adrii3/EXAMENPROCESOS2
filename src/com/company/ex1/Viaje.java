package com.company.ex1;

public class Viaje {
    //EX1
    public static void main(String[] args) {
        Moneder moneder1 = new Moneder(40);
        Persona persona1 = new Persona("Mariano",moneder1);
        Persona persona2 = new Persona("Paco", moneder1);

        persona1.start();
        persona2.start();
    }
}
