package com.wk.rbac.sys.mapper.role;

import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.entity.po.RbRole;
import com.wk.rbac.entity.vo.UserVo;

import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 13:04
 * @Description
 */
public interface RoleMapper {
    List<RbRole> queryCondition(RoleQuery query);
}
