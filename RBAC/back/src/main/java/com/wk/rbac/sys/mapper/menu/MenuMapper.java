package com.wk.rbac.sys.mapper.menu;

import com.wk.rbac.entity.po.RbMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MenuMapper {
    List<RbMenu> conditionQuery(Map<String,Object> paramMap);

    int insert(RbMenu rbMenu);

    int update(RbMenu rbMenu);

    int deleteMenu(RbMenu rbMenu);

    int batchDelete(List<Integer> integers);

    List<RbMenu> QueryByPid(@Param("pid") Integer i);
}
