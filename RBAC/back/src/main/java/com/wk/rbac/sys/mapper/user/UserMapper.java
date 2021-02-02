package com.wk.rbac.sys.mapper.user;

import com.wk.rbac.entity.bo.UserQuery;
import com.wk.rbac.entity.vo.UserVo;

import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 13:54
 * @Description
 */
public interface UserMapper {
    List<UserVo> queryCondition(UserQuery query);
}
