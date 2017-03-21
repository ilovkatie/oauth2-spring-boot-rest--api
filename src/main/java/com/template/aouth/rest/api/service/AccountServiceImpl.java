package com.template.aouth.rest.api.service;


import com.template.aouth.rest.api.entity.Account;
import com.template.aouth.rest.api.repository.AccountsRepository;
import com.template.aouth.rest.api.repository.RoleRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AccountServiceImpl implements AccountService{

    private AccountsRepository accountsRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AccountServiceImpl(AccountsRepository accountsRepository, RoleRepository roleRepository) {
        this.accountsRepository = accountsRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void save(Account account) {
        account.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
        account.getRoles().add(roleRepository.findByName("ROLE_USER"));
        accountsRepository.save(account);
    }

    @Override
    public Account findByUsername(String username) {
        return accountsRepository.getByUsername(username);
    }
}
