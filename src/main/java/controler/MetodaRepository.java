package controler;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetodaRepository extends JpaRepository<Metoda, Long> {

    List<Adres> findByNazwa(String nazwa);
   
}
