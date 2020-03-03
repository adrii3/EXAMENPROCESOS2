package com.company.ex1;

public class Persona extends Thread {
    //EX1
    Moneder monedero;



    public Persona(String nom, Moneder monedero){
        super(nom);
        this.monedero= monedero;
    }

    @Override
    public void run(){

        while(monedero.dinero>0){
            try {
                Thread.sleep((long) Math.random() * 1000 + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                int c = monedero.coger(10);
                System.out.println("Soy "+getName()+" quedan "+c+" euros");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
