package org.springioc;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Airtel calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel data");
    }
}
