package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres, Long> {
        

    List<Autor> findByid(long id);
    List<Autor> findByMiejscowosc(String miejscowosc);
    List<Autor> findByUlica(String ulica);

   
}
