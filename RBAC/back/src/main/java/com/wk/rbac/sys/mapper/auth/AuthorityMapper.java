package com.wk.rbac.sys.mapper.auth;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.AuthAdd;
import com.wk.rbac.entity.bo.AuthQuery;
import com.wk.rbac.entity.po.RbAuthority;

import java.util.List;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:54
 * @Description
 */
public interface AuthorityMapper {
    List<RbAuthority> queryCondition(AuthQuery authQuery);

    int authInsert(AuthAdd authAdd);

    int authUpdate(JSONObject object);

    int authBatchDel(List<Integer> list);

    int authDelete(Map<String, Object> maps);
}
