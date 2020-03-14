package controler;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ksiazka {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nazwa;
    private String gatunek;
    private int cena;
    
    
    @ManyToMany 
    private Set<Autor> autorzy;
    
    @ManyToMany
    private Set<Gatunek> gatunki;
    
    @ManyToOne 
    private Zamowienie zamowienie;
    
    protected Ksiazka() {}
    
    
    Ksiazka(Long id, String nazwa, String gatunek, int cena) 
    {
        this.id = id;
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.cena = cena;
        autorzy = new HashSet<Autor>();
        gatunki = new HashSet<Gatunek>();
        zamowienie = null;

    }
    
    Ksiazka(String nazwa, String gatunek, int cena) 
    {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.cena = cena;
        autorzy = new HashSet<Autor>();
        gatunki = new HashSet<Gatunek>();
        zamowienie = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Gatunek> getGatunki() {
        return gatunki;
    }

    public void setGatunki(Set<Gatunek> gatunki) {
        this.gatunki = gatunki;
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

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Set<Autor> getAutorzy() {
        return autorzy;
    }

    public void setAutorzy(Set<Autor> autorzy) {
        this.autorzy = autorzy;
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }


 


        @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s]", id, nazwa, gatunek);
    }
    
    
}
