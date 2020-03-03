package com.company.ex1;

public class Moneder {
    //EX1
    int dinero;
    private boolean monederOcupat;

    public Moneder(int dinero){
        this.dinero = dinero;
        monederOcupat = false;
    }

    public synchronized int coger(int n) throws InterruptedException {
        try {
            while(monederOcupat) wait();
            monederOcupat=true;
            dinero= dinero-n;
            System.out.println("Han cogido "+n+" euros");
            monederOcupat=false;
            notifyAll();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        return dinero;
    }
}
