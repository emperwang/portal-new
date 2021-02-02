package com.wk.rbac.entity.po;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author: wk
 * @Date: 2021/2/2 12:45
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class RbRole {
    private Integer roleId;
    private Integer pid;
    private String roleName;
    private Date generateTime;
    private Date updateTime;
    private String description;
}
