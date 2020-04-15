package controler;

public class TransAdres {
    

    private String miejscowosc;  
    private String ulica;
    private String nrDomu;
    private String kodPocztowy;
    private Long id_adresu;

    
        public TransAdres()
    {
        this.miejscowosc = "";
        this.ulica = "";
        this.nrDomu = "";
        this.kodPocztowy = "";
        this.id_adresu = null;
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

    public String getnrDomu() {
        return nrDomu;
    }

    public void setnrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public Long getId_adresu() {
        return id_adresu;
    }

    public void setId_adresu(Long id_adresu) {
        this.id_adresu = id_adresu;
    }

    
    
}