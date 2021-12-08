package com.movie.theater.config;

import com.movie.theater.service.impl.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private JwtRequestFilter jwtRequestFilter;
    @Autowired
    private JwtAuthenProvider jwtAuthenProvider;
    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    //config Authen
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("Call authentication provider");
        //way 1
        auth.userDetailsService(jwtUserDetailsService);
        //way 2
//        auth.authenticationProvider(jwtAuthenProvider.AuthenProviderSetUserPassBean());
    }

    // config author
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests().antMatchers("/loginPage","/account/**","/employee/**").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin()
//                .and()
//                .addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
