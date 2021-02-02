package com.wk.rbac.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.AuthAdd;
import com.wk.rbac.entity.bo.AuthQuery;

import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:52
 * @Description
 */
public interface AuthorityService {
    JSONObject queryCondition(AuthQuery authQuery);

    int authAdd(AuthAdd authAdd);

    int authUpdate(JSONObject object);

    int authDelete(Map<String, Object> maps);

    int authBatchDel(JSONObject object);
}
