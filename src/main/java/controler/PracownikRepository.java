package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PracownikRepository extends JpaRepository<Pracownik, Long> {
        


    List<Pracownik> findByImieAndNazwisko(String imie, String nazwisko);
    List<Pracownik> findByNazwisko(String nazwisko);

   
}
