package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    private AdresRepository adresRepository;
    private KlientRepository klientRepository;
    private KsiazkaRepository ksiazkaRepository;
    private PracownikRepository pracownikRepository;
    private ZamowienieRepository zamowienieRepository;
    private MetodaRepository metodaRepository;

    @Autowired
    public DataLoader (AdresRepository adresRepository, KlientRepository klientRepository, KsiazkaRepository ksiazkaRepository, PracownikRepository pracownikRepository, ZamowienieRepository zamowienieRepository, MetodaRepository metodaRepository) {
        this.adresRepository =  adresRepository;
        this.klientRepository = klientRepository;
        this.ksiazkaRepository = ksiazkaRepository;
        this.pracownikRepository = pracownikRepository;
        this.zamowienieRepository = zamowienieRepository; 
        this.metodaRepository = metodaRepository;
    }
    


    public void run(ApplicationArguments args) {
        
        adresRepository.save(new Adres("Krosno", "Zielona", "1", "10-000"));
        adresRepository.save(new Adres("Rzeszów", "Długa", "19", "10-100"));
        adresRepository.save(new Adres("Warszawa", "Szeroka", "12", "10-111"));
        adresRepository.save(new Adres("Kraków", "Królewska", "4", "10-111"));
        adresRepository.save(new Adres("Poznań", "Lipowa", "17", "10-111"));
        
        var a1 = new Adres("Krosno", "Zielona", "1", "10-000");
        var a2 = new Adres("Rzeszow", "Długa", "19", "10-100");
        var a3 = new Adres("Rzeszow", "Midowa", "12", "10-100");
        var a4 = new Adres("Rzeszow", "Krotka", "1", "10-100");
        var a5 = new Adres("Krosno", "Lewakowskiego", "3", "10-100");
        var a6 = new Adres("Krosno", "Krakowska", "43", "10-100");
        
        
      klientRepository.save(new Klient("Jan","Kowalski","jankowalski@gmail.com", a2));
      klientRepository.save(new Klient("Adam","Nowak","adamnowak12@gmail.com", a6));             
      //  klientRepository.save(new Klient("Kinga","Sarna","ksarna23@gmail.com")); 
      //  klientRepository.save(new Klient("Piotr","Żyła","piotrus@gmail.com")); 
      //  klientRepository.save(new Klient("Mariusz","Walęsa","walesa23@gmail.com")); 

      
        ksiazkaRepository.save(new Ksiazka("Teatr wskrzeszonych","kryminal, sensacja, thriller", "" , 21));
        ksiazkaRepository.save(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", "Poezja epicka" , 45));
        ksiazkaRepository.save(new Ksiazka("Przedwiośnie", "Stefan Żeromski", "Powieść, Fikcja historyczna" , 25));
        ksiazkaRepository.save(new Ksiazka("Balladyna", "Juliusz Słowacki", "dramat" , 30));
        ksiazkaRepository.save(new Ksiazka("Ostatnie Życzenie", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 28));

        
        pracownikRepository.save(new Pracownik("Jakub", "Baran", 123456789, "administrator", a1 ));
       pracownikRepository.save(new Pracownik("Emilian", "Karnasiewicz", 345345345, "moderator", a3 ));
      pracownikRepository.save(new Pracownik("Wojciech", "Gwizdak", 444444444, "logistyk", a4 ));
      pracownikRepository.save(new Pracownik("Maciej", "Penar", 656565656, "moderator", a5 ));
        

      metodaRepository.save(new Metoda("Gotówka za pobraniem"));
      metodaRepository.save(new Metoda("Przelew bankowy"));
      metodaRepository.save(new Metoda("BLIK"));
      
    }

}









