package com.posew7.mavenprj.session;

import com.posew7.mavenprj.entity.Giris;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GirisFacade extends AbstractFacade<Giris> {

    @PersistenceContext(unitName = "com.posew7_MavenPRJ_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GirisFacade() {
        super(Giris.class);
    }

    public boolean giriseYetkiliMi(String p_kullanici) {

        try {
            Giris g = em.createNamedQuery("Giris.findByKullanici", Giris.class).setParameter("kullanici", p_kullanici).getSingleResult();

            if (g != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

}
