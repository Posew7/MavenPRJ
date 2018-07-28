package com.posew7.mavenprj.mb;

import com.posew7.mavenprj.session.GirisFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "girisMB")
@RequestScoped
public class GirisMB {
    
    @EJB
    private GirisFacade girisFacade;
    
    private String kullanici;
    
    public GirisMB() {
    }
    
    public String getKullanici() {
        return kullanici;
    }
    
    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }
    
    public String giriseYetkiliMi() {
        
        boolean sonuc = girisFacade.giriseYetkiliMi(kullanici);
        
        if (sonuc) {
            return "menu.xhtml";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("HATA", "kullanıcı adı bulunamadı"));
            return "";
        }
        
    }
    
}
