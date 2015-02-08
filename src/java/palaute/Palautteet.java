/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palaute;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Pasi
 */
//public class Palautteet {
//    ArrayList<Palaute> kaikkiPalautteet=new ArrayList<>();
//
//    public ArrayList<Palaute> getKaikkiPalautteet() {
//        return kaikkiPalautteet;
//    }
//
//    public void setKaikkiPalautteet(ArrayList<Palaute> palautteet) {
//        this.kaikkiPalautteet = palautteet;
//    }
//    public void lisääPalaute(Palaute palaute) {
//         kaikkiPalautteet.add(palaute);
//
//    }
//
//}
@Named
@ApplicationScoped
public class Palautteet {

//    @Inject
//    Palaute palaute;

    public ArrayList<Palaute> getKaikkiPalautteet() {
        return kaikkiPalautteet;
    }

    public void setKaikkiPalautteet(ArrayList<Palaute> kaikkiPalautteet) {
        this.kaikkiPalautteet = kaikkiPalautteet;
    }
    ArrayList<Palaute> kaikkiPalautteet=new ArrayList<>();
    public void lisää(Palaute palaute){
        kaikkiPalautteet.add(palaute);
    }
}