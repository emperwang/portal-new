package com.wk.rbac.entity.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author: wk
 * @Date: 2021/2/2 14:30
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class UserQuery {
    private Integer uid;
    private Integer organizeId;
    private String loginName;
    private String userName;
    private String mobile;
    private String email;
}
