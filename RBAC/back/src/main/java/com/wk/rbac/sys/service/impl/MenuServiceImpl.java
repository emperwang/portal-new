package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.po.RbMenu;
import com.wk.rbac.sys.mapper.menu.MenuMapper;
import com.wk.rbac.sys.service.MenuService;
import com.wk.rbac.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@Transactional(isolation = Isolation.DEFAULT)
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<RbMenu> menuQueryCondition(Map<String,Object> paramMap) {
        return menuMapper.conditionQuery(paramMap);
    }

    @Override
    public int addMenu(RbMenu rbMenu) {
        int count = 0;
        if (rbMenu != null) {
            count += menuMapper.insert(rbMenu);
        }
        return count;
    }

    @Override
    public int updateMenu(RbMenu rbMenu) {
        int count = 0;
        if (rbMenu != null){
            count += menuMapper.update(rbMenu);
        }
        return count;
    }

    @Override
    public int deleteMenu(RbMenu rbMenu) {
        int count = 0;
        if (rbMenu != null){
            count += menuMapper.deleteMenu(rbMenu);
        }
        return count;
    }

    @Override
    public int batchDelete(String body) {
        int count = 0;
        if (StringUtils.isEmpty(body)){
            return count;
        }
        JSONArray ids = JSONObject.parseObject(body).getJSONArray("id");
        List<Integer> integers = ids.toJavaList(Integer.class);
        log.info(integers.toString());
        if (integers!=null && integers.size()>0){
            count += menuMapper.batchDelete(integers);
        }
        return count;
    }
}
