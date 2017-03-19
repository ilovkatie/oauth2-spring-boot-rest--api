package com.template.aouth.rest.api.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class ItemDto {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
