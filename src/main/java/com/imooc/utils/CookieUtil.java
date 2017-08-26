package com.imooc.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Ccaveman
 * @Description: cookie工具类
 * @Date: Created in 18:09 2017/8/26
 */
public class CookieUtil {

    /**
     * 设置cookie
     * @param response
     * @param name
     * @param value
     * @param maxAge
     */
    public static void set(HttpServletResponse response,String name,String value,int maxAge){
        Cookie cookie = new Cookie(name,value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     * 获取cookie
     * @param httpServletRequest
     * @param name
     * @return
     */
    public static Cookie get(HttpServletRequest httpServletRequest, String name){
        Map<String,Cookie> cookieMap = readCookieMap(httpServletRequest);
        if (cookieMap.containsKey(name)){
            return cookieMap.get(name);
        }

        return null;
    }

    /**
     * 获取用户的cookie将cookie的名称和对象封装为map
     * @param httpServletRequest
     * @return
     */
    private static Map<String,Cookie> readCookieMap(HttpServletRequest httpServletRequest){
        Map<String,Cookie> cookieMap = new HashMap<>();
        Cookie [] cookies = httpServletRequest.getCookies();
        if (cookies != null) {
            for (Cookie c:cookies) {
                cookieMap.put(c.getName(),c);
            }
        }
        return cookieMap;
    }
}
