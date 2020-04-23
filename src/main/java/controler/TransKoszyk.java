package controler;

public class TransKoszyk
{
     private Long id_koszyka;

    private int ilosc;

    public TransKoszyk()
    {
        this.ilosc = 1;
        this.id_koszyka = null;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Long getId_koszyka() {
        return id_koszyka;
    }

    public void setId_koszyka(Long id_koszyka) {
        this.id_koszyka = id_koszyka;
    }






}
