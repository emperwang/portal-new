package com.wk.rbac.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.UserQuery;

/**
 * @author: wk
 * @Date: 2021/2/2 13:53
 * @Description
 */
public interface UserService {
    JSONObject queryCondition(UserQuery query);
}
