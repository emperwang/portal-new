package com.wk.rbac.sys.controller;

import com.wk.rbac.entity.po.RbMenu;
import com.wk.rbac.sys.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("getAll")
    public List<RbMenu> getAllMenu(){

        return menuService.getAllMenu();
    }
}
