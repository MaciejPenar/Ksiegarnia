package controler;

import java.util.HashSet;
import javax.persistence.Entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Zamowienie {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_zamowienia;
    private String dataZamowienia;
    private String dataOtrzymania;
    private int koszt;
    private String metodaPlatnosci;
    
    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_klienta")
    private Klient klient;
    
    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_pracownika")
    private Pracownik pracownik;
    
   @OneToMany(mappedBy = "zamowienie")
    private Set<Ksiazka> ksiazka;
    
     protected Zamowienie() {}

       public Zamowienie(Long id_zamowienia, String dataZamowienia, String dataOtrzymania, int koszt, String metodaPlatnosci,Klient klient, Ksiazka ksiazka) {
        this.id_zamowienia = id_zamowienia;
        this.dataZamowienia = dataZamowienia;
        this.dataOtrzymania = dataOtrzymania;
        this.koszt = koszt;
        this.metodaPlatnosci = metodaPlatnosci;
        this.klient = klient;
        this.pracownik = pracownik;
        this.ksiazka = new HashSet<Ksiazka>();
    }
     
    public Zamowienie(String dataZamowienia, String dataOtrzymania, int koszt, String metodaPlatnosci,Klient klient, Ksiazka ksiazka) {
        this.dataZamowienia = dataZamowienia;
        this.dataOtrzymania = dataOtrzymania;
        this.koszt = koszt;
        this.metodaPlatnosci = metodaPlatnosci;
        this.klient = klient;
        this.pracownik = pracownik;
        this.ksiazka = new HashSet<Ksiazka>();
    }

       public Zamowienie(Long id_zamowienia, String dataZamowienia, String dataOtrzymania, int koszt, String metodaPlatnosci) {
        this.id_zamowienia = id_zamowienia;
        this.dataZamowienia = dataZamowienia;
        this.dataOtrzymania = dataOtrzymania;
        this.koszt = koszt;
        this.metodaPlatnosci = metodaPlatnosci;
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

    public int getKoszt() {
        return koszt;
    }

    public String getMetodaPlatnosci() {
        return metodaPlatnosci;
    }

    public void setMetodaPlatnosci(String metodaPlatnosci) {
        this.metodaPlatnosci = metodaPlatnosci;
    }
    
    public void setKoszt(int koszt) {
        this.koszt = koszt;
    }

    public Pracownik getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Set<Ksiazka> getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Set<Ksiazka> ksiazka) {
        this.ksiazka = ksiazka;
    }
    
    
    
    @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s - %s - %s]", id_zamowienia, dataZamowienia, dataOtrzymania, koszt, metodaPlatnosci);
    }
    
}
