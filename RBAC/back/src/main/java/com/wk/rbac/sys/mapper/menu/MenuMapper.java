package com.wk.rbac.sys.mapper.menu;

import com.wk.rbac.entity.po.RbMenu;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<RbMenu> conditionQuery(Map<String,Object> paramMap);
}
