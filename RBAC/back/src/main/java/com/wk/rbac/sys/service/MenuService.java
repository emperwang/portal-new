package com.wk.rbac.sys.service;

import com.wk.rbac.entity.po.RbMenu;
import com.wk.rbac.entity.vo.RbMenuVo;

import java.util.List;
import java.util.Map;

public interface MenuService {

    List<RbMenu> menuQueryCondition(Map<String,Object> paramMap);

    int addMenu(RbMenu rbMenu);

    int updateMenu(RbMenu rbMenu);

    int deleteMenu(RbMenu rbMenu);

    int batchDelete(String body);

    List<RbMenuVo> getMenuTree();

}
