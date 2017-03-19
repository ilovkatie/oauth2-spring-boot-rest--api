package com.template.aouth.rest.api.config;

import com.template.aouth.rest.api.service.ItemService;
import com.template.aouth.rest.api.dto.DtoMapper;
import com.template.aouth.rest.api.service.repository.ItemsRepository;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

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
    public DtoMapper dtoMapper() {
        return new DtoMapper();
    }

}
