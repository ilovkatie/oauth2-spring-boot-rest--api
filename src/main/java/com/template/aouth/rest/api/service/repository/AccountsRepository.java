package com.template.aouth.rest.api.service.repository;

import com.template.aouth.rest.api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Account, Long> {

    Account getByLogin(String login);

}
