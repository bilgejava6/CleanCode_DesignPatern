package com.muhammet.designpatern.solid.factoryDesignPatern;

public class Gemi extends Tasima{

    public Gemi(){
        super(TasimaTipi.DENIZ);
    }

    @Override
    protected void evrakDoldur() {
        System.out.println("Gemi evrakı dolduruldu.");
    }
}
