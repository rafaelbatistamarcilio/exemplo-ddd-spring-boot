package br.com.userAccess.utils;

import br.com.userAccess.config.security.UserSpringSecurity;
import org.springframework.security.core.context.SecurityContextHolder;

public class Utils {

    public static UserSpringSecurity authenticated() {
        try {
            return (UserSpringSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
