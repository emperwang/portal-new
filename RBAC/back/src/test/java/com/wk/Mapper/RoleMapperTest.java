package com.wk.Mapper;

import com.alibaba.fastjson.JSONObject;
import com.wk.BaseTest;
import com.wk.rbac.entity.bo.RoleAdd;
import com.wk.rbac.entity.bo.RoleQuery;
import com.wk.rbac.entity.po.RbRole;
import com.wk.rbac.sys.mapper.role.RoleMapper;
import com.wk.rbac.sys.mapper.user.UserMapper;
import com.wk.rbac.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import springfox.documentation.spring.web.json.Json;

import java.util.Arrays;
import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 17:36
 * @Description
 */
@Slf4j
public class RoleMapperTest extends BaseTest {
    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testAdd(){
        RoleAdd add = new RoleAdd().setPId(0).setDescription("test role add 1").setRoleName("role:add");
        roleMapper.roleInsert(add);
        RoleAdd add1 = new RoleAdd().setPId(0).setDescription("test role add 2").setRoleName("role:update");
        roleMapper.roleInsert(add1);
    }

    @Test
    public void testQuery(){
        RoleQuery roleQuery = new RoleQuery().setPId(0);
        List<RbRole> rbRoles = roleMapper.queryCondition(roleQuery);
        log.info("queryCondition:{}", JsonUtil.beanToJson(rbRoles));
    }

    @Test
    public void testUpdate(){
        JSONObject object = new JSONObject();
        object.put("roleId",1);
        object.put("pId",0);
        object.put("roleName","role:addddddddddd");
        roleMapper.roleUpdate(object);
    }
    @Test
    public void testDelete(){
        JSONObject object = new JSONObject();
//        object.put("roleId",1);
//        object.put("pId",0);
//        object.put("roleName","role:addddddddddd");
        roleMapper.roleDelete(object);
    }

    @Test
    public void testbatchDelete(){
        List<Integer> ids = Arrays.asList(1,2,3,4);
        roleMapper.roleBatchDel(ids);
    }
}
