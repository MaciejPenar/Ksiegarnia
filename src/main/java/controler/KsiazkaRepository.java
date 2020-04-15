package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KsiazkaRepository extends JpaRepository<Ksiazka, Long> {
        
    List<Ksiazka> findByNazwa(String nazwa);
    List<Ksiazka> findByNazwaAndGatunek(String nazwa, String gatunek);

}
