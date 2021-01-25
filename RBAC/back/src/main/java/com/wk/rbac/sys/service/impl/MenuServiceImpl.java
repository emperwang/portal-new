package com.wk.rbac.sys.service.impl;

import com.wk.rbac.entity.po.RbMenu;
import com.wk.rbac.sys.mapper.menu.MenuMapper;
import com.wk.rbac.sys.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(isolation = Isolation.DEFAULT)
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<RbMenu> menuQueryCondition(Map<String,Object> paramMap) {
        return menuMapper.conditionQuery(paramMap);
    }
}
