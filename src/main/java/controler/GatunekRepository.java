package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GatunekRepository extends JpaRepository<Gatunek, Long> {
        
    List<Gatunek> findByNazwa(String nazwa);
   
}
