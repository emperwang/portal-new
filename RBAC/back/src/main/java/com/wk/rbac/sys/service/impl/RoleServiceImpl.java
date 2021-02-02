package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.constant.FieldConstant;
import com.wk.rbac.entity.bo.RoleAdd;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.entity.po.RbRole;
import com.wk.rbac.entity.vo.UserVo;
import com.wk.rbac.sys.mapper.role.RoleMapper;
import com.wk.rbac.sys.service.RoleService;
import com.wk.rbac.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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

    @Override
    public int roleAdd(RoleAdd add) {
        return roleMapper.roleInsert(add);
    }

    @Override
    public int roleUpdate(JSONObject json) {
        int count = 0;
        if (json == null || json.size() <= 0){
            return count;
        }
        count += roleMapper.roleUpdate(json);
        return count;
    }

    @Override
    public int roleDelete(Map<String, Object> maps) {
        return roleMapper.roleDelete(maps);
    }

    @Override
    public int roleBatchDelete(String body) {
        int count = 0;
        JSONObject object = JsonUtil.jsonToBean(body,JSONObject.class);
        if (object == null || !object.containsKey("roleId")){
            return count;
        }
        List<Integer> list = object.getJSONArray("roleId").toJavaList(Integer.class);
        count += roleMapper.roleBatchDel(list);
        return 0;
    }
}
