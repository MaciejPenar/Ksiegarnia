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
public class Koszyk {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_koszyka;
    private int ilosc;
    
    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_zamowienia")
    private Zamowienie zamowienie;
    
    @ManyToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_ksiazki")
    private Ksiazka ksiazka;
     

    
         protected Koszyk() {}
         
       public Koszyk(Long id_koszyka, int ilosc, Ksiazka ksiazka) {
        this.id_koszyka = id_koszyka;
        this.ilosc = ilosc;
        this.ksiazka = ksiazka;
        this.zamowienie = zamowienie;
    }
          
            public Koszyk(int ilosc, Ksiazka ksiazka) {
        this.ilosc = ilosc;
        this.ksiazka = ksiazka;
        this.zamowienie = zamowienie;
    }

    public Long getId_koszyka() {
        return id_koszyka;
    }

    public void setId_koszyka(Long id_koszyka) {
        this.id_koszyka = id_koszyka;
    }



    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
    

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Zamowienie getZamowienie() {
        return zamowienie;
    }

    public void setZamowienie(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
    }
    
          
}
