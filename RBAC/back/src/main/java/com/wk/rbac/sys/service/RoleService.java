package com.wk.rbac.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.RoleAdd;
import com.wk.rbac.entity.bo.RoleQuery;

import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:03
 * @Description
 */
public interface RoleService {
    JSONObject queryByCondition(RoleQuery query);

    int roleAdd(RoleAdd add);

    int roleUpdate(JSONObject json);

    int roleDelete(Map<String, Object> maps);

    int roleBatchDelete(String body);
}
