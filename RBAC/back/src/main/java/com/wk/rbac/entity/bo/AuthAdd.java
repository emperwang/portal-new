package com.wk.rbac.entity.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: wk
 * @Date: 2021/2/2 16:32
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class AuthAdd {
    @Min(1)
    @NotNull
    private Integer pId;

    @Length(min = 1)
    @NotNull
    private String authName;

    @Length(min = 1)
    @NotNull
    private String description;
}
