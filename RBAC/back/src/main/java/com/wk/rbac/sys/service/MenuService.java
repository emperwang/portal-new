package com.wk.rbac.sys.service;

import com.wk.rbac.entity.po.RbMenu;

import java.util.List;
import java.util.Map;

public interface MenuService {

    List<RbMenu> menuQueryCondition(Map<String,Object> paramMap);
}
