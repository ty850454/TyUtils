package com.github.ty850.json;

import java.util.List;

/**
 * @author xy
 */
public interface JsonEngine {

    /**
     * 将对象转为json字符串
     *
     * @param object 对象
     * @return json
     */
    String toJson(Object object);

    /**
     * 将json字符串转为对象
     *
     * @param json json
     * @param clazz 目标对象class
     * @param <T> 类型
     * @return 对象实例
     */
    <T> T toObject(String json, Class<T> clazz);

    /**
     * 将json转为对象集合
     *
     * @param json json
     * @param clazz 集合中class
     * @param <T> 类型
     * @return 集合
     */
    <T> List<T> toList(String json, Class<T> clazz);

}
