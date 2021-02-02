package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.constant.FieldConstant;
import com.wk.rbac.entity.bo.AuthAdd;
import com.wk.rbac.entity.bo.AuthQuery;
import com.wk.rbac.entity.po.RbAuthority;
import com.wk.rbac.sys.mapper.auth.AuthorityMapper;
import com.wk.rbac.sys.service.AuthorityService;
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
@Service
@Slf4j
@Transactional(isolation = Isolation.DEFAULT)
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;

    @Override
    public JSONObject queryCondition(AuthQuery authQuery) {
        List<RbAuthority> auths = authorityMapper.queryCondition(authQuery);
        JSONObject object = new JSONObject();
        object.put(FieldConstant.DataList,auths);
        return object;
    }

    @Override
    public int authAdd(AuthAdd authAdd) {
        return authorityMapper.authInsert(authAdd);
    }

    @Override
    public int authUpdate(JSONObject object) {
        return authorityMapper.authUpdate(object);
    }

    @Override
    public int authDelete(Map<String, Object> maps) {
        return authorityMapper.authDelete(maps);
    }

    @Override
    public int authBatchDel(JSONObject object) {
        List<Integer> ids = object.getJSONArray("authId").toJavaList(Integer.class);
        return authorityMapper.authBatchDel(ids);
    }
}
