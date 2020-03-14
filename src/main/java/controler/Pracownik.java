package controler;
        
        
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pracownik {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String imie;
    private String nazwisko;
    private int telefon;
    private String stanowisko;
    


    protected Pracownik() {}

    
      public Pracownik(Long id, String imie, String nazwisko, int telefon, String stanowisko) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;        
        this.stanowisko = stanowisko;
    }
    
    public Pracownik(String imie, String nazwisko, int telefon, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;        
        this.stanowisko = stanowisko;
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

    
}
