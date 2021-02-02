package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.constant.FieldConstant;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.entity.po.RbRole;
import com.wk.rbac.entity.vo.UserVo;
import com.wk.rbac.sys.mapper.role.RoleMapper;
import com.wk.rbac.sys.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 13:03
 * @Description
 */
@Slf4j
@Service
@Transactional(isolation = Isolation.DEFAULT)
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public JSONObject queryByCondition(RoleQuery query) {
        List<RbRole> users = roleMapper.queryCondition(query);
        final JSONObject object = new JSONObject();
        object.put(FieldConstant.DataList, users);
        return object;
    }
}
