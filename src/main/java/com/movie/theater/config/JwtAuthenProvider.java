package com.movie.theater.config;

import com.movie.theater.service.impl.JwtUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class JwtAuthenProvider {
    private final PasswordEncoder passwordEncoder;
    private final JwtUserDetailsService userDetails;

    public JwtAuthenProvider(PasswordEncoder passwordEncoder, JwtUserDetailsService userDetails) {
        this.passwordEncoder = passwordEncoder;
        this.userDetails = userDetails;
    }

    @Bean
    public AuthenticationProvider AuthenProviderSetUserPassBean() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder);
        daoAuthenticationProvider.setUserDetailsService(userDetails);
        return daoAuthenticationProvider;
    }
}
