package com.template.aouth.rest.api.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RunWith(MockitoJUnitRunner.class)
//@ActiveProfiles("unit-tests")
public class PasswordEncoderGeneratorTest {

    @Test
    public void bCryptEncode(){
        System.out.println(PasswordEncoderGenerator.encodePassword(new BCryptPasswordEncoder(), "user"));
    }
}
