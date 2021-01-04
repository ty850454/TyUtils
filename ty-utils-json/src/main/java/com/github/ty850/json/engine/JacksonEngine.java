package com.github.ty850.json.engine;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ty850.json.JsonEngine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xy
 */
public class JacksonEngine implements JsonEngine {

    public final ObjectMapper mapper;

    {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }


    @Override
    public String toJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T toObject(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> List<T> toList(String json, Class<T> clazz) {
        List<T> list = null;
        try {
            JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, clazz);
            list = mapper.readValue(json, javaType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
