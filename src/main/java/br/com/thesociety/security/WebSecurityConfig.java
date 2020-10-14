package br.com.thesociety.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/home").hasAnyRole("PG_HOME")
                .anyRequest()
                .authenticated()
          .and()
                .formLogin()
                .loginPage("/entrar")
                .permitAll()
        .and()
           .logout()
                .logoutSuccessUrl("/entrar?logout")
                .permitAll();

    }
}
