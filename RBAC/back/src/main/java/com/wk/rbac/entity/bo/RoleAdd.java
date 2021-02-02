package com.wk.rbac.entity.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: wk
 * @Date: 2021/2/2 17:14
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class RoleAdd {
    @NotNull
    @Min(1)
    private Integer pId;

    @NotNull
    @Length(min = 1)
    private String roleName;

    @NotNull
    @Length(min = 1)
    private String description;
}
