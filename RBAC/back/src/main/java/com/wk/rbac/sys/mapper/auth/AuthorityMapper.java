package com.wk.rbac.sys.mapper.auth;

import com.wk.rbac.entity.bo.AuthQuery;
import com.wk.rbac.entity.po.RbAuthority;

import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 13:54
 * @Description
 */
public interface AuthorityMapper {
    List<RbAuthority> queryCondition(AuthQuery authQuery);
}
