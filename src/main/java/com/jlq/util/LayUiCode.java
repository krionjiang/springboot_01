package com.jlq.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：jlq
 * @date ：Created in 2020/11/23 14:12
 */

public class LayUiCode {
    static Map<String, Object> map = new HashMap<>();

    public static Map<String, Object> ok(){
        map.put("code", 0) ;
        map.put("data", "ok");
        map.put("time", System.currentTimeMillis());
        return map ;
    }

    public static Map<String, Object> ok(Object data){
        map.put("code", 0) ;
        map.put("data", data);
        map.put("time", System.currentTimeMillis());
        return map ;
    }
}


