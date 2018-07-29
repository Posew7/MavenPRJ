package com.posew7.mavenprj.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "eglenceMB")
@RequestScoped
public class EglenceMB {

    private int sayi1;
    private int sayi2;
    private double sonuc;

    public EglenceMB() {
    }

    public double getSonuc() {
        return sonuc;
    }

    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }

    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    public String topla() {
        sonuc = sayi1 + sayi2;
        return "";
    }

    public String cikar() {
        sonuc = sayi1 - sayi2;
        return "";
    }

    public String carp() {
        sonuc = sayi1 * sayi2;
        return "";
    }

    public String bol() {
        sonuc = (double)sayi1 / sayi2;
        return "";
    }

}
