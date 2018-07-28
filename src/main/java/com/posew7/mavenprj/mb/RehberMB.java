package com.posew7.mavenprj.mb;

import com.posew7.mavenprj.entity.Rehber;
import com.posew7.mavenprj.session.RehberFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

@Named(value = "rehberMB")
@SessionScoped
public class RehberMB implements Serializable {

    @EJB
    private RehberFacade rehberFacade;

    private int id;
    private String ad;
    private String soyad;
    private String no;
    private String mahalle;
    private String sehir;
    private java.util.Date dogtar;
    private String tel;
    private String email;
    private String bilgi;

    public RehberMB() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public Date getDogtar() {
        return dogtar;
    }

    public void setDogtar(Date dogtar) {
        this.dogtar = dogtar;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }

    public String ekle() {

        Rehber r = new Rehber();

        r.setAd(ad);
        r.setSoyad(soyad);
        r.setDogtar(dogtar);
        r.setNo(no);
        r.setMahalle(mahalle);
        r.setSehir(sehir);
        r.setTel(tel);
        r.setEmail(email);
        r.setBilgi(bilgi);

        rehberFacade.create(r);

        temizle();

        return "";
    }

    public String temizle() {

        ad = "";
        soyad = "";
        dogtar = null;
        no = "";
        mahalle = "";
        sehir = "";
        tel = "";
        email = "";
        bilgi = "";

        return "";
    }

    public List<Rehber> listele() {

        return rehberFacade.findAll();
    }

}
