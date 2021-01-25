package com.wk.rbac.sys.controller;

import com.wk.rbac.entity.po.RbMenu;
import com.wk.rbac.sys.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = {"Menu Controller"})
@RestController
@Slf4j
public class MenuController {

    @Autowired
    private MenuService menuService;

    @ApiOperation(value = "menu query", tags = {"query"})
    @GetMapping("query")
    public List<RbMenu> menuQuery(@RequestParam(value = "id", required = false) Integer id,
                                   @RequestParam(value = "pid",required = false) Integer pid,
                                   @RequestParam(value = "menuText",required = false)String menuText,
                                   @RequestParam(value = "menuUrl", required = false) String menuUrl,
                                   @RequestParam(value = "menuIcon", required = false)String menuIcon,
                                   @RequestParam(value = "menuDisable",required = false)Boolean menuDisable){
        log.info("menuQuery request param,id :{}, pid:{}, menuText:{}, menuUrl:{}, menuIcon:{}, menuDisable:{}",
                id, pid,menuText,menuUrl,menuIcon, menuDisable);
        Map<String,Object> paramMap = new HashMap<>();
        if (id != null && id > 0){
            paramMap.put("id", id);
        }
        if (pid != null && pid > 0){
            paramMap.put("pid", pid);
        }
        if (!StringUtils.isEmpty(menuText)){
            paramMap.put("menuText", menuText);
        }
        if (!StringUtils.isEmpty(menuUrl)){
            paramMap.put("menuUrl", menuUrl);
        }
        if (!StringUtils.isEmpty(menuIcon)){
            paramMap.put("menuIcon", menuIcon);
        }
        if (menuDisable != null){
            paramMap.put("menuDisable", menuDisable);
        }
        return menuService.menuQueryCondition(paramMap);
    }
}
