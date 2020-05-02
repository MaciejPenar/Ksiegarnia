package controler;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/add_klient").hasAuthority("ROLE_ADMIN")
                .antMatchers("/add_ksiazka").hasAuthority("ROLE_ADMIN")
                .antMatchers("/add_adres").hasAuthority("ROLE_ADMIN")
                .antMatchers("/add_pracownik").hasAuthority("ROLE_ADMIN")
                .antMatchers("/edit_ksiazka").hasAuthority("ROLE_ADMIN")
                .antMatchers("/edit_zam").hasAuthority("ROLE_ADMIN")
                .antMatchers("/edit_pracownik").hasAuthority("ROLE_ADMIN")
                .antMatchers("/edit_klient").hasAuthority("ROLE_ADMIN")
                .antMatchers("/edit_adres").hasAuthority("ROLE_ADMIN")
                .antMatchers("/delete_ksiazka/{id_ksiazki}").hasAuthority("ROLE_ADMIN")
                .antMatchers("/delete_zam/{id_zamowienia}").hasAuthority("ROLE_ADMIN")
                .antMatchers("/delete_pracownik/{id_pracownika}").hasAuthority("ROLE_ADMIN")
                .antMatchers("/delete_klient/{id_klienta}").hasAuthority("ROLE_ADMIN")
                .antMatchers("/delete_adres/{id_adresu}").hasAuthority("ROLE_ADMIN")
                .antMatchers("/add_zam").hasAuthority("ROLE_ADMIN")
                .antMatchers("/add_zam").hasAuthority("ROLE_CLIENT")
                .antMatchers("/add_koszyk").hasAuthority("ROLE_ADMIN")
                .antMatchers("/add_koszyk").hasAuthority("ROLE_CLIENT")
                .antMatchers("/print_koszyk").hasAuthority("ROLE_ADMIN")
                .antMatchers("/print_koszyk").hasAuthority("ROLE_CLIENT")
                
                
                
                .antMatchers("/admin").hasAuthority("ROLE_ADMIN")
                .antMatchers("/staff").hasAuthority("ROLE_STAFF")
                .antMatchers("/client").hasAuthority("ROLE_CLIENT")
                
                .anyRequest().permitAll()
                .and()
            .formLogin()
                
                .loginPage("/login")
                
                .permitAll();
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {      

        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}polska").roles("ADMIN").and()
                .withUser("pracownik").password("{noop}praca").roles("STAFF").and()
                .withUser("klient").password("{noop}zakupy").roles("CLIENT").and()
                .withUser("jan").password("{noop}rzeszow").roles("ADMIN", "STAFF");

    }



/*
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/admin").hasAuthority("ROLE_ADMIN")
                .antMatchers("/staff").hasAuthority("ROLE_STAFF")
                .antMatchers("/client").hasAuthority("ROLE_CLIENT")
                .anyRequest().permitAll()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll();
    }

    @Autowired
    DataSource dataSource;
 
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    
    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .dataSource(dataSource)
                .usersByUsernameQuery("select username,password, enabled from users where username=?")
                .authoritiesByUsernameQuery("select username, role from user_roles where username=?");
        
        
    }
    
    */

}

