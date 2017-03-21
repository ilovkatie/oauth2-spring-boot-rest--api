package com.template.aouth.rest.api.service;

import com.template.aouth.rest.api.entity.Item;
import com.template.aouth.rest.api.repository.ItemsRepository;
import com.template.aouth.rest.api.repository.ResultPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

public interface ItemService {
    ResultPage<Item> getItems(int pageNumber, int pageSize);
}
