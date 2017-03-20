package com.template.aouth.rest.api.config;

import com.template.aouth.rest.api.service.ItemService;
import com.template.aouth.rest.api.dto.DtoMapper;
import com.template.aouth.rest.api.service.repository.ItemsRepository;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

@EnableJpaRepositories(basePackages = "com.template.aouth.rest.api")
@EnableAspectJAutoProxy
@ComponentScan
@Configuration
public class Beans {

    @Bean
    public ItemService itemsService(ItemsRepository itemsRepository) {
        return new ItemService(itemsRepository);
    }

    @Bean
    public RoleHierarchy roleHierarchy(){
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy("ROLE_SUPREME > ROLE_DEVELOPER ROLE_DEVELOPER > ROLE_ADMIN  ROLE_ADMIN > ROLE_USER");
        return roleHierarchy;
    }

    @Bean
    public DtoMapper dtoMapper() {
        return new DtoMapper();
    }

}
