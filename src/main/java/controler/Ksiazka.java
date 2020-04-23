package controler;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ksiazka {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_ksiazki;
    private String nazwa;
    private String autor;
    private String gatunek;
    private int cena;
    
    
    
    @OneToMany(mappedBy = "ksiazka")
    private Set<Koszyk> koszyk; 
    
    protected Ksiazka() {}
    
    
    public Ksiazka(Long id_ksiazki, String nazwa, String autor, String gatunek, int cena) 
    {
        this.id_ksiazki = id_ksiazki;
        this.nazwa = nazwa;
        this.cena = cena;
        this.autor = autor;
        this.gatunek = gatunek;
        this.koszyk = new HashSet<Koszyk>();

    }
    
    public Ksiazka(String nazwa, String autor, String gatunek, int cena) 
    {
        this.nazwa = nazwa;
        this.cena = cena;
        this.autor = autor;
        this.gatunek = gatunek;
        this.koszyk = new HashSet<Koszyk>();
    }

    public Long getId_ksiazki() {
        return id_ksiazki;
    }

    public void setId_ksiazki(Long id_ksiazki) {
        this.id_ksiazki = id_ksiazki;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public Set<Koszyk> getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(Set<Koszyk> koszyk) {
        this.koszyk = koszyk;
    }

 
    

        @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s]", id_ksiazki, nazwa, gatunek, koszyk);

    }
    
    
}
