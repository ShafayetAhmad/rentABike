package com.shafayet.rentABike.login;

import com.shafayet.rentABike.appuser.AppUser;
import com.shafayet.rentABike.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoginService {

    private final AppUserService appUserService;

    public String login(LoginRequest request) {
        UserDetails user = appUserService.loadUserByUsername(request.getEmail());
        if (user != null && user.getPassword().equals(request.getPassword())) {
            return "Login successful";
        } else {
            throw new IllegalStateException("Invalid email or password");
        }
    }
}