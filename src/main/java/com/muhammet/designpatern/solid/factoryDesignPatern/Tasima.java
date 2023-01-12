package com.muhammet.designpatern.solid.factoryDesignPatern;

public abstract class Tasima {
    private TasimaTipi tip= null;

    public Tasima(TasimaTipi tip){
        this.tip = tip;
        log();
    }

    private void log(){
        System.out.println("Ara işlem ya da sistem loglama kodları burada yazılabilir.");
    }
    /**
     * tüm sınıfların içini kendi yapısına göre doldurmasını istediğim kodları burada
     * sözleşme mantığı ile tanımlıyoruz.
     */
    protected abstract void evrakDoldur();

    public TasimaTipi getTip() {
        return tip;
    }

    public void setTip(TasimaTipi tip) {
        this.tip = tip;
    }
}
