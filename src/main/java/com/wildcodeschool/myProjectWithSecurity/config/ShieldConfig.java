package com.wildcodeschool.myProjectWithSecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class ShieldConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // mvcMatchers to solve security issue implemented with help from David! (thanks, mate!)
        http
                .authorizeRequests()
                .mvcMatchers("/").permitAll()
                .mvcMatchers("/avengers/assemble").hasRole("HERO")
                .mvcMatchers("/secret-bases").hasRole("DIREX")
                /*.antMatchers("/").permitAll()
                .antMatchers("/avengers/assemble").hasRole("HERO")
                .antMatchers("/secret-bases").hasRole("DIREX")
                 */
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .and()
                .httpBasic();

    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth
                .inMemoryAuthentication()
                .withUser("SteveGuy")
                .password(encoder.encode("steve"))
                .roles("")
                .and()
                .withUser("TonyStark")
                .password(encoder.encode("stark"))
                .roles("HERO")
                .and()
                .withUser("NickFury")
                .password(encoder.encode("fury"))
                .roles("DIREX");
    }



}
