package com.bilgeadam.hayvanatbahcesi;

// Inheritance
// superclass'ın özelliklerini subclass alıyor.
// extends ile sağlanır.

public class Kopek extends Hayvan{

    private String kopekCins;
    private double kuyrukUzunlugu;

    public String getKopekCins() {
        return kopekCins;
    }

    public void setKopekCins(String kopekCins) {
        this.kopekCins = kopekCins;
    }

    public double getKuyrukUzunlugu() {
        return kuyrukUzunlugu;
    }

    public void setKuyrukUzunlugu(double kuyrukUzunlugu) {
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    // method overriding
    // superclass metodunu kendimize özgü yeniden yazıyoruz.
    @Override
    public void sesCikar(){
        System.out.println("Hav hav");
    }

    @Override
    public String toString() {
        return  "Ad:"+getAd() + "\n" +
                "Ağırlık: " +getAgirlik()+ " kilogram" + "\n" +
                "Uzunluk: " +getUzunluk() + "\n" +
                "Cins: " + getKopekCins() + "\n" +
                "Kuyruk Uzunluğu: " + getKuyrukUzunlugu();
    }
}
