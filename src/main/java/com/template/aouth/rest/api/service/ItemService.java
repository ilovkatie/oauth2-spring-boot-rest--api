package com.template.aouth.rest.api.service;

import com.template.aouth.rest.api.entity.Item;
import com.template.aouth.rest.api.service.repository.ItemsRepository;
import com.template.aouth.rest.api.service.repository.ResultPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ItemService {

    private ItemsRepository itemsRepository;

    public ItemService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public ResultPage<Item> getItems(int pageNumber, int pageSize) {
        Page<Item> accountsPage = itemsRepository.findAll(new PageRequest(pageNumber, pageSize));
        return new ResultPage<>(accountsPage.getContent(), accountsPage.getNumber(), accountsPage.getTotalPages());
    }

}
