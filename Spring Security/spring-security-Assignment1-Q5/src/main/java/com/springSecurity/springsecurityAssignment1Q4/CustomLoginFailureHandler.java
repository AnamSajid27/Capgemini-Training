package com.springSecurity.springsecurityAssignment1Q4;

import com.springSecurity.springsecurityAssignment1Q4.Model.MyUserDetails;
import com.springSecurity.springsecurityAssignment1Q4.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@Component
public class CustomLoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

   @Autowired
    UserService userService;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        String username=request.getParameter("username");
       User user =userService.getUserByName(username);
       if(user!=null){
           if(user.isActive() && user.isAccountNonLocked()){
               if(user.getFailedAttempt()<3){
                  userService.increaseFailedAttempts(user);
               }
               else{
                   userService.lock(user);
                   exception = new LockedException("Account has been locked due to 3 unsuccessful login attempt");
               }

           }
       }
       else{
           System.out.println("username not exists");
       }

        super.setDefaultFailureUrl("/login?error");
        super.onAuthenticationFailure(request, response, exception);

    }
}
