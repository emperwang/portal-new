package com.wk.rbac.sys.mapper.user;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.entity.bo.UserAdd;
import com.wk.rbac.entity.bo.UserQuery;
import com.wk.rbac.entity.vo.UserVo;

import java.util.List;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:54
 * @Description
 */
public interface UserMapper {
    List<UserVo> queryCondition(UserQuery query);

    int userAdd(UserAdd userAdd);

    int userUpdate(JSONObject object);

    int userDelete(Map<String, Object> map);

    int userBatchDel(List<Integer> list);
}
