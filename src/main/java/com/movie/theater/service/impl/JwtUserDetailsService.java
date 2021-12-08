package com.movie.theater.service.impl;

import com.movie.theater.model.entity.Account;
import com.movie.theater.service.AccountInternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Component
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private AccountInternalService accountInternalService;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println("Run load User by username");
//        List<Account> userList = accountInternalService.findAccount();
//        for (Account account : userList) {
//            if (account.getUsername().equals(s)) {
//                return new User(account.getUsername(), account.getPassword(), new ArrayList<>());
//            }
//        }
        return new User("admin", passwordEncoder().encode("admin"), new ArrayList<>());
//        return null;
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
