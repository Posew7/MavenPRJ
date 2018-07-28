package com.posew7.mavenprj.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "rehber")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rehber.findAll", query = "SELECT r FROM Rehber r")
    , @NamedQuery(name = "Rehber.findById", query = "SELECT r FROM Rehber r WHERE r.id = :id")
    , @NamedQuery(name = "Rehber.findByAd", query = "SELECT r FROM Rehber r WHERE r.ad = :ad")
    , @NamedQuery(name = "Rehber.findBySoyad", query = "SELECT r FROM Rehber r WHERE r.soyad = :soyad")
    , @NamedQuery(name = "Rehber.findByNo", query = "SELECT r FROM Rehber r WHERE r.no = :no")
    , @NamedQuery(name = "Rehber.findByMahalle", query = "SELECT r FROM Rehber r WHERE r.mahalle = :mahalle")
    , @NamedQuery(name = "Rehber.findBy\u015eehir", query = "SELECT r FROM Rehber r WHERE r.\u015fehir = :\u015fehir")
    , @NamedQuery(name = "Rehber.findByDogtar", query = "SELECT r FROM Rehber r WHERE r.dogtar = :dogtar")
    , @NamedQuery(name = "Rehber.findByEmail", query = "SELECT r FROM Rehber r WHERE r.email = :email")
    , @NamedQuery(name = "Rehber.findByTel", query = "SELECT r FROM Rehber r WHERE r.tel = :tel")
    , @NamedQuery(name = "Rehber.findByBilgi", query = "SELECT r FROM Rehber r WHERE r.bilgi = :bilgi")})
public class Rehber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 30)
    @Column(name = "ad")
    private String ad;
    @Size(max = 30)
    @Column(name = "soyad")
    private String soyad;
    @Size(max = 30)
    @Column(name = "no")
    private String no;
    @Size(max = 30)
    @Column(name = "mahalle")
    private String mahalle;
    @Size(max = 30)
    @Column(name = "\u015fehir")
    private String şehir;
    @Column(name = "dogtar")
    @Temporal(TemporalType.DATE)
    private Date dogtar;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 30)
    @Column(name = "tel")
    private String tel;
    @Size(max = 50)
    @Column(name = "bilgi")
    private String bilgi;

    public Rehber() {
    }

    public Rehber(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getŞehir() {
        return şehir;
    }

    public void setŞehir(String şehir) {
        this.şehir = şehir;
    }

    public Date getDogtar() {
        return dogtar;
    }

    public void setDogtar(Date dogtar) {
        this.dogtar = dogtar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBilgi() {
        return bilgi;
    }

    public void setBilgi(String bilgi) {
        this.bilgi = bilgi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rehber)) {
            return false;
        }
        Rehber other = (Rehber) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posew7.mavenprj.entity.Rehber[ id=" + id + " ]";
    }

}
