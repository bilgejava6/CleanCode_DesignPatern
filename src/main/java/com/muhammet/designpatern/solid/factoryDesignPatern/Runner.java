package com.muhammet.designpatern.solid.factoryDesignPatern;

public class Runner {
    public static void main(String[] args) {
        Tasima tasima;
        tasima = TasimaFactory.builder(TasimaTipi.DENIZ);
        tasima.evrakDoldur();
        tasima = TasimaFactory.builder(TasimaTipi.KARA);
        tasima.evrakDoldur();

    }
}
