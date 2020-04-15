package controler;

public class TransKlient
{
    private String imie;
    private String nazwisko;
    private String email;
    private Long id_klienta;

    public TransKlient()
    {
        this.imie = "";
        this.nazwisko = "";
        this.email = "";
        this.id_klienta = null;
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

    public Long getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(Long id_klienta) {
        this.id_klienta = id_klienta;
    }




}
