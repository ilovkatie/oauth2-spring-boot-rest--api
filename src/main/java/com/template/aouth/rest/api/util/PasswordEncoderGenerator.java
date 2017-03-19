package com.template.aouth.rest.api.util;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderGenerator {

    private PasswordEncoderGenerator(){

    }

    public static String encodePassword(PasswordEncoder passwordEncoder, String password){
        return passwordEncoder.encode(password);
    }
}