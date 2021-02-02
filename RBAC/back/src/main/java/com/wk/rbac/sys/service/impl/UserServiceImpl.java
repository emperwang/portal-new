package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.constant.FieldConstant;
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
}
