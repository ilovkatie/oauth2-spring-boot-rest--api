package com.template.aouth.rest.api.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
