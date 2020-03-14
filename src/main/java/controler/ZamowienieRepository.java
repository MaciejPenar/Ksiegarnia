package controler;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ZamowienieRepository extends JpaRepository<Zamowienie, Long> {
        
    //Osoby starsze niz podany parametr
    //List<Person> findByAgeGreaterThanEqual(int age);
    
    //Wybranie osob o ustalonym imieniu i nazwisku
    //List<Person> findByFirstNameAndLastName(String firstName,String lastName);
    
    //Wybranie kobiet
    //List<Person> findByGender(String gender);

    List<Zamowienie> findByDataZamowieniaAndDataOtrzymania(String dataZamowienia, String dataOtrzymania);
    List<Zamowienie> findByDataZamowienia(String dataOtrzymania);
    List<Zamowienie> findByid(Long id);
    List<Zamowienie> findByKsiazkaNazwa(String nazwa);
    List<Zamowienie> findByKlientNazwisko(String nazwisko);
}
