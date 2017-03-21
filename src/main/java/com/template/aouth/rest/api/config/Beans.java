package com.template.aouth.rest.api.config;

import com.template.aouth.rest.api.repository.AccountsRepository;
import com.template.aouth.rest.api.repository.RoleRepository;
import com.template.aouth.rest.api.service.AccountService;
import com.template.aouth.rest.api.service.AccountServiceImpl;
import com.template.aouth.rest.api.service.ItemService;
import com.template.aouth.rest.api.dto.DtoMapper;
import com.template.aouth.rest.api.repository.ItemsRepository;
import com.template.aouth.rest.api.service.ItemServiceImpl;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.template.aouth.rest.api")
@EnableAspectJAutoProxy
@ComponentScan
@Configuration
public class Beans {

    @Bean
    public ItemService itemsService(ItemsRepository itemsRepository) {
        return new ItemServiceImpl(itemsRepository);
    }

    @Bean
    public AccountService accountsService(AccountsRepository accountsRepository, RoleRepository roleRepository) {
        return new AccountServiceImpl(accountsRepository, roleRepository);
    }

    @Bean
    public DtoMapper dtoMapper() {
        return new DtoMapper();
    }

}
