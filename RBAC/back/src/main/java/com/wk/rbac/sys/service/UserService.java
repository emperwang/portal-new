package com.wk.rbac.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.UserAdd;
import com.wk.rbac.entity.bo.UserQuery;

import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:53
 * @Description
 */
public interface UserService {
    JSONObject queryCondition(UserQuery query);

    int addUser(UserAdd userAdd);

    int userUpdate(JSONObject object);

    int userDelete(Map<String, Object> map);

    int userDeleteBatch(JSONObject object);
}
