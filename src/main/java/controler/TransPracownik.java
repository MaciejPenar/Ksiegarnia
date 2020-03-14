package controler;

public class TransPracownik
{
    private String id;
    private String imie;
    private String nazwisko;
    private String stelefon;
    private String stanowisko;

    public TransPracownik()
    {
        this.imie = "";
        this.nazwisko = "";
        this.stelefon = "";
        this.stanowisko = "";
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getStelefon() {
        return stelefon;
    }

    public void setStelefon(String stelefon) {
        this.stelefon = stelefon;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    

    





}
