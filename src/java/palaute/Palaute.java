/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palaute;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Pasi
 */
@Named
@ApplicationScoped
public class Palaute implements Serializable {

    String palauteTeksti;    
    
    
    public String getPalauteTeksti() {
        return palauteTeksti;
    }

    public void setPalauteTeksti(String palauteTeksti) {
        this.palauteTeksti = palauteTeksti;
    }
}
