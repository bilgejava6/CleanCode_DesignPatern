package com.muhammet.designpatern.solid.liskov;

public class Kaleci extends Oyuncu implements IOyuncu{

    @Override
    public void topuElleTut() {
        System.out.println("KAleci topu elle yakaladı.");
    }
}
