
package model;


public enum AvEnum {
    BEZEICHNUNG("Bezeichnung"),
    AK("AK"),
    INBETRIEBNAHME("Inbetriebnahme"),
    ND("ND"),
    BISHND("bish. ND"),
    AFABISHER("AfA bisher"),
    WERTVORAFA("Wert vor AfA"),
    AFADJ("AfA d. J."),
    BW("Bw 31.12");
    
    private String name;

    private AvEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
