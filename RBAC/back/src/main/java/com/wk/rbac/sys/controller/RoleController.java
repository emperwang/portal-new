package com.wk.rbac.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.RoleAdd;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.sys.service.RoleService;
import com.wk.rbac.util.JsonUtil;
import com.wk.rbac.util.ResponseUtil;
import com.wk.rbac.util.ValidateUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Api("role controller")
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "role query")
    @GetMapping(value = "query",produces = {"application/json"})
    public ResponseEntity<?> roleQuery(RoleQuery query){
        log.info("roleQuery receive parameter:{}", JsonUtil.beanToJson(query));
        JSONObject obj =  roleService.queryByCondition(query);
        return ResponseUtil.getResponse(HttpStatus.OK,obj.toJSONString());
    }

    @ApiOperation(value = "role add")
    @PostMapping(value = "add",produces = {"application/json"})
    public ResponseEntity<?> queryAdd(RoleAdd add){
        log.info("queryAdd receive parameter:{}", JsonUtil.beanToJson(add));
        Map<String, String> map = ValidateUtil.validateBean(add, Default.class);
        if (map != null && map.size()>0){
            return ResponseUtil.getResponse(HttpStatus.BAD_REQUEST,map);
        }
        int count =  roleService.roleAdd(add);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "role update")
    @PutMapping(value = "update",produces = {"application/json"})
    public ResponseEntity<?> queryUpdate(@RequestBody  JSONObject json){
        log.info("queryUpdate receive parameter:{}", json.toJSONString());
        if (json != null && json.size() <= 0){
            return ResponseUtil.getResponse(HttpStatus.CREATED);
        }
        int count =  roleService.roleUpdate(json);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "role delete")
    @DeleteMapping(value = "del",produces = {"application/json"})
    public ResponseEntity<?> queryDelete(@RequestBody Map<String,Object> maps){
        log.info("queryDelete receive parameter:{}", JsonUtil.beanToJson(maps));
        int count =  roleService.roleDelete(maps);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }

    @ApiOperation(value = "role batch delete")
    @DeleteMapping(value = "batdel",produces = {"application/json"})
    public ResponseEntity<?> queryBatDel(@RequestBody String body){
        log.info("queryBatDel receive parameter:{}", body);
         int count =  roleService.roleBatchDelete(body);
        return ResponseUtil.getResponse(HttpStatus.CREATED);
    }
}
