package com.template.aouth.rest.api.controller;

import com.template.aouth.rest.api.dto.ItemDto;
import com.template.aouth.rest.api.dto.ItemListDto;
import com.template.aouth.rest.api.dto.DtoMapper;
import com.template.aouth.rest.api.entity.Item;
import com.template.aouth.rest.api.service.ItemService;
import com.template.aouth.rest.api.service.repository.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping(value = "api/items", produces = {"application/json"})
@RestController
public class ItemsResource {

    private ItemService itemService;
    private DtoMapper dtoMapper;

    @Autowired
    public ItemsResource(ItemService itemService, DtoMapper dtoMapper) {
        this.itemService = itemService;
        this.dtoMapper = dtoMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ItemListDto getAccounts(
            @RequestParam(required = false, defaultValue = "0", name = "pageNumber") int pageNumber,
            @RequestParam(required = false, defaultValue = "10", name = "pageSize") int pageSize) {
        ResultPage<Item> resultPage = itemService.getItems(pageNumber, pageSize);
        List<ItemDto> itemDtos = dtoMapper.map(resultPage.getContent(), ItemDto.class);
        return new ItemListDto(itemDtos, resultPage.getPageNumber(), resultPage.getTotalPages());
    }
}
