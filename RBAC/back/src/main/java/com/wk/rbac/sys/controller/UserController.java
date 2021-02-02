package com.wk.rbac.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.UserAdd;
import com.wk.rbac.entity.bo.UserQuery;
import com.wk.rbac.sys.service.UserService;
import com.wk.rbac.util.JsonUtil;
import com.wk.rbac.util.ResponseUtil;
import com.wk.rbac.util.ValidateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 11:56
 * @Description
 */
@Slf4j
@Api("user controller")
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "user query")
    @GetMapping(value = "query",produces = {"application/json"})
    public ResponseEntity userQuery(UserQuery query){
        log.info("userQuery receive parameter:{}", JsonUtil.beanToJson(query));
        JSONObject obj = userService.queryCondition(query);
        return ResponseUtil.getResponse(HttpStatus.OK,obj.toJSONString());
    }

    @ApiOperation(value = "user add")
    @PostMapping(value = "add",consumes = {"application/json"})
    public ResponseEntity userAdd(@RequestBody UserAdd userAdd){
        log.info("userAdd receive parameter:{}", JsonUtil.beanToJson(userAdd));
        Map<String, String> map = ValidateUtil.validateBean(userAdd, Default.class);
        if (map != null && map.size()>0){
            return ResponseUtil.getResponse(HttpStatus.BAD_REQUEST,map);
        }
        int count = userService.addUser(userAdd);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "user update")
    @PutMapping(value = "update", consumes = {"application/json"})
    public ResponseEntity userUpdate(@RequestBody JSONObject object){
        log.info("userUpdate receive parameter:{}", object.toJSONString());
        if (object == null || !object.containsKey("uid")){
            return ResponseUtil.getResponse(HttpStatus.BAD_REQUEST);
        }
        int count = userService.userUpdate(object);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    // delete 参数类似于 get
    @ApiOperation(value = "user delete")
    @DeleteMapping(value = "delete", consumes = {"application/json"})
    public ResponseEntity userDelete(@RequestParam Map<String,Object> map){
        log.info("userDelete receive parameter:{}", JsonUtil.beanToJson(map));
        int count = userService.userDelete(map);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    // delete 参数类似于 get
    /*
    {
    "uid":[1,2,3,4,5]
    }
     */
    @ApiOperation(value = "batch delete")
    @DeleteMapping(value = "batdel", consumes = {"application/json"})
    public ResponseEntity userDeletebatch(@RequestBody String ids){
        log.info("userDeletebatch receive parameter:{}", ids);
        if (StringUtils.isEmpty(ids)){
            return ResponseUtil.getResponse(HttpStatus.CREATED);
        }
        JSONObject object = JSONObject.parseObject(ids);
        if (object != null && object.containsKey("uid")) {
            int count = userService.userDeleteBatch(object);
        }
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

}
