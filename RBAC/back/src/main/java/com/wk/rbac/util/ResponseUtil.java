package com.wk.rbac.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:10
 * @Description
 */
@Slf4j
public class ResponseUtil {
    public static ResponseEntity<Map> getResponse(HttpStatus status, String message, String errCode){
        Map<String,String> map = new HashMap<>();
        map.put("code",errCode);
        map.put("message",message);
        log.info("response msg:{}, code:{}",message, status.toString());
        return new ResponseEntity<Map>(map,status);
    }


    public static ResponseEntity<String> getResponse(HttpStatus status,String message){
        log.info("response msg:{}, code:{}",message, status.toString());
        return new ResponseEntity<String>(message,status);
    }

    public static ResponseEntity<Map> getResponse(HttpStatus status,Map mapParam){
        Map<String,String> map = new HashMap<>();
        if (map!=null && map.size()>0){
            mapParam.remove("status");
            mapParam.remove("message");
        }
        map.putAll(mapParam);
        log.info("response msg:{}, code:{}",JsonUtil.beanToJson(map), status.toString());
        return new ResponseEntity<Map>(map,status);
    }

    public static ResponseEntity getResponse(HttpStatus status){
        log.info("code ={}", status.toString());
        return new ResponseEntity(status);
    }
}
