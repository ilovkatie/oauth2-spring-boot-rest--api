package com.template.aouth.rest.api.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "items")
public class ItemListDto {

    @XmlElement(name = "items")
    private List<ItemDto> items;
    private int pageNumber;
    private int totalPages;

    public ItemListDto() {
    }

    public ItemListDto(List<ItemDto> items, int pageNumber, int totalPages) {
        this.items = items;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
