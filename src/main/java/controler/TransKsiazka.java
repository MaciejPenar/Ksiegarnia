package controler;

public class TransKsiazka {
    

    private Long id_ksiazki;
    private String nazwa;  
    private String autor;
    private String gatunek;
    private int cena;
    private String dataZamowienia;  
    private String dataOtrzymania;
    
public TransKsiazka()
    {
        this.nazwa = "";
        this.autor = "";
        this.gatunek = "";
        this.cena = 0;
        this.dataZamowienia = "";
        this.dataOtrzymania = "";
        this.id_ksiazki = null;
    }
    
    
    public long getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(long id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }



    
    
}
