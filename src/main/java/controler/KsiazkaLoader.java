package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class KsiazkaLoader implements ApplicationRunner {

    private KsiazkaRepository ksiazkaRepository;

            @Autowired
    public KsiazkaLoader(KsiazkaRepository ksiazkaRepository) {
        this.ksiazkaRepository = ksiazkaRepository;
    }

    public void run(ApplicationArguments args) {
        
        ksiazkaRepository.save(new Ksiazka("Teatr wskrzeszonych","kryminal, sensacja, thriller",21));
    }

}
