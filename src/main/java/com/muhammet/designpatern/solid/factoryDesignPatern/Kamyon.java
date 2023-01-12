package com.muhammet.designpatern.solid.factoryDesignPatern;

public class Kamyon extends Tasima{

    public Kamyon() {
        super(TasimaTipi.KARA);
    }

    @Override
    protected void evrakDoldur() {
        System.out.println("Kamyon evrakı dolduruldu");
    }
}
