package com.template.aouth.rest.api.service;

import com.template.aouth.rest.api.entity.Account;
import com.template.aouth.rest.api.repository.AccountsRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServiceImpl implements UserDetailsService {

    private AccountsRepository accountsRepository;

    public UserDetailsServiceImpl(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountsRepository.getByUsername(username);
        if (account == null) {
            throw new UsernameNotFoundException(String.format("Account %s not found", username));
        }
        return account;
    }

}
