package com.imooc.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Author: Ccaveman
 * @Description: 将对象进行格式化
 * @Date: Created in 19:09 2017/8/22
 */
public class JsonUtil {

    /**
     * 将对象转换成好看的json格式
     * @param object 传入转换对象
     * @return 对象的json好看的格式
     */
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
