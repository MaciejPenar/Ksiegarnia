package controler;

public class TransKoszyk
{

    private String nazwaKoszyka;
    private String nazwa;
    private int ilosc;

    public TransKoszyk()
    {
        this.nazwaKoszyka = "";
        this.nazwa="";
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
    
    public String getNazwaKoszyka() {
        return nazwaKoszyka;
    }

    public void setNazwaKoszyka(String nazwaKoszyka) {
        this.nazwaKoszyka = nazwaKoszyka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }






}
