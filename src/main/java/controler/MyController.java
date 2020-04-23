package controler;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {

    @Autowired
    KlientRepository klientRepository;
    @Autowired
    ZamowienieRepository zamowienieRepository;
    @Autowired
    KsiazkaRepository ksiazkaRepository;
    @Autowired
    PracownikRepository pracownikRepository;
    @Autowired
    AdresRepository adresRepository;
    @Autowired
    KoszykRepository koszykRepository;
    @Autowired
    MetodaRepository metodaRepository;
 
    
    @RequestMapping("/admin")
    public String adminPage() {        
        return "admin"; //Przekierowanie do strony admin.html
    }
    
    @RequestMapping("/staf")
    public String staffPage() {        
        return "staf"; //Przekierowanie do strony staf.html
    }
    
    @RequestMapping("/client")
    public String clientPage() {        
        return "client"; //Przekierowanie do strony client.html
    }

    
//------------------------------------------    WYSWIETLANIE    ------------------------------------------\\
    
//--------- WYSWIETLANIE KSIAZEK ---------\\
    
        @RequestMapping(value = "/print_ksiazka", method = RequestMethod.GET)
    public String printAllKsiazka(Model model)
    {
        List<Ksiazka> ksiazkaList =  ksiazkaRepository.findAll(); 
         
        try{
                        
        model.addAttribute("header","Lista wszystkich ksiazek"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("ksiazkaList",ksiazkaList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "errorksiazka";
                }
        
        return "printformksiazka"; //Przekierowanie na strone 

    }
    
//--------- WYSWIETLANIE ZAMOWIEN ---------\\ 
    
    @RequestMapping(value = "/print_all_zam", method = RequestMethod.GET)
    public String printAllZamowienie(Model model)
    {
        List<Zamowienie> zamowienieList =  zamowienieRepository.findAll(); 
        List<Koszyk> koszykList =  koszykRepository.findAll();       
        try{
  
        model.addAttribute("header","Lista wszystkich zamowienien"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("zamowienieList",zamowienieList); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("koszykList",koszykList);
        } catch (Exception e)
        { return "errorzam";
                }
        
        return "printformzamowienie"; //Przekierowanie na strone 

    }   
    
//--------- WYSWIETLANIE PRACOWNIKOW ---------\\
         
    @RequestMapping(value = "/print_pracownik", method = RequestMethod.GET)
    public String printAllPracownik(Model model)
    {
        List<Pracownik> pracownikList =  pracownikRepository.findAll(); 
        try
        {
                   
        model.addAttribute("header","Lista wszystkich pracownikow"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("pracownikList",pracownikList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "errorpracownik";
                }
        
        return "printformpracownik"; //Przekierowanie na strone 

    }    
    
//--------- WYSWIETLANIE KLIENTOW ---------\\
         
    @RequestMapping(value = "/print_klient", method = RequestMethod.GET)
    public String printAllKlient(Model model)
    {
        List<Klient> klientList =  klientRepository.findAll(); 
        try
        {
                   
        model.addAttribute("header","Lista wszystkich klientow"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("klientList",klientList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "errorklient";
                }
        
        return "printformklient"; //Przekierowanie na strone 

    }    
    
//--------- WYSWIETLANIE ADRESOW ---------\\
         
    @RequestMapping(value = "/print_adres", method = RequestMethod.GET)
    public String printAllAdres(Model model)
    {
        List<Adres> adresList =  adresRepository.findAll(); 
        try
        {
                   
        model.addAttribute("header","Lista wszystkich adresow"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("adresList",adresList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "erroradres";
                }
        
        return "printformadres"; //Przekierowanie na strone 

    }    
    
    //--------- WYSWIETLANIE KOSZYKA ---------\\
         
  @RequestMapping(value = "/print_koszyk", method = RequestMethod.GET)
    public String printKoszyk(Model model)
    {
        List<Koszyk> koszykList =  koszykRepository.findAll(); 
        try
        {
                   
        model.addAttribute("header","Lista wszystkich koszykow"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("koszykList",koszykList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "errorpage";
                }
        
        return "printformkoszyk"; //Przekierowanie na strone 

    } 

    
//------------------------------------------    DODAWANIE    ------------------------------------------\\
    
//--------- DODAWANIE KSIAZKI ---------\\
    
        @RequestMapping("/add_ksiazka")
    public String addKsiazka(Model model)
    {       
       TransKsiazka transKsiazka = new TransKsiazka();                
        model.addAttribute("transKsiazka", transKsiazka);         
        return "addformksiazka";  
    }
    
        @RequestMapping(value = "/add_ksiazka", method = RequestMethod.POST)
    public String addKsiazka(Model model,TransKsiazka transKsiazka)
    {
        String nazwa = transKsiazka.getNazwa();
        String autor = transKsiazka.getAutor();
        String gatunek = transKsiazka.getGatunek();
        int cena = transKsiazka.getCena();
               
        ksiazkaRepository.save(new Ksiazka(nazwa,autor,gatunek,cena));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy ksiazke: "+nazwa+" gatunek: "+gatunek); 

        return "viewmessageksiazka";                
    }    
    
//--------- DODAWANIE ZAMOWIENIA ---------\\
 
@RequestMapping("/add_zam")
    public String addZamowienie(Model model)
    {       
        TransZamowienie transZamowienie = new TransZamowienie();                
        model.addAttribute("transZamowienie", transZamowienie);  
        ArrayList<Klient> klient = (ArrayList<Klient>)klientRepository.findAll();
        model.addAttribute("klientList",klient);
        ArrayList<Koszyk> koszyk = (ArrayList<Koszyk>)koszykRepository.findAll();
        model.addAttribute("koszykList",koszyk);
        ArrayList<Metoda> metoda = (ArrayList<Metoda>)metodaRepository.findAll();
        model.addAttribute("metodaList",metoda);
        return "addformzamowienie";  
    }
    
        @RequestMapping(value = "/add_zam", method = RequestMethod.POST)
    public String addZamowienie(Model model,TransZamowienie transZamowienie, Metoda metoda, Klient klient, Koszyk koszyk)
    {
        
        String dataZamowienia = transZamowienie.getDataZamowienia();
        String dataOtrzymania = transZamowienie.getDataOtrzymania();
        int koszt = transZamowienie.getKoszt();
        Long id_metody = metoda.getId_metody();
        Long id_klienta = klient.getId_klienta();
        Long id_koszyka = koszyk.getId_koszyka();
        Metoda metoda1 = metodaRepository.findById(id_metody).get();
        Klient klient1 = klientRepository.findById(id_klienta).get();
        
        try
        {
        zamowienieRepository.save(new Zamowienie(dataZamowienia,dataOtrzymania,koszt, metoda1, klient1, koszyk));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono! Data zam�wienia: "+dataZamowienia+" data otrzymania: "+dataOtrzymania+"Koszyk: "+koszyk); 
        } catch (Exception e)
        { return "errorzam";
                }
        return "viewmessagezam";                
    }    
//--------- DODAWANIE PRACOWNIKA ---------\\
    
        @RequestMapping("/add_pracownik")
    public String addPracownik(Model model)
    {       
        TransPracownik transPracownik = new TransPracownik();                
        model.addAttribute("transPracownik", transPracownik);  
        ArrayList<Adres> adres = (ArrayList<Adres>)adresRepository.findAll();
        model.addAttribute("adresList",adres);
        return "addformpracownik";  
    }
    
        @RequestMapping(value = "/add_pracownik", method = RequestMethod.POST)
    public String addPracownik(Model model,TransPracownik transPracownik, Adres adres)
    {
        String imie = transPracownik.getImie();
        String nazwisko = transPracownik.getNazwisko();
        int telefon = transPracownik.getTelefon();
        String stanowisko = transPracownik.getStanowisko();
        Long id = adres.getId_adresu();
        
        Adres adres1 = adresRepository.findById(id).get();
        
        try
        {
        pracownikRepository.save(new Pracownik(imie,nazwisko,telefon,stanowisko, adres1));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy pracwonika: "+imie+" "+nazwisko); 
        } catch (Exception e)
        { return "errorpracownik";
                }
        return "viewmessagepracownik";                
    }
    
//--------- DODAWANIE KLIENTA ---------\\
    
        @RequestMapping("/add_klient")
    public String addKlient(Model model)
    {       
        TransKlient transKlient = new TransKlient();                
        model.addAttribute("transKlient", transKlient);   
        ArrayList<Adres> adres = (ArrayList<Adres>)adresRepository.findAll();
        model.addAttribute("adresList",adres);
        return "addformklient";  
    }
    
        @RequestMapping(value = "/add_klient", method = RequestMethod.POST)
    public String addKlient(Model model,TransKlient transKlient, Adres adres)
    {
        String imie = transKlient.getImie();
        String nazwisko = transKlient.getNazwisko();
        String email = transKlient.getEmail();
        Long id = adres.getId_adresu();
        
        Adres adres1 = adresRepository.findById(id).get();
        
        try
        {
        klientRepository.save(new Klient(imie,nazwisko,email,adres1));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy klienta: "+imie+" "+nazwisko); 
        } catch (Exception e)
        { return "errorklient";
                }
        return "viewmessageklient";                
    }
    
//--------- DODAWANIE ADRESU ---------\\
    
        @RequestMapping("/add_adres")
    public String addAdres(Model model)
    {       
        TransAdres transAdres = new TransAdres();                
        model.addAttribute("transAdres", transAdres);         
        return "addformadres";  
    }
    
        @RequestMapping(value = "/add_adres", method = RequestMethod.POST)
    public String addAdres(Model model,TransAdres transAdres)
    {
        String miejscowosc = transAdres.getMiejscowosc();
        String ulica = transAdres.getUlica();
        String nrDomu = transAdres.getnrDomu();
        String kodPocztowy = transAdres.getKodPocztowy();
        
        try
        {
        adresRepository.save(new Adres(miejscowosc,ulica,nrDomu,kodPocztowy));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy adres: "+miejscowosc+" "+ulica); 
        } catch (Exception e)
        { return "erroradres";
                }
        return "viewmessageadres";                
    }

   
    //--------- DODAWANIE DO KOSZYKA ---------\\
    
        @RequestMapping("/add_koszyk")
    public String addKoszyk(Model model)
    {       
       TransKoszyk transKoszyk = new TransKoszyk();                
        model.addAttribute("transKoszyk", transKoszyk);
        ArrayList<Ksiazka> ksiazka = (ArrayList<Ksiazka>)ksiazkaRepository.findAll();
        model.addAttribute("ksiazkaList",ksiazka);
        return "addformkoszyk";  
    }
    
        @RequestMapping(value = "/add_koszyk", method = RequestMethod.POST)
    public String addKoszyk(Model model,TransKoszyk transKoszyk, Ksiazka ksiazka)
    {
        int ilosc = transKoszyk.getIlosc();
        Long id_ksiazki = ksiazka.getId_ksiazki();
        
        //ArrayList<Ksiazka> ksiazka1 = (ArrayList<Ksiazka>)ksiazkaRepository.findAll();
        //model.addAttribute("ksiazkaList",ksiazka1);
        
        
        Ksiazka ksiazka1 = ksiazkaRepository.findById(id_ksiazki).get();
               
        koszykRepository.save(new Koszyk(ilosc, ksiazka));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy ksiazke: "+ksiazka+" ilosc: "+ilosc); 

        return "viewmessagekoszyk";                
    }    
    
  
   
    
//------------------------------------------    USUWANIE    ------------------------------------------\\
    
    
//--------- USUWANIE KSIAZKI ---------\\

    @RequestMapping("/delete_ksiazka/{id_ksiazki}")
    public String deleteKsiazka(@PathVariable("id_ksiazki")long id, Model model,Ksiazka ksiazka, TransKsiazka transKsiazka) {
     
        ksiazkaRepository.deleteById(ksiazka.getId_ksiazki());  
        String nazwa = transKsiazka.getNazwa();
        
    model.addAttribute("message","Usuni�to ksi��k� o nazwie: "+nazwa); 
    return "redirect:/print_ksiazka"; 
    }
    
//--------- USUWANIE ZAMOWIENIA ---------\\
        
    @RequestMapping("/delete_zam/{id_zamowienia}")
    public String deleteZamowienie(@PathVariable("id_zamowienia")long id, Model model,Zamowienie zamowienie, TransZamowienie transZamowienie) {
     
        zamowienieRepository.deleteById(zamowienie.getId_zamowienia());  
        String dataZamowienia = transZamowienie.getDataZamowienia();
        String dataOtrzymania = transZamowienie.getDataOtrzymania();
        
    model.addAttribute("message","Usuni�to zamowienie o dacie zamowienia: "+dataZamowienia+" i otrzymania: "+dataOtrzymania); 
    return "redirect:/print_all_zam"; 
    }
 
//--------- USUWANIE PRACOWNIKA ---------\\
        
    @RequestMapping("/delete_pracownik/{id_pracownika}")
    public String deletePracownik(@PathVariable("id_pracownika")long id, Model model,Pracownik pracownik, TransPracownik transPracownik) {
     
        pracownikRepository.deleteById(pracownik.getId_pracownika());  
        String imie = transPracownik.getImie();
        String nazwisko = transPracownik.getNazwisko();
        
    model.addAttribute("message","Usunieto pracownika: "+imie+" "+nazwisko);
    return "redirect:/print_pracownik"; 
    }
    
//--------- USUWANIE KLIENTA ---------\\
        
 @RequestMapping("/delete_klient/{id_klienta}")
    public String deleteKlient(@PathVariable("id_klienta")long id, Model model,Klient klient, TransKlient transKlient) {
     
        klientRepository.deleteById(klient.getId_klienta());  
        String imie = transKlient.getImie();
        String nazwisko = transKlient.getNazwisko();
        
    model.addAttribute("message","Usunieto klienta: "+imie+" "+nazwisko);
    return "redirect:/print_klient"; 
    }    
    
   //--------- USUWANIE Z KOSZYKA ---------\\

    @RequestMapping("/delete_koszyk/{id_koszyka}")
    public String deleteKoszyk(@PathVariable("id_koszyka")long id, Model model,Koszyk koszyk, TransKoszyk transKoszyk) {
     
        koszykRepository.deleteById(koszyk.getId_koszyka());  
   
    model.addAttribute("message","Usuni�to ksiazke z koszyka: "); 
    return "redirect:/print_koszyk"; 
    }
    
//--------- USUWANIE ADRESU ---------\\

     @RequestMapping("/delete_adres/{id_adresu}")
    public String deleteAdres(@PathVariable("id_adresu")long id, Model model,Adres adres, TransAdres transAdres) {
     
        adresRepository.deleteById(adres.getId_adresu());  
        String miejscowosc = transAdres.getMiejscowosc();
        
    model.addAttribute("message","Usunieto adres: "+miejscowosc);
    return "redirect:/print_adres"; 
    }   
    
//------------------------------------------    EDYTOWANIE    ------------------------------------------\\

//--------- EDYTOWANIE KSIAZKI ---------\\
        
        @RequestMapping("/edit_ksiazka/{id_ksiazki}")
    public String editKsiazka(Model model, TransKsiazka transKsiazka, @PathVariable(name = "id_ksiazki") Long id) {
            

            model.addAttribute("ksiazka", ksiazkaRepository.getOne(id));

            model.addAttribute("transKsiazka", transKsiazka);

            return "editformksiazka";
    }   
    
    @RequestMapping(value = "/edit_ksiazka", method = RequestMethod.POST)
    public String editKsiazka(Model model,TransKsiazka transKsiazka)
    {
            Long id_ksiazki = transKsiazka.getId_ksiazki();
            String nazwa = transKsiazka.getNazwa();
            String autor = transKsiazka.getAutor();
            String gatunek = transKsiazka.getGatunek();
            int cena = transKsiazka.getCena();

        
       ksiazkaRepository.save(new Ksiazka(id_ksiazki, nazwa, autor, gatunek, cena));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +nazwa + " " +gatunek+ " " +cena);
        return "viewmessageksiazka";
        
    }
    
    
//--------- EDYTOWANIE ZAMOWIENIA ---------\\
        
        @RequestMapping("/edit_zam/{id_zamowienia}")
    public String editZamowienie(Model model, TransZamowienie transZamowienie, @PathVariable(name = "id_zamowienia") Long id) {
        
            model.addAttribute("zamowienie", zamowienieRepository.getOne(id));

            model.addAttribute("transZamowienie", transZamowienie);  
            ArrayList<Klient> klient = (ArrayList<Klient>)klientRepository.findAll();
            model.addAttribute("klientList",klient);
            ArrayList<Koszyk> koszyk = (ArrayList<Koszyk>)koszykRepository.findAll();
            model.addAttribute("koszykList",koszyk);
            ArrayList<Metoda> metoda = (ArrayList<Metoda>)metodaRepository.findAll();
            model.addAttribute("metodaList",metoda);
            
            return "editformzamowienie";
    }   
    
    @RequestMapping(value = "/edit_zam", method = RequestMethod.POST)
    public String editZamowienie(Model model,TransZamowienie transZamowienie, Metoda metoda, Koszyk koszyk, Klient klient)
    {
        
            Long id = transZamowienie.getId_zamowienia();
            String dataZamowienia = transZamowienie.getDataZamowienia();
            String dataOtrzymania = transZamowienie.getDataOtrzymania();
            int koszt = transZamowienie.getKoszt();
            Long id_klienta = klient.getId_klienta();
            Long id_metody = metoda.getId_metody();
            Klient klient1 = klientRepository.findById(id_klienta).get();
            Metoda metoda1 = metodaRepository.findById(id_metody).get();
        
       zamowienieRepository.save(new Zamowienie(id, dataZamowienia, dataOtrzymania, koszt, metoda1, klient1, koszyk));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +dataZamowienia + " " +dataOtrzymania+ " " +koszt);
        return "viewmessagezam";
        
    }  
    
//--------- EDYTOWANIE PRACOWNIKA ---------\\
        
        @RequestMapping("/edit_pracownik/{id_pracownika}")
    public String editPracownik(Model model, TransPracownik transPracownik, Adres adres, @PathVariable(name = "id_pracownika") Long id) {
            
            

            model.addAttribute("pracownik", pracownikRepository.getOne(id));

            model.addAttribute("transPracownik", transPracownik);       
            ArrayList<Adres> adres1 = (ArrayList<Adres>)adresRepository.findAll();
            model.addAttribute("adresList",adres1);
            
            return "editformpracownik";
    }   
    
    @RequestMapping(value = "/edit_pracownik", method = RequestMethod.POST)
    public String editPracownik(Model model,TransPracownik transPracownik, Adres adres)
    {
            Long id_pracownika = transPracownik.getId_pracownika();
            String imie = transPracownik.getImie();
            String nazwisko = transPracownik.getNazwisko();
            int telefon = transPracownik.getTelefon();
            String stanowisko = transPracownik.getStanowisko();
            Long id_adresu = adres.getId_adresu();
            
            Adres adres1 = adresRepository.findById(id_adresu).get();

        
       pracownikRepository.save(new Pracownik(id_pracownika, imie, nazwisko, telefon, stanowisko, adres1));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +imie + " " +nazwisko+ " " +telefon+ " " +stanowisko);
        return "viewmessagepracownik";
        
    }    
    
//--------- EDYTOWANIE KLIENTA ---------\\
        
        @RequestMapping("/edit_klient/{id_klienta}")
    public String editKlient(Model model, TransKlient transKlient, Adres adres, @PathVariable(name = "id_klienta") long id) {
            
        
            model.addAttribute("klient", klientRepository.getOne(id));

            model.addAttribute("transKlient", transKlient);       
            ArrayList<Adres> adres1 = (ArrayList<Adres>)adresRepository.findAll();
            model.addAttribute("adresList",adres1);
            
            return "editformklient";
    }   
    
    @RequestMapping(value = "/edit_klient", method = RequestMethod.POST)
    public String editKlient(Model model,TransKlient transKlient, Adres adres)
    {
            Long id_klienta = transKlient.getId_klienta();
            String imie = transKlient.getImie();
            String nazwisko = transKlient.getNazwisko();
            String email = transKlient.getEmail();
            Long id_adresu = adres.getId_adresu();
            
            Adres adres1 = adresRepository.findById(id_adresu).get();
        
        klientRepository.save(new Klient(id_klienta, imie, nazwisko, email, adres1));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +imie + " " +nazwisko+ " "+email);
        return "viewmessageklient";
        
    }
    
//--------- EDYTOWANIE ADRESU ---------\\
        
        @RequestMapping("/edit_adres/{id_adresu}")
    public String editAdres(Model model, TransAdres transAdres, @PathVariable(name = "id_adresu") Long id) {
            

            model.addAttribute("adres", adresRepository.getOne(id));

            model.addAttribute("transAdres", transAdres); 
            return "editformadres";
    }   
    
    @RequestMapping(value = "/edit_adres", method = RequestMethod.POST)
    public String editAdres(Model model,TransAdres transAdres)
    {
            Long id_adresu = transAdres.getId_adresu();
            String miejscowosc = transAdres.getMiejscowosc();
            String ulica = transAdres.getUlica();
            String nrDomu = transAdres.getnrDomu();

            String kodPocztowy = transAdres.getKodPocztowy();
        
        adresRepository.save(new Adres(id_adresu, miejscowosc, ulica, nrDomu, kodPocztowy));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +miejscowosc + " " +ulica+ " " +nrDomu+ " "+kodPocztowy);
        return "viewmessageadres";
        
    } 
    
    //--------- OBSLUGA BLEDOW ---------\\

    @ExceptionHandler
    public String handlerException(Model model,Exception exception)
    {
        String message = exception.getMessage();
        model.addAttribute("errormessage", message);
        return "errorpage";
    }
}

        