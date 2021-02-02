package com.wk.rbac.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.RoleQuery;

/**
 * @author: wk
 * @Date: 2021/2/2 13:03
 * @Description
 */
public interface RoleService {
    JSONObject queryByCondition(RoleQuery query);

}
