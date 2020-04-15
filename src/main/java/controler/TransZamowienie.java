package controler;

public class TransZamowienie {


    private Long id_zamowienia;
    private String dataZamowienia;  
    private String dataOtrzymania;
    private int koszt;
    private String metodaPlatnosci;
    private String imie;
    private String nazwisko;
    private String nazwa;
    
    
     public TransZamowienie()
    {
        this.dataZamowienia = "";
        this.dataOtrzymania = "";
        this.koszt = 0;
        this.metodaPlatnosci = "";
        this.id_zamowienia = null;
        
    }

    public Long getId_zamowienia() {
        return id_zamowienia;
    }

    public void setId_zamowienia(Long id_zamowienia) {
        this.id_zamowienia = id_zamowienia;
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
    
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getKoszt() {
        return koszt;
    }

    public void setKoszt(int koszt) {
        this.koszt = koszt;
    }

    public String getMetodaPlatnosci() {
        return metodaPlatnosci;
    }

    public void setMetodaPlatnosci(String metodaPlatnosci) {
        this.metodaPlatnosci = metodaPlatnosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    
    
}
