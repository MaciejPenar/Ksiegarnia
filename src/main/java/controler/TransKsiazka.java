/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

public class TransKsiazka {
    
    private String id;
    private String nazwa;  
    private String gatunek;
    private String scena;
    private String dataZamowienia;  
    private String dataOtrzymania;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getScena() {
        return scena;
    }

    public void setScena(String scena) {
        this.scena = scena;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getDataOtrzymania() {
        return dataOtrzymania;
    }

    public void setDataOtrzymania(String dataOtrzymania) {
        this.dataOtrzymania = dataOtrzymania;
    }
    
    
}
