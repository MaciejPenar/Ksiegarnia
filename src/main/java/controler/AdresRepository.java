package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres, Long> {
        


    List<Adres> findByMiejscowosc(String miejscowosc);
    List<Adres> findByUlica(String ulica);
    List<Adres> findByMiejscowoscAndUlica(String miejscowosc, String ulica);
   
}
