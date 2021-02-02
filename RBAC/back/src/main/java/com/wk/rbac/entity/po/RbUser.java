package com.wk.rbac.entity.po;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author: wk
 * @Date: 2021/2/2 12:44
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class RbUser {
    private Integer uid;
    private Integer organizeId;
    private String loginName;
    private String password;
    private String userName;
    private String mobile;
    private String email;
    private Date  generateTime;
    private Date firstTime;
    private String lastLoginTime;
    private Integer count;
}
