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

public class Koszyk {
    
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_koszyka;
     
     
    @OneToMany(mappedBy = "koszyk")
    private Set<Ksiazka> ksiazka; 
    
         protected Koszyk() {}
         
          public Koszyk(Long id_koszyka, Ksiazka ksiazka) {
        this.id_koszyka = id_koszyka;
        this.ksiazka = new HashSet<Ksiazka>();
    }

    public Long getId_koszyka() {
        return id_koszyka;
    }

    public void setId_koszyka(Long id_koszyka) {
        this.id_koszyka = id_koszyka;
    }

    public Set<Ksiazka> getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Set<Ksiazka> ksiazka) {
        this.ksiazka = ksiazka;
    }
    
          
          
}
