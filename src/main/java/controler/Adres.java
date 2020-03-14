package controler;

        
        
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adres {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String miejscowosc;
    private String ulica;
    private int nrDomu;
    private String kodPocztowy;

    @OneToMany 
    private Set<Klient> klienci;
        
    @OneToMany 
    private Set<Pracownik> pracownicy;

    protected Adres() {}
    
    public Adres(Long id, String miejscowosc, String ulica, int nrDomu, String kodPocztowy) {
        this.id = id;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;     
        this.kodPocztowy = kodPocztowy;  
        this.klienci = klienci;
        this.pracownicy = pracownicy;
    }

    public Adres( String miejscowosc, String ulica, int nrDomu, String kodPocztowy) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;     
        this.kodPocztowy = kodPocztowy;  
        this.klienci = klienci;
        this.pracownicy = pracownicy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
    
    

}