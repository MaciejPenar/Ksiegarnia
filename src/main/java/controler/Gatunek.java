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
public class Gatunek {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nazwa;
    
    @ManyToMany 
    private Set<Ksiazka> ksiazki;
    
    protected Gatunek() {}
    
    Gatunek(Long id, String nazwa) 
    {
        this.id = id;
        this.nazwa = nazwa;
        ksiazki = new HashSet<Ksiazka>();
    }
    
        Gatunek(String nazwa) 
    {
        this.nazwa = nazwa;
        ksiazki = new HashSet<Ksiazka>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Set<Ksiazka> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazka> ksiazki) {
        this.ksiazki = ksiazki;
    }
        
        
        
    
    
}
