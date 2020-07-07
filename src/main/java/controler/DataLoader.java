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
        adresRepository.save(new Adres("Kraków", "Krółlewska", "4", "10-111"));
        adresRepository.save(new Adres("Poznań", "Lipowa", "17", "10-111"));
        adresRepository.save(new Adres("Szczecin", "Polna", "312", "10-111"));
        adresRepository.save(new Adres("Rymanow", "Szkolna", "17", "10-111"));
        adresRepository.save(new Adres("Sanok", "Ogrodowa", "112", "10-111"));
       
        var a1 = new Adres("Krosno", "Zielona", "1", "10-200");
        var a2 = new Adres("Rzeszow", "Brzozowa", "19", "12-300");
        var a3 = new Adres("Rzeszow", "Midowa", "12", "20-150");
        var a4 = new Adres("Rzeszow", "Krotka", "1", "19-140");
        var a5 = new Adres("Krosno", "Lewakowskiego", "3", "11-200");
        var a6 = new Adres("Krosno", "Krakowska", "43", "30-150");
        var a7 = new Adres("Szczecin", "Polna", "312", "10-651");
        var a8 = new Adres("Rymanow", "Szkolna", "17", "15-500");
        var a9 = new Adres("Sanok", "Ogrodowa", "112", "35-550");
	var a10 = new Adres("Torun", "3 Maja", "5a", "12-220");
	var a11 = new Adres("Bialystok", "Mikolowska", "12", "10-200");
	var a12 = new Adres("Katowice", "Mostowa", "1", "10-400");
	var a13 = new Adres("Poznan", "Aleja Niepodleglosci", "1b", "10-311");
	var a14 = new Adres("Bydgoszcz", "Obornicka", "43", "10-311");
	var a15 = new Adres("Gdansk", "Okopowa", "65", "10-121");
	var a16 = new Adres("Wroclaw", "Oświecimska", "43c", "10-131");
	var a17 = new Adres("Warszawa", "Piwna", "14", "10-331");
	var a18 = new Adres("Krakow", "Boleslawa Prusa", "2d", "13-111");
	var a19 = new Adres("Gdynia", "Czestochowska", "5", "12-121");
	var a20 = new Adres("Lodz", "Ogrodowa", "112", "11-112");
        
        
	klientRepository.save(new Klient("Jan","Kowalski","jankowalski@gmail.com", a2));
	klientRepository.save(new Klient("Adam","Nowak","adamnowak12@gmail.com", a6));             
	klientRepository.save(new Klient("Kinga","Sarna","ksarna23@gmail.com",a7)); 
	klientRepository.save(new Klient("Piotr","Śliwa","piotrus@gmail.com",a8)); 
	klientRepository.save(new Klient("Mariusz","Wałęsa","walesa23@gmail.com",a9)); 
	klientRepository.save(new Klient("Anna","Wojcik","Anna@gmail.com",a10));
	klientRepository.save(new Klient("Maria","Nowak","Maria@gmail.com",a11)); 
	klientRepository.save(new Klient("Katarzyna","Wisniewska","Katarzyna@gmail.com",a12)); 
	klientRepository.save(new Klient("Malgorzata","Nowak","Malgorzata@gmail.com",a13)); 
	klientRepository.save(new Klient("Agnieszka","Apanowicz","Agnieszka@gmail.com",a14)); 
	klientRepository.save(new Klient("Barbara","Marciniak","Barbara@gmail.com",a15)); 
	klientRepository.save(new Klient("Ewa","Kowalczyk","Ewa@gmail.com",a16)); 
	klientRepository.save(new Klient("Krystyna","Wiśniewska","Krystyna@gmail.com",a17)); 
	klientRepository.save(new Klient("Elzbieta","Nowak","Elzbieta@gmail.com",a18)); 
	klientRepository.save(new Klient("Magdalena","Kowalczyk","Magdalena@gmail.com",a19)); 
	klientRepository.save(new Klient("Zofia","Wójcik","Zofia@gmail.com",a20)); 


      
        ksiazkaRepository.save(new Ksiazka("Teatr wskrzeszonych","Jachyra Tatiana","kryminal, sensacja, thriller", 21));
        ksiazkaRepository.save(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", "Poezja epicka" , 45));
        ksiazkaRepository.save(new Ksiazka("Przedwiośnie", "Stefan Żeromski", "Powieść, Fikcja historyczna" , 25));
        ksiazkaRepository.save(new Ksiazka("Balladyna", "Juliusz SĹ‚owacki", "dramat" , 30));
        ksiazkaRepository.save(new Ksiazka("Ostatnie Życzenie", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 28));
        ksiazkaRepository.save(new Ksiazka("Czas pogardy", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 24));
        ksiazkaRepository.save(new Ksiazka("Chrzest ognia", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 40));
        ksiazkaRepository.save(new Ksiazka("Poranki na Miodowej 1", "Joanna Szaranska", "Literatura obyczajowa, romans", 35));
	ksiazkaRepository.save(new Ksiazka("Behawiorysta", "Remigiusz Mroz", "Fikcja, dreszczowiec", 45));
	ksiazkaRepository.save(new Ksiazka("Ekspozycja", "Remigiusz Mroz", "Fikcja, Powiesc kryminalna", 23));
	ksiazkaRepository.save(new Ksiazka("Nieodnaleziona", "Remigiusz Mroz", "Fikcja, Dreszczowiec", 21));
	ksiazkaRepository.save(new Ksiazka("Kasacja", "Remigiusz Mroz", "Fikcja, Dreszczowiec, Opowiadanie prawnicze", 31));
	ksiazkaRepository.save(new Ksiazka("Nieodgadniona", "Remigiusz Mroz", "Fikcja, Powiesc kryminalna, Dreszczowiec", 25));
	ksiazkaRepository.save(new Ksiazka("Immunitet", "Remigiusz Mroz", "Fikcja, Powiesc kryminalna", 26));
	ksiazkaRepository.save(new Ksiazka("Inwigilacja", "Remigiusz Mroz", "Fikcja, Powiesc kryminalna", 34));
	ksiazkaRepository.save(new Ksiazka("Potop", "Henryk Sienkiewicz", "Fikcja historyczna", 25));
	ksiazkaRepository.save(new Ksiazka("W pustyni i w puszczy", "Henryk Sienkiewicz", "Literatura przygodowa", 45));
	ksiazkaRepository.save(new Ksiazka("Krzyzacy", "Henryk Sienkiewicz", "Powiesc, Fikcja historyczna", 35));
	ksiazkaRepository.save(new Ksiazka("Quo vadis", "Henryk Sienkiewicz", "Powiesc, Fikcja historyczna", 25));
	ksiazkaRepository.save(new Ksiazka("Pan Wolodyjowski", "Henryk Sienkiewicz", "Fikcja historyczna", 16));
	ksiazkaRepository.save(new Ksiazka("Ogniem i mieczem", "Henryk Sienkiewicz", "powiesc historyczna", 27));
	ksiazkaRepository.save(new Ksiazka("Dwie laki", "Henryk Sienkiewicz", "Basn", 26));
	ksiazkaRepository.save(new Ksiazka("Konrad Wallenrod", "Adam Mickiewicz", "powiesc poetycka", 25));
	ksiazkaRepository.save(new Ksiazka("Osiedle RZNiW", "Mroz Remigiusz", "Kryminal, sensacja, thriller", 25));
	ksiazkaRepository.save(new Ksiazka("Kwestia ceny", "Miloszewski Zygmunt", "Kryminal, sensacja, thriller", 31));
	ksiazkaRepository.save(new Ksiazka("Mam watpliwosc", "Radomska Aleksandra", "Literatura piekna polska", 34));
	ksiazkaRepository.save(new Ksiazka("Red, White Royal Blue", "McQuiston Casey", "Romans", 39));
	ksiazkaRepository.save(new Ksiazka("Ballada ptakow i wezy", "Collins Suzanne", "Literatura dla mlodziezy", 55));
	ksiazkaRepository.save(new Ksiazka("Pod kluczem", "Ruth Ware", "thriller", 23));
	ksiazkaRepository.save(new Ksiazka("Smiertelne kłamstwa", "Sarah A. Denzil", "thriller", 19));
	ksiazkaRepository.save(new Ksiazka("Wielbiciel", "Max Czornyj", "thriller", 17));
	ksiazkaRepository.save(new Ksiazka("Las i ciemnosc", "Marta Matyszczak", "komedia kryminalna", 45));
	ksiazkaRepository.save(new Ksiazka("Moja doskonala zona", "Samantha Downing", "thriller", 35));
	ksiazkaRepository.save(new Ksiazka("Prawo krwi", "Tess Gerritsen", "thriller", 45));
	ksiazkaRepository.save(new Ksiazka("Przekret", "Paulina Swist", "thriller", 28));
	ksiazkaRepository.save(new Ksiazka("Bajka nie bajka", "Krystyna Wajda", "poezja i dramat", 32));
	ksiazkaRepository.save(new Ksiazka("W kokonie dnia", "Krystyna Wajda", "poezja i dramat", 26));
	ksiazkaRepository.save(new Ksiazka("Dziejba Lesna", "Boleslaw Lesmian", "poezja i dramat", 25));
	ksiazkaRepository.save(new Ksiazka("Kielich upojenia", "Oton Zupancic", "poezja i dramat", 24));
	ksiazkaRepository.save(new Ksiazka("Przepowiesc w scinkach", "Marta Podgornik", "poezja i dramat", 31));
	ksiazkaRepository.save(new Ksiazka("Odlegle brzegi", "Kristin Hannah", "literatura obyczajowa", 15));
	ksiazkaRepository.save(new Ksiazka("Podroz nieslubna", "Christina Lauren", "literatura obyczajowa", 29));
	ksiazkaRepository.save(new Ksiazka("W samym sercu morza", "Jojo Moyes", "literatura obyczajowa", 35));
	ksiazkaRepository.save(new Ksiazka("Upior w ruderze", "Andrzej Pilipiuk", "fantasy", 24));
	ksiazkaRepository.save(new Ksiazka("Mamidlo", "Barbara Janas-Dudek", "", 48));
	ksiazkaRepository.save(new Ksiazka("Green Town", "Ray Bradbury", "fantasy", 45));
	ksiazkaRepository.save(new Ksiazka("Miecz i Cytadela", "Gene Wolfe", "fantasy", 55));
	ksiazkaRepository.save(new Ksiazka("Abominacja", "Dan Simmons", "horror, fantastyka grozy", 32));
	ksiazkaRepository.save(new Ksiazka("Gwiazdy moim przeznaczeniem", "Alfred Bester", "science fiction", 40));


        pracownikRepository.save(new Pracownik("Jakub", "Baran", 123456789, "administrator", a1 ));
        pracownikRepository.save(new Pracownik("Emilian", "Karnasiewicz", 345345345, "moderator", a3 ));
        pracownikRepository.save(new Pracownik("Wojciech", "Gwizdak", 444444444, "logistyk", a4 ));
        pracownikRepository.save(new Pracownik("Maciej", "Penar", 656565656, "moderator", a5 ));
        

      metodaRepository.save(new Metoda("Gotówka za pobraniem"));
      metodaRepository.save(new Metoda("Przelew bankowy"));
      metodaRepository.save(new Metoda("BLIK"));
      
    }

}
