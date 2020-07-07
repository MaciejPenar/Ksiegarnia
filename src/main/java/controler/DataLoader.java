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
        adresRepository.save(new Adres("Szczecin", "Polna", "312", "10-111"));
        adresRepository.save(new Adres("Rymanow", "Szkolna", "17", "10-111"));
/*8*/ 	adresRepository.save(new Adres("Sanok", "Ogrodowa", "112", "10-111"));

        var a1 = new Adres("Krosno", "Zielona", "1", "10-200");
        var a2 = new Adres("Rzeszów", "Brzozowa", "19", "12-300");
        var a3 = new Adres("Rzeszów", "Midowa", "12", "20-150");
        var a4 = new Adres("Rzeszów", "Krótka", "1", "19-140");
        var a5 = new Adres("Krosno", "Lewakowskiego", "3", "11-200");
        var a6 = new Adres("Krosno", "Krakowska", "43", "30-150");
        var a7 = new Adres("Szczecin", "Polna", "312", "10-651");
        var a8 = new Adres("Rymanów", "Szkolna", "17", "15-500");
        var a9 = new Adres("Sanok", "Ogrodowa", "112", "35-550");
	var a10 = new Adres("Toruń", "3 Maja", "5a", "12-220");
	var a11 = new Adres("Białystok", "Mikołowska", "12", "10-200");
	var a12 = new Adres("Katowice", "Mostowa", "1", "10-400");
	var a13 = new Adres("Poznań", "Aleja Niepodległości", "1b", "10-311");
	var a14 = new Adres("Bydgoszcz", "Obornicka", "43", "10-311");
	var a15 = new Adres("Gdańsk", "Okopowa", "65", "10-121");
	var a16 = new Adres("Wrocław", "Oświecimska", "43c", "10-131");
	var a17 = new Adres("Warszawa", "Piwna", "14", "10-331");
	var a18 = new Adres("Kraków", "Bolesława Prusa", "2d", "13-111");
	var a19 = new Adres("Gdynia", "Częstochowska", "5", "12-121");
	var a20 = new Adres("Lódź", "Ogrodowa", "112", "11-112");
        
        
	klientRepository.save(new Klient("Jan","Kowalski","jankowalski@gmail.com", a2));
	klientRepository.save(new Klient("Adam","Nowak","adamnowak12@gmail.com", a6));             
	klientRepository.save(new Klient("Kinga","Sarna","ksarna23@gmail.com",a7)); 
	klientRepository.save(new Klient("Piotr","Głowa","piotrus@gmail.com",a8)); 
	klientRepository.save(new Klient("Mariusz","Wałęsa","walesa23@gmail.com",a9)); 
	klientRepository.save(new Klient("Anna","Wójcik","Anna@gmail.com",a10));
	klientRepository.save(new Klient("Maria","Nowak","Maria@gmail.com",a11)); 
	klientRepository.save(new Klient("Katarzyna","Wiśniewska","Katarzyna@gmail.com",a12)); 
	klientRepository.save(new Klient("Małgorzata","Nowak","Malgorzata@gmail.com",a13)); 
	klientRepository.save(new Klient("Agnieszka","Apanowicz","Agnieszka@gmail.com",a14)); 
	klientRepository.save(new Klient("Barbara","Marciniak","Barbara@gmail.com",a15)); 
	klientRepository.save(new Klient("Ewa","Kowalczyk","Ewa@gmail.com",a16)); 
	klientRepository.save(new Klient("Krystyna","Wiśniewska","Krystyna@gmail.com",a17)); 
	klientRepository.save(new Klient("Elzbieta","Nowak","Elzbieta@gmail.com",a18)); 
	klientRepository.save(new Klient("Magdalena","Kowalczyk","Magdalena@gmail.com",a19)); 
/*16*/ 	klientRepository.save(new Klient("Zofia","Wójcik","Zofia@gmail.com",a20)); 


      
        ksiazkaRepository.save(new Ksiazka("Teatr wskrzeszonych","Jachyra Tatiana","kryminal, sensacja, thriller", 21));
        ksiazkaRepository.save(new Ksiazka("Pan Tadeusz", "Adam Mickiewicz", "Poezja epicka" , 45));
        ksiazkaRepository.save(new Ksiazka("Przedwiośnie", "Stefan Żeromski", "Powieść, Fikcja historyczna" , 25));
        ksiazkaRepository.save(new Ksiazka("Balladyna", "Juliusz SĹ‚owacki", "dramat" , 30));
        ksiazkaRepository.save(new Ksiazka("Ostatnie Życzenie", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 28));
        ksiazkaRepository.save(new Ksiazka("Czas pogardy", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 24));
        ksiazkaRepository.save(new Ksiazka("Chrzest ognia", "Andrzej Sapkowski", "Powieść, Literatura fantasy", 40));
        ksiazkaRepository.save(new Ksiazka("Poranki na Miodowej 1", "Joanna Szarańska", "Literatura obyczajowa, romans", 35));
	ksiazkaRepository.save(new Ksiazka("Behawiorysta", "Remigiusz Mróz", "Fikcja, dreszczowiec", 45));
/*10*/ 	ksiazkaRepository.save(new Ksiazka("Ekspozycja", "Remigiusz Mróz", "Fikcja, Powiesc kryminalna", 23));
	ksiazkaRepository.save(new Ksiazka("Nieodnaleziona", "Remigiusz Mróz", "Fikcja, Dreszczowiec", 21));
	ksiazkaRepository.save(new Ksiazka("Kasacja", "Remigiusz Mróz", "Fikcja, Dreszczowiec, Opowiadanie prawnicze", 31));
	ksiazkaRepository.save(new Ksiazka("Nieodgadniona", "Remigiusz Mróz", "Fikcja, Powieść kryminalna, Dreszczowiec", 25));
	ksiazkaRepository.save(new Ksiazka("Immunitet", "Remigiusz Mróz", "Fikcja, Powieść kryminalna", 26));
	ksiazkaRepository.save(new Ksiazka("Inwigilacja", "Remigiusz Mróz", "Fikcja, Powieść kryminalna", 34));
	ksiazkaRepository.save(new Ksiazka("Potop", "Henryk Sienkiewicz", "Fikcja historyczna", 25));
	ksiazkaRepository.save(new Ksiazka("W pustyni i w puszczy", "Henryk Sienkiewicz", "Literatura przygodowa", 45));
	ksiazkaRepository.save(new Ksiazka("Krzyżacy", "Henryk Sienkiewicz", "Powieść, Fikcja historyczna", 35));
	ksiazkaRepository.save(new Ksiazka("Quo vadis", "Henryk Sienkiewicz", "Powieść, Fikcja historyczna", 25));
/*20*/	ksiazkaRepository.save(new Ksiazka("Pan Wołodyjowski", "Henryk Sienkiewicz", "Fikcja historyczna", 16));
	ksiazkaRepository.save(new Ksiazka("Ogniem i mieczem", "Henryk Sienkiewicz", "Powieść historyczna", 27));
	ksiazkaRepository.save(new Ksiazka("Dwie laki", "Henryk Sienkiewicz", "Basn", 26));
	ksiazkaRepository.save(new Ksiazka("Konrad Wallenrod", "Adam Mickiewicz", "powiesc poetycka", 25));
	ksiazkaRepository.save(new Ksiazka("Osiedle RZNiW", "Mróz Remigiusz", "Kryminal, sensacja, thriller", 25));
	ksiazkaRepository.save(new Ksiazka("Kwestia ceny", "Miłoszewski Zygmunt", "Kryminal, sensacja, thriller", 31));
	ksiazkaRepository.save(new Ksiazka("Mam wątpliwosc", "Radomska Aleksandra", "Literatura piekna polska", 34));
	ksiazkaRepository.save(new Ksiazka("Red, White Royal Blue", "McQuiston Casey", "Romans", 39));
	ksiazkaRepository.save(new Ksiazka("Ballada ptaków i wezy", "Collins Suzanne", "Literatura dla młodzieży", 55));
	ksiazkaRepository.save(new Ksiazka("Pod kluczem", "Ruth Ware", "thriller", 23));
/*30*/ 	ksiazkaRepository.save(new Ksiazka("Smiertelne klamstwa", "Sarah A. Denzil", "thriller", 19));
	ksiazkaRepository.save(new Ksiazka("Wielbiciel", "Max Czornyj", "thriller", 17));
	ksiazkaRepository.save(new Ksiazka("Las i ciemnosc", "Marta Matyszczak", "komedia kryminalna", 45));
	ksiazkaRepository.save(new Ksiazka("Moja doskonala żona", "Samantha Downing", "thriller", 35));
	ksiazkaRepository.save(new Ksiazka("Prawo krwi", "Tess Gerritsen", "thriller", 45));
	ksiazkaRepository.save(new Ksiazka("Przekręt", "Paulina Swist", "thriller", 28));
	ksiazkaRepository.save(new Ksiazka("Bajka nie bajka", "Krystyna Wajda", "poezja i dramat", 32));
	ksiazkaRepository.save(new Ksiazka("W kokonie dnia", "Krystyna Wajda", "poezja i dramat", 26));
	ksiazkaRepository.save(new Ksiazka("Dziejba Leśna", "Boleslaw Lesmian", "poezja i dramat", 25));
/*40*/ 	ksiazkaRepository.save(new Ksiazka("Kielich upojenia", "Oton Zupancic", "poezja i dramat", 24));
	ksiazkaRepository.save(new Ksiazka("Przepowiesc w scinkach", "Marta Podgornik", "poezja i dramat", 31));
	ksiazkaRepository.save(new Ksiazka("Odlegle brzegi", "Kristin Hannah", "literatura obyczajowa", 15));
	ksiazkaRepository.save(new Ksiazka("Podróż nieslubna", "Christina Lauren", "literatura obyczajowa", 29));
	ksiazkaRepository.save(new Ksiazka("W samym sercu morza", "Jojo Moyes", "literatura obyczajowa", 35));
	ksiazkaRepository.save(new Ksiazka("Upior w ruderze", "Andrzej Pilipiuk", "fantasy", 24));
	ksiazkaRepository.save(new Ksiazka("Mamidlo", "Barbara Janas-Dudek", "", 48));
	ksiazkaRepository.save(new Ksiazka("Green Town", "Ray Bradbury", "fantasy", 45));
	ksiazkaRepository.save(new Ksiazka("Miecz i Cytadela", "Gene Wolfe", "fantasy", 55));
	ksiazkaRepository.save(new Ksiazka("Abominacja", "Dan Simmons", "horror, fantastyka grozy", 32));
/*50*/ 	ksiazkaRepository.save(new Ksiazka("Gwiazdy moim przeznaczeniem", "Alfred Bester", "science fiction", 40));
	ksiazkaRepository.save(new Ksiazka("Polozna z Auschwitz", "Magda Knedler", "Powieść historyczna i biograficzna", 25));
	ksiazkaRepository.save(new Ksiazka("Upiór w ruderze", "Andrzej Pilipiuk", "fantasy", 42));
	ksiazkaRepository.save(new Ksiazka("SybirPunk. Vol 2", "Michal Golkowski", "science fiction", 45));
	ksiazkaRepository.save(new Ksiazka("SybirPunk. Vol 1", "Michal Golkowski", "science fiction", 45));
	ksiazkaRepository.save(new Ksiazka("Mars. Cykl Bezlitosna sila. Tom 4", "Agnieszka Lingas-Loniewska", "romans", 28));
	ksiazkaRepository.save(new Ksiazka("Las i ciemność", "Marta Matyszczak", "komedia kryminalna", 43));
	ksiazkaRepository.save(new Ksiazka("Przekręt", "Paulina Świst", "kryminal", 25));
	ksiazkaRepository.save(new Ksiazka("Szadz", "Igor Brejdygant", "kryminal", 20));
	ksiazkaRepository.save(new Ksiazka("Kwestia ceny", "Zygmunt Miloszewski", "kryminal", 15));
/*60*/ 	ksiazkaRepository.save(new Ksiazka("W blasku słońca", "Magdalena Kordel", "literatura obyczajowa", 40));
	ksiazkaRepository.save(new Ksiazka("Inni maja lepiej", "Krystyna Mirek", "literatura obyczajowa", 30));
	ksiazkaRepository.save(new Ksiazka("Drugi brzeg", "Joanna Jax", "literatura obyczajowa", 30));
	ksiazkaRepository.save(new Ksiazka("Strach, ktory powraca", "Magda Stachula", "thriller", 30));
	ksiazkaRepository.save(new Ksiazka("Miedzy ustami a brzegiem pucharu", "Maria Rodziewiczowna", "powiesc", 45));
	ksiazkaRepository.save(new Ksiazka("Minas Warsaw", "Magdalena Kozak", "fantasy", 28));
	ksiazkaRepository.save(new Ksiazka("Wenecja. Miasto, ktoremu sie powodzi", "Manuela Gretkowska", "literatura podroznicza", 22));
	ksiazkaRepository.save(new Ksiazka("Drogi i bezdroza Meksyku", "Tomasz Jan Chlebowski", "", 18));
	ksiazkaRepository.save(new Ksiazka("Bieszczady", "Stanislaw Krycinski", "przewodniki", 23));
	ksiazkaRepository.save(new Ksiazka("Dwie twarze. Zycie prywatne mordercow z Auschwitz", "Nina Majewska-Brown", "II Wojna Swiatowa", 27));
/*70*/ 	ksiazkaRepository.save(new Ksiazka("Pionierzy. Ludzie, ktorzy zbudowali Ameryke", "David McCullough", "historia swiata", 40));
	ksiazkaRepository.save(new Ksiazka("Wojna Iwana. Zycie i smierc w Armii Czerwonej 1939-1945", "Catherine Merridale", "II Wojna Swiatowa", 29));
	ksiazkaRepository.save(new Ksiazka("Operator 594", "Krzysztof Puwalski", "felieton i reportaz", 20));
	ksiazkaRepository.save(new Ksiazka("Kontakt", "Kafir", "felieton i reportaz", 20));
	ksiazkaRepository.save(new Ksiazka("Don 1917-1918", "Krzysztof Marcinek", "historia swiata", 30));
	ksiazkaRepository.save(new Ksiazka("Wiek madrosci", "Caroline Stoessinger", "II Wojna Swiatowa", 20));
	ksiazkaRepository.save(new Ksiazka("Auschwitz", "Deborah Dwork , Robert Jan Van Pel", "II Wojna Swiatowa", 22));
	ksiazkaRepository.save(new Ksiazka("Borgiowie. Historia nieznana", "G.J. Meyer", "historia swiata", 30));
	ksiazkaRepository.save(new Ksiazka("Zabić króla", "Andrzej Zielinski", "historia Polski", 28));
	ksiazkaRepository.save(new Ksiazka("Rycerze krzyża i miecza", "Andrzej Zielinski", "historia swiata", 25));
/*80*/ 	ksiazkaRepository.save(new Ksiazka("Wehrmacht. Tarcze naramienne 1940-1945", "Grzegorz Grzeskowiak", "II Wojna Swiatowa", 19));
	ksiazkaRepository.save(new Ksiazka("Księga Pamieci. Wieźniowe policyjni w Klauschwitz w latach 1942-1945", "Jerzy Klistala , Adam Cyra", "II Wojna Swiatowa", 19));
	ksiazkaRepository.save(new Ksiazka("Zamek Podskale i Palac Rzasiny", "Szymon Wrzesinski", "historia Polski", 22));
	ksiazkaRepository.save(new Ksiazka("Prawdziwa historia Bursztynowej Komnaty i Ericha Kocha", "Ireneusz Iwanski", "II Wojna Swiatowa", 22));
	ksiazkaRepository.save(new Ksiazka("Maly Ksiaże", "Antoine de Saint-Exupery", "Literatura dziecieca", 25));
	ksiazkaRepository.save(new Ksiazka("Chlopcy z Placu Broni", "Ferenc Molnar", "przygodowa", 30));
	ksiazkaRepository.save(new Ksiazka("Dzieci z Bullerbyn", "Astrid Lindgren", "klasyka mlodziezowa", 41));
	ksiazkaRepository.save(new Ksiazka("Detektyw Pozytywka", "Grzegorz Kasdepke", "", 30));
	ksiazkaRepository.save(new Ksiazka("Hobbit czyli tam i z powrotem", "J.R.R. Tolkien", "fantasy", 25));
	ksiazkaRepository.save(new Ksiazka("Kamienie na szaniec", "Aleksander Kaminski", "Biografia, Powiesc faktu", 17));
/*90*/ 	ksiazkaRepository.save(new Ksiazka("Upadek Gondolinu", "J.R.R. Tolkien", "fantasy", 26));
	ksiazkaRepository.save(new Ksiazka("Wladca Pierścieni", "J.R.R. Tolkien", "fantasy", 60));
	ksiazkaRepository.save(new Ksiazka("Hobbit", "J.R.R. Tolkien", "fantasy", 60));
	ksiazkaRepository.save(new Ksiazka("Hobbit. Pustkowie Smauga", "J.R.R. Tolkien", "fantasy", 22));
	ksiazkaRepository.save(new Ksiazka("Hobbit czyli tam i z powrotem", "J.R.R. Tolkien", "fantasy", 26));
	ksiazkaRepository.save(new Ksiazka("Władca Pierscieni Tom 1: Bractwo Pierścienia", "J.R.R. Tolkien", "fantasy", 35));
/*96*/ 	ksiazkaRepository.save(new Ksiazka("Władca Pierscieni Tom 2: Dwie wieże", "J.R.R. Tolkien", "fantasy", 35));


        pracownikRepository.save(new Pracownik("Jakub", "Baran", 123456789, "administrator", a1 ));
        pracownikRepository.save(new Pracownik("Emilian", "Karnasiewicz", 345345345, "moderator", a3 ));
        pracownikRepository.save(new Pracownik("Wojciech", "Gwizdak", 444444444, "logistyk", a4 ));
        pracownikRepository.save(new Pracownik("Maciej", "Penar", 656565656, "moderator", a5 ));
        

      metodaRepository.save(new Metoda("Gotówka za pobraniem"));
      metodaRepository.save(new Metoda("Przelew bankowy"));
      metodaRepository.save(new Metoda("BLIK"));
      
    }

}
