package com.wk.rbac.sys.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wk.rbac.constant.FieldConstant;
import com.wk.rbac.entity.bo.AuthQuery;
import com.wk.rbac.entity.po.RbAuthority;
import com.wk.rbac.sys.mapper.auth.AuthorityMapper;
import com.wk.rbac.sys.service.AuthorityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 13:53
 * @Description
 */
@Service
@Slf4j
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
}
