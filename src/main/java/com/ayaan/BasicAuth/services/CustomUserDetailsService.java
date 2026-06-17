package com.ayaan.BasicAuth.services;

import com.ayaan.BasicAuth.entity.Users;
import com.ayaan.BasicAuth.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepo userReo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userReo.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not found"));

        return User.builder().username(user.getUsername()).password(user.getPassword()).roles("USER").build();
    }
}
