package com.wk.rbac.entity.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author: wk
 * @Date: 2021/2/2 13:57
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class AuthQuery {
    private Integer authId;
    private Integer pId;
    private String authName;
}
