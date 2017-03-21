package com.template.aouth.rest.api.service;

import com.template.aouth.rest.api.entity.Account;

public interface AccountService {
    void save(Account account);

    Account findByUsername(String username);
}
