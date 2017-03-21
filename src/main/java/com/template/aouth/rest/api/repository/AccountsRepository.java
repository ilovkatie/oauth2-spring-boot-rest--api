package com.template.aouth.rest.api.repository;

import com.template.aouth.rest.api.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Account, Long> {

    Account getByUsername(String username);

}
