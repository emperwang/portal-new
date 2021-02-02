package com.wk.rbac.sys.service;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.AuthQuery;

/**
 * @author: wk
 * @Date: 2021/2/2 13:52
 * @Description
 */
public interface AuthorityService {
    JSONObject queryCondition(AuthQuery authQuery);
}
