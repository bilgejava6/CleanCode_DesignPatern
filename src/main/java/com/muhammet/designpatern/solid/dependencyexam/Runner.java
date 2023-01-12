package com.muhammet.designpatern.solid.dependencyexam;

public class Runner {
    public static void main(String[] args) {
        Odeme odeme = new Odeme();
        odeme.odemeYap(new Cek());
        odeme.odemeYap(new KrediKarti());
        odeme.odemeYap(new Nakit());
        odeme.odemeYap(new DijitaPara());

    }
}
