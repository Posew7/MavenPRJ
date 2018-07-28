package com.posew7.mavenprj.session;

import com.posew7.mavenprj.entity.Rehber;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RehberFacade extends AbstractFacade<Rehber> {

    @PersistenceContext(unitName = "com.posew7_MavenPRJ_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RehberFacade() {
        super(Rehber.class);
    }

}
