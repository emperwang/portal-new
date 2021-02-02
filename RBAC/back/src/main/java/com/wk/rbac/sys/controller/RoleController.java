package com.wk.rbac.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.sys.service.RoleService;
import com.wk.rbac.util.ResponseUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping(value = "query",produces = {"application/json"})
    public ResponseEntity<?> queryAuth(RoleQuery query){
        JSONObject obj =  roleService.queryByCondition(query);
        return ResponseUtil.getResponse(HttpStatus.OK,obj.toJSONString());
    }
}
