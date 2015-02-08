/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palaute;

import javax.ejb.ApplicationException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Pasi
 */
@Named
@ApplicationScoped
public class PalauteKäsittelijä {

    @Inject
    private Palautteet palautteet;

    public Palautteet getPalautteet() {
        return palautteet;
    }

    public void setPalautteet(Palautteet palautteet) {
        this.palautteet = palautteet;
    }
    

}
