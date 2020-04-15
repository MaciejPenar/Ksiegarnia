package util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//Szyfrowanie hasel

public class PasswordEncoderUtil {
  
    public static void main(String[] args) 
    {
    
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        
        //Generowania hasla dla admin
        String passwordAdmin = "polska";
        System.out.println("Haslo oryginalne dla admin: |"+passwordAdmin+"|");        
        String encodedAdmin = encoder.encode(passwordAdmin);
        System.out.println("haslo zakodowane dla admin: |"+encodedAdmin+"|");
        
        //Generowania hasla dla pracownik
        String passwordPracownik = "praca";
        System.out.println("Haslo oryginalne dla pracownik: |"+passwordPracownik+"|");        
        String encodedPracownik = encoder.encode(passwordPracownik);
        System.out.println("haslo zakodowane dla pracownik: |"+encodedPracownik+"|");
        
        //Generowania hasla dla klient
        String passwordKlient = "zakupy";
        System.out.println("Haslo oryginalne dla klient: |"+passwordKlient+"|");        
        String encodedKlient = encoder.encode(passwordKlient);
        System.out.println("haslo zakodowane dla klient: |"+encodedKlient+"|");
        
        //Generowania hasla dla jan
        String passwordJan = "rzeszow";
        System.out.println("Haslo oryginalne dla jan: |"+passwordJan+"|");        
        String encodedJan = encoder.encode(passwordJan);
        System.out.println("haslo zakodowane dla jan: |"+encodedJan+"|");
        
  }
}
