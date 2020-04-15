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
public class Klient {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_klienta;
    private String imie;
    private String nazwisko;
    private String email;
    

    @OneToMany (mappedBy = "klient")
    private Set<Zamowienie> zamowienie;
    
    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_adresu")
    private Adres adres;

    protected Klient() {}

    
      public Klient(Long id_klienta, String imie, String nazwisko, String email, Adres adres) {
        this.id_klienta = id_klienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;    
        this.adres = adres;
        zamowienie = new HashSet<Zamowienie>();
    }
    
    public Klient(String imie, String nazwisko, String email, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;     
        this.adres = adres;
        zamowienie = new HashSet<Zamowienie>();
    }

    public Long getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(Long id_klienta) {
        this.id_klienta = id_klienta;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    
    
    

    @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s]", id_klienta, imie, nazwisko, email);
    }

}
