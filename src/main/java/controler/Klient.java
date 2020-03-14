package controler;
        
        
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Klient {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String imie;
    private String nazwisko;
    private String email;
    

    @OneToMany 
    private Set<Zamowienie> zamowienia;

    protected Klient() {}

    
      public Klient(Long id, String imie, String nazwisko, String email) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;        
        zamowienia = new HashSet<Zamowienie>();
    }
    
    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;        
        zamowienia = new HashSet<Zamowienie>();
    }

    public Set<Zamowienie> getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(Set<Zamowienie> zamowienia) {
        this.zamowienia = zamowienia;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    @Override
    public String toString() {
        return String.format("[%s - %s - %s - %s]", id, imie, nazwisko, email);
    }

}
