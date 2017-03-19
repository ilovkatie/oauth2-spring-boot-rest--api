package com.template.aouth.rest.api.service.repository;


import com.template.aouth.rest.api.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Item, Long> {
    List<Item> getByName(String name);
}
