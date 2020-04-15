package controler;

public class TransPracownik
{
    private String imie;
    private String nazwisko;
    private int telefon;
    private String stanowisko;
    private Long id_pracownika;

    public TransPracownik()
    {
        this.imie = "";
        this.nazwisko = "";
        this.telefon = 0;
        this.stanowisko = "";
        this.id_pracownika = null;
        
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

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Long getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(Long id_pracownika) {
        this.id_pracownika = id_pracownika;
    }



}
