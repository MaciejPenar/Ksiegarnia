package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    private KlientRepository klientRepository;
    private AutorRepository autorRepository;
    private ZamowienieRepository zamowienieRepository;
    private GatunekRepository gatunekRepository;

    @Autowired
    public DataLoader(KlientRepository klientRepository, AutorRepository autorRepository, ZamowienieRepository zamowienieRepository, GatunekRepository gatunekRepository) {
        this.klientRepository = klientRepository;
        this.autorRepository = autorRepository;
        this.zamowienieRepository = zamowienieRepository;
        this.gatunekRepository = gatunekRepository;
        
    }
    


    public void run(ApplicationArguments args) {
        
        klientRepository.save(new Klient("Jan","Kowalski","jankowalski@gmail.com"));
        klientRepository.save(new Klient("Adam","Nowak","adamnowak12@gmail.com"));             
        klientRepository.save(new Klient("Kinga","Sarna","ksarna23@gmail.com")); 
        
        autorRepository.save(new Autor("Olga","Tokarczuk"));
        autorRepository.save(new Autor("Andrzej","Sapkowski"));
        autorRepository.save(new Autor("Stephen","King"));
        
        gatunekRepository.save(new Gatunek("Horror"));
    }

}
