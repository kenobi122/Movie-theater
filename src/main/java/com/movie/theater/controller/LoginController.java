package com.movie.theater.controller;

import com.movie.theater.config.JwtTokenUtils;
import com.movie.theater.model.request.JwtRequest;
import com.movie.theater.model.response.JwtResponse;
import com.movie.theater.service.impl.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class LoginController {

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;
    @Autowired
    private JwtTokenUtils jwtTokenUtils;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping(value = "loginPage")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        // get uset, password
        System.out.println("run GetMapping " + jwtRequest.getUsername() + " " + jwtRequest.getPassword());
        authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());

        // load User name
        UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(jwtRequest.getUsername());

        // generate token
        final String token = jwtTokenUtils.generateToken(userDetails);
        // response the token
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            // call authenticationManagerBean
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            // compare user
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

    @GetMapping(value = "test")
    public String test_controller() {
        return "Test";
    }
}
