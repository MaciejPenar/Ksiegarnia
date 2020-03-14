package controler;
        
        
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Autor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String imie;
    private String nazwisko;
    
    @ManyToMany 
    private Set<Ksiazka> ksiazki;
    
        
         protected Autor() {}
         
    Autor(Long id, String imie, String nazwisko) 
    {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        ksiazki = new HashSet<Ksiazka>();
    }
     
    Autor(String imie, String nazwisko) 
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        ksiazki = new HashSet<Ksiazka>();
    }

    public Set<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
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
    
    
    
}

   


