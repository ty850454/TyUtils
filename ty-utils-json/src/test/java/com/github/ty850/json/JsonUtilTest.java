package com.github.ty850.json;


import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author xy
 */
class JsonUtilTest {

    @Test
    void toJson() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("a", 12);
        map.put("b", "NIH");
        String json = JsonUtil.toJson(map);
        System.out.println(json);
    }

    @Test
    void toObject() {
    }

    @Test
    void toList() {
    }
}