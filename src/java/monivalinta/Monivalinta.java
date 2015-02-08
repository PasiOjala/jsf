/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monivalinta;

import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Pasi
 */
@Named
@SessionScoped
public class Monivalinta implements Serializable{

    HashMap<String,String> kysymysMap=new HashMap<>();
    ArrayList<String> KysymyksetJaVastaukset;
    
    
    ArrayList<String> kysymysLista=new ArrayList<>();
    ArrayList<String> oikeaVastausLista=new ArrayList<>();
    ArrayList<String> actualVastausLista=new ArrayList<>();

    ArrayList<String> a=new ArrayList<>();
    ArrayList<String> b=new ArrayList<>();
    ArrayList<String> c=new ArrayList<>();
    
    String vastaus=new String();

    public String getVastaus() {
        return vastaus;
    }

    public void setVastaus(String vastaus) {
        this.vastaus = vastaus;
        String actualVastaus=new String();
        int i=actualVastausLista.size();
        if (vastaus.equals("a")){
            actualVastaus=a.get(i);
        }
        if (vastaus.equals("b")){
            actualVastaus=b.get(i);
        }
        if (vastaus.equals("c")){
            actualVastaus=c.get(i);
        }
        
        actualVastausLista.add(actualVastaus);
    }

    public ArrayList<String> getActualVastausLista(boolean clear) {
        
        ArrayList<String> newList=new ArrayList<String>();
        for (String s: actualVastausLista){
            newList.add(s);
        }
        actualVastausLista=new ArrayList<>();
        return newList;
    }
    public ArrayList<String> getActualVastausLista() {
 return actualVastausLista;
    }
    public void setActualVastausLista(ArrayList<String> actualVastausLista) {
        this.actualVastausLista = actualVastausLista;
    }


    public Monivalinta() {
    
        kysymysMap.put("3*2", "6");
        kysymysMap.put("Elämän tarkoitus", "42");
        kysymysMap.put("Kissa vai koira", "Koira");
        kysymysMap.put("Kuka söi kesävoin", "Kissa");
        
        for (String k : kysymysMap.keySet()) {
            kysymysLista.add(k);
            ArrayList <String> temp=new ArrayList<>();
            temp.add(kysymysMap.get(k));
            oikeaVastausLista.add(kysymysMap.get(k));
            int i = 0;
            for (String väärät : kysymysMap.values()) {
                if (väärät.equals(kysymysMap.get(k))) {
                    continue;
                }
                temp.add(väärät);
                if (++i == 2) {
                    break;

                }
            }
            shuffle(temp);
            a.add(temp.remove(0));
            b.add(temp.remove(0));
            c.add(temp.remove(0));
        }
        
    }

    public ArrayList<String> getOikeaVastausLista() {
        return oikeaVastausLista;
    }

    public void setOikeaVastausLista(ArrayList<String> oikeaVastausLista) {
        this.oikeaVastausLista = oikeaVastausLista;
    }

    public HashMap<String,String> getKysymysMap() {
        return kysymysMap;
    }

    public ArrayList<String> getKysymysLista() {
        return kysymysLista;
    }

    public void setKysymysLista(ArrayList<String> kysymysLista) {
        this.kysymysLista = kysymysLista;
    }

    public ArrayList<String> getA() {
        return a;
    }

    public void setA(ArrayList<String> a) {
        this.a = a;
    }

    public ArrayList<String> getB() {
        return b;
    }

    public void setB(ArrayList<String> b) {
        this.b = b;
    }

    public ArrayList<String> getC() {
        return c;
    }

    public void setC(ArrayList<String> c) {
        this.c = c;
    }

    public void setKysymysMap(HashMap<String, String> kysymysMap) {
        this.kysymysMap = kysymysMap;
    }
    
    public ArrayList<String> getKysymyksetJaVastaukset() {

        ArrayList<String> ret = new ArrayList<>();
        for (String k : kysymysMap.keySet()) {
            ret.add(k);
            ret.add(kysymysMap.get(k));
            int i = 0;
            for (String väärät : kysymysMap.values()) {
                if (väärät.equals(kysymysMap.get(k))) {
                    continue;
                }
                ret.add(väärät);
                if (++i == 2) {
                    break;

                }
            }
        }
        return ret;
    }
    public String getNimi(){
        return "Monivalinta";
    }
    public ArrayList<Boolean> tarkista(){
        ArrayList<Boolean> ret=new ArrayList<Boolean>();
        for (int i=0;i<oikeaVastausLista.size();i++){
            if (oikeaVastausLista.get(i).equals(actualVastausLista.get(i)))
                ret.add(true);
            else ret.add(false);
        }
        actualVastausLista=new ArrayList<>();
        return ret;
    }

}
