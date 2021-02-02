package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.constant.FieldConstant;
import com.wk.rbac.entity.bo.UserAdd;
import com.wk.rbac.entity.bo.UserQuery;
import com.wk.rbac.entity.vo.UserVo;
import com.wk.rbac.sys.mapper.user.UserMapper;
import com.wk.rbac.sys.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author: wk
 * @Date: 2021/2/2 13:53
 * @Description
 */
@Slf4j
@Service
@Transactional(isolation = Isolation.DEFAULT)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public JSONObject queryCondition(UserQuery query) {
        List<UserVo> uses = userMapper.queryCondition(query);
        JSONObject object = new JSONObject();
        object.put(FieldConstant.DataList, uses);
        return object;
    }

    @Override
    public int addUser(UserAdd userAdd) {
        return userMapper.userAdd(userAdd);
    }

    @Override
    public int userUpdate(JSONObject object) {
        // 没有可更新的
        if (object == null || object.size() == 1){
            return 0;
        }
        return userMapper.userUpdate(object);
    }

    @Override
    public int userDelete(Map<String, Object> map) {

        return userMapper.userDelete(map);
    }

    @Override
    public int userDeleteBatch(JSONObject object) {
        List<Integer> ids = object.getJSONArray("uid").toJavaList(Integer.class);
        int count = userMapper.userBatchDel(ids);
        return count;
    }
}
