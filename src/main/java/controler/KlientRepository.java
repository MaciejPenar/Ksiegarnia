package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KlientRepository extends JpaRepository<Klient, Long> {
        

    List<Klient> findByid(long id);
    List<Klient> findByImieAndNazwisko(String imie, String nazwisko);
    List<Klient> findByNazwisko(String nazwisko);

   
}
