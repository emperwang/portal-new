package com.wk.rbac.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.UserQuery;
import com.wk.rbac.sys.service.UserService;
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
 * @Date: 2021/2/2 11:56
 * @Description
 */
@Slf4j
@Api("user controller")
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "query",produces = {"application/json"})
    public ResponseEntity userQuery(UserQuery query){
        JSONObject obj = userService.queryCondition(query);
        return ResponseUtil.getResponse(HttpStatus.OK,obj.toJSONString());
    }
}
