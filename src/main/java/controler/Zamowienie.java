package controler;

import java.util.HashSet;
import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;

@Entity
public class Zamowienie {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String dataZamowienia;
    private String dataOtrzymania;
    private int koszt;
    private String metodaPlatnosci;
    
    @ManyToOne 
    private Klient klient;
    
    @ManyToOne
    private Ksiazka ksiazka;
    
     protected Zamowienie() {}

       public Zamowienie(Long id, String dataZamowienia, String dataOtrzymania, int koszt, String metodaPlatnosci, Klient klient, Ksiazka ksiazka) {
        this.id = id;
        this.dataZamowienia = dataZamowienia;
        this.dataOtrzymania = dataOtrzymania;
        this.koszt = koszt;
        this.metodaPlatnosci = metodaPlatnosci;
        this.klient = klient;
        this.ksiazka = ksiazka;
    }
     
    public Zamowienie(String dataZamowienia, String dataOtrzymania, int koszt, String metodaPlatnosci, Klient klient, Ksiazka ksiazka) {
        this.dataZamowienia = dataZamowienia;
        this.dataOtrzymania = dataOtrzymania;
        this.koszt = koszt;
        this.metodaPlatnosci = metodaPlatnosci;
        this.klient = klient;
        this.ksiazka = ksiazka;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }
    
    @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s - %s - %s]", id, dataZamowienia, dataOtrzymania, koszt, metodaPlatnosci);
    }
    
}
