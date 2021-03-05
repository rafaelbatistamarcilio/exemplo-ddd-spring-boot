package com.app.exemploddd.shared.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DomainEvent {
    private String jsonData;
    private String type;
    private ObjectMapper mapper;

    public DomainEvent(Object data, String type) throws JsonProcessingException {
        this.mapper = new ObjectMapper();
        this.jsonData = mapper.writeValueAsString(data);
        this.type = type;
    }

    public String getJsonData() {
        return jsonData;
    }

    public String getType() {
        return type;
    }

    public <T> T jsonTo(Class<T> contentClass) throws JsonMappingException, JsonProcessingException {
        return mapper.readValue(this.jsonData, contentClass);
    }
}