package controler;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
        

    List<Autor> findByImieAndNazwisko(String imie, String nazwisko);
    List<Autor> findByNazwisko(String nazwisko);

   
}
