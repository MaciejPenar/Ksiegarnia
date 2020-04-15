package controler;
        
        
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pracownik {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_pracownika;
    private String imie;
    private String nazwisko;
    private int telefon;
    private String stanowisko;
    
    @OneToMany (mappedBy = "pracownik")
    private Set<Zamowienie> zamowienie;

    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_adresu")
    private Adres adres;

    protected Pracownik() {}

    
      public Pracownik(Long id_pracownika, String imie, String nazwisko, int telefon, String stanowisko, Adres adres) {
        this.id_pracownika = id_pracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;        
        this.stanowisko = stanowisko;
        this.adres = adres;
        zamowienie = new HashSet<Zamowienie>();
    }
    
    public Pracownik(String imie, String nazwisko, int telefon, String stanowisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;        
        this.stanowisko = stanowisko;
        this.adres = adres;
        zamowienie = new HashSet<Zamowienie>();
    }

    public Long getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(Long id_pracownika) {
        this.id_pracownika = id_pracownika;
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


    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public Set<Zamowienie> getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Set<Zamowienie> zamowienie) {
        this.zamowienie = zamowienie;
    }
    
    

    
}
