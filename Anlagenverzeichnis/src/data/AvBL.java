
package data;

import java.io.Serializable;


public class AvBL implements Serializable{
    private String bezeichnung;
    private double ak,inbetriebnahme,nd;

    public AvBL(String bezeichnung, double ak, double inbetriebnahme, double nd) {
        this.bezeichnung = bezeichnung;
        this.ak = ak;
        this.inbetriebnahme = inbetriebnahme;
        this.nd = nd;
       
    }
    public AvBL(String line) {
        String[] token = line.split(";");
        bezeichnung = (token[0]);
        ak = Double.parseDouble(token[1].replace(",","."));
        inbetriebnahme= Double.parseDouble(token[2].replace(",","."));
        nd = Double.parseDouble(token[3].replace(",","."));
    }
    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getAK() {
        return ak;
    }

    public double getInbetriebnahme() {
        return inbetriebnahme;
    }

    public double getND() {
        return nd;
    }
    

}