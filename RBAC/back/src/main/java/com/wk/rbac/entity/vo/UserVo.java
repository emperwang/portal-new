package com.wk.rbac.entity.vo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author: wk
 * @Date: 2021/2/2 13:19
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class UserVo {
    private Integer uid;
    private Integer organizeId;
    private String loginName;
    private String userName;
    private String mobile;
    private String email;
    private Date generateTime;
    private Date firstTime;
    private String lastLoginTime;
    private Date updateTime;
    private Integer count;
}
