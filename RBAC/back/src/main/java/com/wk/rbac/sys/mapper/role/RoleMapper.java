package com.wk.rbac.sys.mapper.role;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.RoleAdd;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.entity.po.RbRole;
import com.wk.rbac.entity.vo.UserVo;

import java.util.List;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:04
 * @Description
 */
public interface RoleMapper {
    List<RbRole> queryCondition(RoleQuery query);

    int roleInsert(RoleAdd add);

    int roleUpdate(JSONObject json);

    int roleDelete(Map<String, Object> maps);

    int roleBatchDel(List<Integer> list);
}
