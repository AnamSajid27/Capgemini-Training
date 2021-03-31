package com.springSecurity.springsecurityAssignment1Q4.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {

    private  String userName;
    private String password;
    private boolean active;
    private String roles;
    private boolean accountNonLocked;
    private List<GrantedAuthority> authorities;


    public MyUserDetails(User user){
        System.out.println("Inside my user details");
        this.userName=user.getUserName();
        this.password=user.getPassword();
        this.active=user.isActive();
        this.accountNonLocked=user.isAccountNonLocked();
        this. authorities= Arrays.stream(user.getRoles().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
        System.out.println(userName);
        System.out.println(password);
        System.out.println(active);
        System.out.println(authorities);

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }
}
