package com.wk.rbac.sys.controller;

import com.wk.rbac.entity.po.RbMenu;
import com.wk.rbac.sys.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"Menu Controller"})
@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;
    @ApiOperation(value = "menu query", tags = {"query"})
    @GetMapping("getAll")
    public List<RbMenu> getAllMenu(){

        return menuService.getAllMenu();
    }
}
