package com.wk.rbac.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.AuthQuery;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.sys.service.AuthorityService;
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
@Api("authority controller")
@RequestMapping("auth")
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    @GetMapping(value = "query",produces = {"application/json"})
    private ResponseEntity authQuery(AuthQuery authQuery){
        JSONObject obj = authorityService.queryCondition(authQuery);
        return ResponseUtil.getResponse(HttpStatus.OK,obj.toJSONString());
    }
}
