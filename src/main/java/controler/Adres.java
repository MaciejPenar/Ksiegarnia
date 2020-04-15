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

    private Long id_adresu;
    private String miejscowosc;
    private String ulica;
    private String nrDomu;
    private String kodPocztowy;

    @OneToMany(mappedBy = "adres") 
    private Set<Klient> klient;
        
    @OneToMany (mappedBy = "adres")
    private Set<Pracownik> pracownik;

    protected Adres() {}
    
    public Adres(Long id_adresu, String miejscowosc, String ulica, String nrDomu, String kodPocztowy) {
        this.id_adresu = id_adresu;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;     
        this.kodPocztowy = kodPocztowy;  
        this.klient = new HashSet<Klient>();
        this.pracownik = new HashSet<Pracownik>();
    }

    public Adres( String miejscowosc, String ulica, String nrDomu, String kodPocztowy) {
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nrDomu = nrDomu;     
        this.kodPocztowy = kodPocztowy;  
        this.klient = new HashSet<Klient>();
        this.pracownik = new HashSet<Pracownik>();
    }

    public Long getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(Long id_adresu) {
        this.id_adresu = id_adresu;
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

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public Set<Klient> getKlient() {
        return klient;
    }

    public void setKlient(Set<Klient> klient) {
        this.klient = klient;
    }

    public Set<Pracownik> getPracownik() {
        return pracownik;
    }

    public void setPracownik(Set<Pracownik> pracownik) {
        this.pracownik = pracownik;
    }
}