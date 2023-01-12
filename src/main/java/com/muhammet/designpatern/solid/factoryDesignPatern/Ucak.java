package com.muhammet.designpatern.solid.factoryDesignPatern;

public class Ucak extends Tasima{

    public Ucak() {
        super(TasimaTipi.HAVA);
    }

    @Override
    protected void evrakDoldur() {
        System.out.println("Uçak evrakı dolduruldu.");
    }
}
