package com.wk.rbac.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.AuthAdd;
import com.wk.rbac.entity.bo.AuthQuery;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.sys.service.AuthorityService;
import com.wk.rbac.sys.service.RoleService;
import com.wk.rbac.util.JsonUtil;
import com.wk.rbac.util.ResponseUtil;
import com.wk.rbac.util.ValidateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 11:57
 * @Description
 */
@Slf4j
@Api("authority controller")
@RequestMapping("auth")
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @ApiOperation(value = "authority query", httpMethod = "GET")
    @GetMapping(value = "query",produces = {"application/json"})
    private ResponseEntity authQuery(AuthQuery authQuery){
        log.info("authQuery receive parameter: {}", JsonUtil.beanToJson(authQuery));
        JSONObject obj = authorityService.queryCondition(authQuery);
        return ResponseUtil.getResponse(HttpStatus.OK,obj.toJSONString());
    }

    @ApiOperation(value = "authority add", httpMethod = "POST")
    @PostMapping(value = "add",consumes = {"application/json"},produces = {"application/json"})
    private ResponseEntity authAdd(@RequestBody AuthAdd authAdd){
        log.info("authAdd receive parameter:{}",JsonUtil.beanToJson(authAdd));
        Map<String, String> map = ValidateUtil.validateBean(authAdd, Default.class);
        if (map != null && map.size()>0){
            return ResponseUtil.getResponse(HttpStatus.BAD_REQUEST,map);
        }
        int count = authorityService.authAdd(authAdd);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "authority update", httpMethod = "PUT")
    @PutMapping(value = "update",consumes = {"application/json"}, produces = {"application/json"})
    private ResponseEntity authUpdate(@RequestBody String bds){
        log.info("authUpdate receive param:{}", bds);
        JSONObject object = JSONObject.parseObject(bds);
        if (object == null || object.size() <= 1){
            return ResponseUtil.getResponse(HttpStatus.CREATED);
        }
        int count = authorityService.authUpdate(object);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "authority delete", httpMethod = "DELETE")
    @DeleteMapping(value = "del",produces = {"application/json"})
    private ResponseEntity authDelete(@RequestParam Map<String,Object> maps){
        log.info("authDelete receive parameter:{}",JsonUtil.beanToJson(maps));
        if (maps == null || maps.size() <= 0){
            return ResponseUtil.getResponse(HttpStatus.CREATED);
        }
        int count = authorityService.authDelete(maps);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "authority batch delete", httpMethod = "DELETE")
    @DeleteMapping(value = "batdel",consumes = {"application/json"},produces = {"application/json"})
    private ResponseEntity authBatDel(@RequestBody String json){
        log.info("authDeletebatch receive parameter:{}",json);
        JSONObject object = JSONObject.parseObject(json);
        if (object == null || object.size() <=0 ){
            return ResponseUtil.getResponse(HttpStatus.CREATED);
        }
        int count = authorityService.authBatchDel(object);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }


}
