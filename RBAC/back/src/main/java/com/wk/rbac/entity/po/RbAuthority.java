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
public class RbAuthority {
    private Integer authorityId;
    private Integer pid;
    private String authorityName;
    private String description;
    private Date createTime;
    private Date updateTime;
}
