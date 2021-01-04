package com.github.ty850.json;

import java.util.List;

/**
 * @author xy
 */
public class JsonUtil {

    public static final JsonEngine ENGINE = JsonEngineFactory.create();

    /**
     * 将对象转为json字符串
     *
     * @param object 对象
     * @return json
     */
    public static String toJson(Object object) {
        return ENGINE.toJson(object);
    }

    /**
     * 将json字符串转为对象
     *
     * @param json json
     * @param clazz 目标对象class
     * @param <T> 类型
     * @return 对象实例
     */
    public static <T> T toObject(String json, Class<T> clazz) {
        return ENGINE.toObject(json, clazz);
    }

    /**
     * 将json转为对象集合
     *
     * @param json json
     * @param clazz 集合中class
     * @param <T> 类型
     * @return 集合
     */
    public static <T> List<T> toList(String json, Class<T> clazz) {
        return ENGINE.toList(json, clazz);
    }

}
