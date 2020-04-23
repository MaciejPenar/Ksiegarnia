package controler;
   
        
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Metoda {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long id_metody;
    private String nazwa;

    @OneToMany(mappedBy = "metoda") 
    private Set<Zamowienie> zamowienie;

    protected Metoda() {}
    
    public Metoda(Long id_metody, String nazwa) {
        this.id_metody= id_metody;
        this.nazwa = nazwa;
        this.zamowienie = new HashSet<Zamowienie>();
    }

     public Metoda(String nazwa) {
        this.nazwa = nazwa;
        this.zamowienie = new HashSet<Zamowienie>();
    }

    public Long getId_metody() {
        return id_metody;
    }

    public void setId_metody(Long id_metody) {
        this.id_metody = id_metody;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Set<Zamowienie> getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Set<Zamowienie> zamowienie) {
        this.zamowienie = zamowienie;
    }
     
     
}