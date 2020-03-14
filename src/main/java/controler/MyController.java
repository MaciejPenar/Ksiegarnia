package controler;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MyController {

    @Autowired
    KlientRepository klientRepository;
    @Autowired
    ZamowienieRepository zamowienieRepository;
    @Autowired
    KsiazkaRepository ksiazkaRepository;
    @Autowired
    AutorRepository autorRepository;
    @Autowired
    GatunekRepository gatunekRepository;
    @Autowired
    PracownikRepository pracownikRepository;
    @Autowired
    AdresRepository adresRepository;
 
//------------------------------------------    WYSWIETLANIE    ------------------------------------------\\
    
//--------- WYSWIETLANIE AUTOROW ---------\\
         
    @RequestMapping(value = "/print_autor", method = RequestMethod.GET)
    public String printAllAutor(Model model)
    {
        List<Autor> autorList =  autorRepository.findAll(); 
             
        try
        {
            

        model.addAttribute("header","Lista wszystkich autorow"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("autorList",autorList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "errorautor";
                }
        
        return "printformautor"; //Przekierowanie na strone 

    }
    
//--------- WYSWIETLANIE GATUNKOW ---------\\
         
    @RequestMapping(value = "/print_gatunek", method = RequestMethod.GET)
    public String printAllGatunek(Model model)
    {
        List<Gatunek> gatunekList =  gatunekRepository.findAll(); 
            
        try{
        
        model.addAttribute("header","Lista wszystkich gatunekow"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("wydawnictwoList",gatunekList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "errorgatunek";
                }
        
        return "printformgatunek"; //Przekierowanie na strone 

    }
    
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
               
        try{
  
        model.addAttribute("header","Lista wszystkich zamowienien"); //Dodanie obiektu do pamieci lokalnej modelu
        model.addAttribute("zamowienieList",zamowienieList); //Dodanie obiektu do pamieci lokalnej modelu
        
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
        model.addAttribute("klientList",adresList); //Dodanie obiektu do pamieci lokalnej modelu
        
        } catch (Exception e)
        { return "erroradres";
                }
        
        return "printformadres"; //Przekierowanie na strone 

    }      
    
//------------------------------------------    DODAWANIE    ------------------------------------------\\
    
//--------- DODAWANIE KLIENTA ---------\\
    
        @RequestMapping("/add_klient")
    public String addKlient(Model model)
    {       
        TransKlient transKlient = new TransKlient();                
        model.addAttribute("transKlient", transKlient);         
        return "addformklient";  
    }
    
        @RequestMapping(value = "/add_klient", method = RequestMethod.POST)
    public String addKlient(Model model,TransKlient transKlient)
    {
        String imie = transKlient.getImie();
        String nazwisko = transKlient.getNazwisko();
        String email = transKlient.getEmail();
        
        try
        {
        klientRepository.save(new Klient(imie,nazwisko,email));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy klienta: "+imie+" "+nazwisko); 
        } catch (Exception e)
        { return "errorklient";
                }
        return "viewmessageklient";                
    }
    
    //--------- DODAWANIE AUTORA ---------\\
    
        @RequestMapping("/add_autor")
    public String addAutor(Model model)
    {       
        TransAutor transAutor = new TransAutor();                
        model.addAttribute("transAutor", transAutor);         
        return "addformautor";  
    }
    
        @RequestMapping(value = "/add_autor", method = RequestMethod.POST)
    public String addAutor(Model model,TransAutor transAutor)
    {
        String imie = transAutor.getImie();
        String nazwisko = transAutor.getNazwisko();
           
        try
        {     
        autorRepository.save(new Autor(imie,nazwisko));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy autora: "+imie+" "+nazwisko); 
        } catch (Exception e)
        { return "errorautor";
                }
        return "viewmessageautor";                
    }
    
    //--------- DODAWANIE GATUNKU ---------\\
    
        @RequestMapping("/add_gatunek")
    public String addGatunek(Model model)
    {       
        TransGatunek transGatunek = new TransGatunek();                
        model.addAttribute("transGatunek", transGatunek);         
        return "addformgatunek";  
    }
    
        @RequestMapping(value = "/add_gatunek", method = RequestMethod.POST)
    public String addGatunek(Model model,TransGatunek transGatunek)
    {
        String nazwa = transGatunek.getNazwa();

        try
        {          
        gatunekRepository.save(new Gatunek(nazwa));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy gatunek o nazwie: "+nazwa); 
        } catch (Exception e)
        { return "errorwydawnictwo";
                }
        return "viewmessagegatunek";                
    }
    
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
        String gatunek = transKsiazka.getGatunek();
        String scena = transKsiazka.getScena();
        int cena = Integer.parseInt(scena);
        
        try
        {           
        ksiazkaRepository.save(new Ksiazka(nazwa,gatunek,cena));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy ksiazke: "+nazwa+" gatunek: "+gatunek); 
        } catch (Exception e)
        { return "errorksiazka";
                }
        return "viewmessageksiazka";                
    }

    
     //--------- DODAWANIE PRACOWNIKA ---------\\
    
        @RequestMapping("/add_pracownik")
    public String addPracownik(Model model)
    {       
        TransPracownik transPracownik = new TransPracownik();                
        model.addAttribute("transPracownik", transPracownik);         
        return "addformpracownik";  
    }
    
        @RequestMapping(value = "/add_pracownik", method = RequestMethod.POST)
    public String addPracownik(Model model,TransPracownik transPracownik)
    {
        String imie = transPracownik.getImie();
        String nazwisko = transPracownik.getNazwisko();
        String stelefon = transPracownik.getStelefon();
        int telefon = Integer.parseInt(stelefon);
        String stanowisko = transPracownik.getStanowisko();
        
        try
        {
        pracownikRepository.save(new Pracownik(imie,nazwisko,telefon,stanowisko));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy pracwonika: "+imie+" "+nazwisko); 
        } catch (Exception e)
        { return "errorpracownik";
                }
        return "viewmessagepracownik";                
    }
    
    //--------- DODAWANIE ZAMOWIENIA ---------\\
    
    @RequestMapping("/add_zam")
    public String addZam(Model model)
    {       
        TransZamowienie transData = new TransZamowienie();                
        model.addAttribute("transData", transData);         
        return "addformzam";  
    }
    
    @RequestMapping(value = "/add_zam", method = RequestMethod.POST)
    public String addZam(Model model,TransZamowienie transData)
    {
        String dataZamowienia = transData.getDataZamowienia();
        String dataOtrzymania = transData.getDataOtrzymania();
        String skoszt = transData.getSkoszt();
        int koszt = Integer.parseInt(skoszt);
        String metodaPlatnosci = transData.getMetodaPlatnosci();
        
        String imie = transData.getImie();
        String nazwisko = transData.getNazwisko();
        String nazwa = transData.getNazwa();
       
        List<Klient> klientList = klientRepository.findByImieAndNazwisko(imie,nazwisko);
        
        try
        {  
        
        if (klientList.size()==0)
        {         
            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Nie ma klienta: "+imie+" "+nazwisko); 
            return "errorzam";                
        }
        
        List<Ksiazka> ksiazkaList = ksiazkaRepository.findByNazwa(nazwa);
        
        if (ksiazkaList.size()==0)
        {         
            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Nie ma ksiazki o nazwie: "+nazwa); 
            return "errorzam";                
        }
        
        Klient klient = klientList.get(0);     
        Ksiazka ksiazka = ksiazkaList.get(0);  
        zamowienieRepository.save(new Zamowienie(dataZamowienia,dataOtrzymania,koszt,metodaPlatnosci,klient,ksiazka));
        
        model.addAttribute("header", "Wynik"); 
        model.addAttribute("message","Wstawiono do bazy zamowienie dla klienta: "+imie+" "+nazwisko);
        
        } catch (Exception e)
        { return "errorzam";
                }
        
        return "viewmessagezam";                
    }

    
    //--------- USUWANIE KLIENTA ---------\\
        
        @RequestMapping("/delete_klient")
    public String deleteKlient(Model model)
    {       
        TransKlient transKlient = new TransKlient();                
        model.addAttribute("transKlient", transKlient);         
        return "deleteformklient";  
    }
    
    @RequestMapping(value = "/delete_klient", method = RequestMethod.POST)
    public String deleteKlient(Model model,TransKlient transKlient)
    {
        String imie = transKlient.getImie();
        String nazwisko = transKlient.getNazwisko();
        
        List<Klient> klientList = klientRepository.findByImieAndNazwisko(imie,nazwisko);
        
        try{
        
        if (klientList.size()==0)
        {         
            model.addAttribute("errormessage","Nie ma osoby: "+imie+" "+nazwisko); 
            return "errorklient";                
        }
        else
        {        
            long id = klientList.get(0).getId();
            klientRepository.deleteById(id);

            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Usunieto osobe: "+imie+" "+nazwisko); 
            return "viewmessageklient";                
        }
        } catch (Exception e)
        { return "errorklient";
                }
    }
    
    //--------- USUWANIE AUTORA ---------\\
        
        @RequestMapping("/delete_autor")
    public String deleteAutor(Model model)
    {       
        TransAutor transAutor = new TransAutor();                
        model.addAttribute("transAutor", transAutor);         
        return "deleteformautor";  
    }
    
    @RequestMapping(value = "/delete_autor", method = RequestMethod.POST)
    public String deleteAutor(Model model,TransAutor transAutor)
    {
        String imie = transAutor.getImie();
        String nazwisko = transAutor.getNazwisko();
        
        List<Autor> autorList = autorRepository.findByImieAndNazwisko(imie,nazwisko);
        
        try{
        if (autorList.size()==0)
        {         
            model.addAttribute("errormessage","Nie ma osoby: "+imie+" "+nazwisko); 
            return "errorautor";                
        }
        else
        {        
            long id = autorList.get(0).getId();
            autorRepository.deleteById(id);

            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Usunieto autora: "+imie+" "+nazwisko); 
            return "viewmessageautor";                
        }
         } catch (Exception e)
        { return "errorautor";
                }
    }
    
     //--------- USUWANIE PRACOWNIKA ---------\\
        
        @RequestMapping("/delete_pracownik")
    public String deletePracownik(Model model)
    {       
        TransPracownik transPracownik = new TransPracownik();                
        model.addAttribute("transPracownik", transPracownik);         
        return "deleteformpracownik";  
    }
    
    @RequestMapping(value = "/delete_pracownik", method = RequestMethod.POST)
    public String deletePracownik(Model model,TransPracownik transPracownik)
    {
        String imie = transPracownik.getImie();
        String nazwisko = transPracownik.getNazwisko();
        
        List<Pracownik> pracownikList = pracownikRepository.findByImieAndNazwisko(imie,nazwisko);
        
        try{
        
        if (pracownikList.size()==0)
        {         
            model.addAttribute("errormessage","Nie ma pracownika: "+imie+" "+nazwisko); 
            return "errorpracownik";                
        }
        else
        {        
            long id = pracownikList.get(0).getId();
            pracownikRepository.deleteById(id);

            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Usunieto pracownika: "+imie+" "+nazwisko); 
            return "viewmessagepracownik";                
        }
        } catch (Exception e)
        { return "errorpracownik";
                }
    }
    
     //--------- USUWANIE WYDAWNICTWA ---------\\
        
        @RequestMapping("/delete_gatunek")
    public String deleteGatunek(Model model)
    {       
        TransGatunek transGatunek = new TransGatunek();                
        model.addAttribute("transGatunek", transGatunek);         
        return "deleteformgatunek";  
    }
    
    @RequestMapping(value = "/delete_gatunek", method = RequestMethod.POST)
    public String deleteGatunek(Model model,TransGatunek transGatunek)
    {
        String nazwa = transGatunek.getNazwa();
        
        List<Gatunek> gatunekList = gatunekRepository.findByNazwa(nazwa);
        
        try{
        if (gatunekList.size()==0)
        {         
            model.addAttribute("errormessage","Nie ma gatuneku: "+nazwa); 
            return "errorgatunek";                
        }
        else
        {        
            long id = gatunekList.get(0).getId();
            gatunekRepository.deleteById(id);

            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Usunieto gatunek: "+nazwa); 
            return "viewmessagegatunek";                
        }
        } catch (Exception e)
        { return "errorgatunek";
                }
    }
    
        //--------- USUWANIE KSIAZKI ---------\\
        
        @RequestMapping("/delete_ksiazka")
    public String deleteKsiazka(Model model)
    {       
        TransKsiazka transKsiazka = new TransKsiazka();                
        model.addAttribute("transKsiazka", transKsiazka);         
        return "deleteformksiazka";  
    }
    
    @RequestMapping(value = "/delete_ksiazka", method = RequestMethod.POST)
    public String deleteKsiazka(Model model,TransKsiazka transKsiazka)
    {
        String nazwa = transKsiazka.getNazwa();
        String gatunek = transKsiazka.getGatunek();
        
        List<Ksiazka> ksiazkaList = ksiazkaRepository.findByNazwaAndGatunek(nazwa, gatunek);
        
        try{
        if (ksiazkaList.size()==0)
        {         
            model.addAttribute("errormessage","Nie ma ksiazki: "+nazwa+" "+gatunek); 
            return "errorksiazka";                
        }
        else
        {        
            long id = ksiazkaList.get(0).getId();
            ksiazkaRepository.deleteById(id);

            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Usunieto ksiazke: "+nazwa+" "+gatunek); 
            return "viewmessageksiazka";                
        }
        } catch (Exception e)
        { return "errorksiazka";
                }
    }
    
     //--------- USUWANIE ZAMOWIENIA ---------\\
        
        @RequestMapping("/delete_zamowienie")
    public String deleteZamowienie(Model model)
    {       
        TransZamowienie transZamowienie = new TransZamowienie();                
        model.addAttribute("transZamowienie", transZamowienie);         
        return "deleteformzamowienie";  
    }
    
    @RequestMapping(value = "/delete_zamowienie", method = RequestMethod.POST)
    public String deleteZamowienie(Model model,TransZamowienie transZamowienie)
    {
        String dataZamowienia = transZamowienie.getDataZamowienia();
        
        List<Zamowienie> zamowienieList = zamowienieRepository.findByDataZamowienia(dataZamowienia);
        
        try{
        if (zamowienieList.size()==0)
        {          
            model.addAttribute("errormessage","Nie ma zamowienia z: "+dataZamowienia); 
            return "errorzam";                
        }
        else
        {        
            long id = zamowienieList.get(0).getId();
            zamowienieRepository.deleteById(id);

            model.addAttribute("header", "Wynik"); 
            model.addAttribute("message","Usunieto zamowienie z: "+dataZamowienia); 
            return "viewmessagezam";                
        }
        } catch (Exception e)
        { return "errorzam";
                }
    }
    
        //--------- EDYTOWANIE KLIENTA ---------\\
        
        @RequestMapping("/edit_klient/{id}")
    public String editKlient(Model model, TransKlient transKlient, @PathVariable(name = "id") Long id) {
            Klient klient = klientRepository.findByid(id).get(0);

            long id_klienta = klient.getId();
            String imie = klient.getImie();
            String nazwisko = klient.getNazwisko();
            String email = klient.getEmail();
            
            System.out.println("id_klienta" + id + "imie" + imie + "nazwisko" + nazwisko + "email" +email);
            
            model.addAttribute("id", id_klienta);
            model.addAttribute("imie", imie);
            model.addAttribute("nazwisko", nazwisko);
            model.addAttribute("email", email);
            
            model.addAttribute("transKlient", transKlient);
            return "editformklient";
    }   
    
    @RequestMapping(value = "/edit_klient", method = RequestMethod.POST)
    public String editKlient(Model model,TransKlient transKlient)
    {
            Long id_klienta = Long.parseLong(transKlient.getId());
            String imie = transKlient.getImie();
            String nazwisko = transKlient.getNazwisko();
            String email = transKlient.getEmail();
        
        klientRepository.save(new Klient(id_klienta, imie, nazwisko, email));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +imie + " " +nazwisko+ " "+email);
        return "viewmessageklient";
        
    }
    
        //--------- EDYTOWANIE KSIAZKI ---------\\
        
        @RequestMapping("/edit_ksiazka/{id}")
    public String editKsiazka(Model model, TransKsiazka transKsiazka, @PathVariable(name = "id") Long id) {
            Ksiazka ksiazka = ksiazkaRepository.findByid(id).get(0);

            long id_ksiazki = ksiazka.getId();
            String nazwa = ksiazka.getNazwa();
            String gatunek = ksiazka.getGatunek();
            int cena = ksiazka.getCena();
            
            System.out.println("id_ksiazki" + id + "nazwa" + nazwa + "gatunek" + gatunek + "cena" +cena);
            
            model.addAttribute("id", id_ksiazki);
            model.addAttribute("nazwa", nazwa);
            model.addAttribute("gatunek", gatunek);
            model.addAttribute("cena", cena);
            
            model.addAttribute("transKsiazka", transKsiazka);
            return "editformksiazka";
    }   
    
    @RequestMapping(value = "/edit_ksiazka", method = RequestMethod.POST)
    public String editKsiazka(Model model,TransKsiazka transKsiazka)
    {
            Long id_ksiazki = Long.parseLong(transKsiazka.getId());
            String nazwa = transKsiazka.getNazwa();
            String gatunek = transKsiazka.getGatunek();
            String scena = transKsiazka.getScena();
            int cena = Integer.parseInt(scena);

        
       ksiazkaRepository.save(new Ksiazka(id_ksiazki, nazwa, gatunek, cena));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +nazwa + " " +gatunek+ " " +cena);
        return "viewmessageksiazka";
        
    }
    
    //--------- EDYTOWANIE PRACOWNIKA ---------\\
        
        @RequestMapping("/edit_pracownik/{id}")
    public String editPracownik(Model model, TransPracownik transPracownik, @PathVariable(name = "id") Long id) {
            Pracownik pracownik = pracownikRepository.findByid(id).get(0);

            long id_pracownika = pracownik.getId();
            String imie = pracownik.getImie();
            String nazwisko = pracownik.getNazwisko();
            int telefon = pracownik.getTelefon();
            String stanowisko = pracownik.getStanowisko();
            
            System.out.println("id_pracownika" + id + "imie" + imie + "nazwisko" + nazwisko + "telefon" +telefon+ "stanowisko" +stanowisko);
            
            model.addAttribute("id", id_pracownika);
            model.addAttribute("imie", imie);
            model.addAttribute("nazwsiko", nazwisko);
            model.addAttribute("telefon", telefon);
            model.addAttribute("stanowisko", stanowisko);
            
            model.addAttribute("transPracownik", transPracownik);
            return "editformpracownik";
    }   
    
    @RequestMapping(value = "/edit_pracownik", method = RequestMethod.POST)
    public String editPracownik(Model model,TransPracownik transPracownik)
    {
            Long id_pracownika = Long.parseLong(transPracownik.getId());
            String imie = transPracownik.getImie();
            String nazwisko = transPracownik.getNazwisko();
            String stelefon = transPracownik.getStelefon();
            int telefon = Integer.parseInt(stelefon);
            String stanowisko = transPracownik.getStanowisko();

        
       pracownikRepository.save(new Pracownik(id_pracownika, imie, nazwisko, telefon, stanowisko));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +imie + " " +nazwisko+ " " +telefon+ " " +stanowisko);
        return "viewmessagepracownik";
        
    }
    
     //--------- EDYTOWANIE AUTORA ---------\\
        
        @RequestMapping("/edit_autor/{id}")
    public String editAutor(Model model, TransAutor transAutor, @PathVariable(name = "id") Long id) {
            Autor autor = autorRepository.findByid(id).get(0);

            long id_autora = autor.getId();
            String imie = autor.getImie();
            String nazwisko = autor.getNazwisko();
            
            System.out.println("id_autora" + id + "imie" + imie + "nazwisko" + nazwisko);
            
            model.addAttribute("id", id_autora);
            model.addAttribute("imie", imie);
            model.addAttribute("nazwisko", nazwisko);
            
            model.addAttribute("transAutor", transAutor);
            return "editformautor";
    }   
    
    @RequestMapping(value = "/edit_autor", method = RequestMethod.POST)
    public String editAutor(Model model,TransAutor transAutor)
    {
            Long id_autora = Long.parseLong(transAutor.getId());
            String imie = transAutor.getImie();
            String nazwisko = transAutor.getNazwisko();
        
        autorRepository.save(new Autor(id_autora, imie, nazwisko));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +imie + " " +nazwisko);
        return "viewmessageautor";
        
    }
    
     //--------- EDYTOWANIE WYDAWNICTWA ---------\\
        
        @RequestMapping("/edit_wydawnictwo/{id}")
    public String editGatunek(Model model, TransGatunek transGatunek, @PathVariable(name = "id") Long id) {
            Gatunek gatunek = gatunekRepository.findByid(id).get(0);

            long id_gatunku = gatunek.getId();
            String nazwa = gatunek.getNazwa();
            
            System.out.println("id gatunku" + id + "nazwa" + nazwa);
            
            model.addAttribute("id", id_gatunku);
            model.addAttribute("nazwa", nazwa);
            
            model.addAttribute("transGatunek", transGatunek);
            return "editformgatunek";
    }   
    
    @RequestMapping(value = "/edit_gatunek", method = RequestMethod.POST)
    public String editGatunek(Model model,TransGatunek transGatunek)
    {
            Long id_gatunku = Long.parseLong(transGatunek.getId());
            String nazwa = transGatunek.getNazwa();
        
        gatunekRepository.save(new Gatunek(id_gatunku, nazwa));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +nazwa);
        return "viewmessagegatunek";
        
    }
    
       //--------- EDYTOWANIE ZAMOWIENIA ---------\\
        
        @RequestMapping("/edit_zam/{id}")
    public String editZamowienie(Model model, TransZamowienie transZamowienie, @PathVariable(name = "id") Long id) {
            Zamowienie zamowienie = zamowienieRepository.findByid(id).get(0);

            long id_zamowienia = zamowienie.getId();
            String dataZamowienia = zamowienie.getDataZamowienia();
            String dataOtrzymania = zamowienie.getDataOtrzymania();
            int koszt = zamowienie.getKoszt();
            
            System.out.println("id_ksiazki" + id + "data zamowienia" + dataZamowienia + "data otrzymania" + dataOtrzymania + "koszt" +koszt);
            
            model.addAttribute("id", id_zamowienia);
            model.addAttribute("nazwa", dataZamowienia);
            model.addAttribute("gatunek", dataOtrzymania);
            model.addAttribute("cena", koszt);
            
            model.addAttribute("transZamowienie", transZamowienie);
            return "editformzamowienie";
    }   
    
    @RequestMapping(value = "/edit_zam", method = RequestMethod.POST)
    public String editZamowienie(Model model,TransZamowienie transZamowienie)
    {
        
            Long id_zamowienia = Long.parseLong(transZamowienie.getId());
            String dataZamowienia = transZamowienie.getDataZamowienia();
            String dataOtrzymania = transZamowienie.getDataOtrzymania();
            String skoszt = transZamowienie.getSkoszt();
            int koszt = Integer.parseInt(skoszt);
        
       ksiazkaRepository.save(new Ksiazka(id_zamowienia, dataZamowienia, dataOtrzymania, koszt));
        
        model.addAttribute("header", "Zaktualizowano dane w bazie");
        model.addAttribute("message", "" +dataZamowienia + " " +dataOtrzymania+ " " +koszt);
        return "viewmessagezamowienie";
        
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

        