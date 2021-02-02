package com.wk.rbac.entity.bo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: wk
 * @Date: 2021/2/2 15:13
 * @Description
 */
@Data
@ToString
@Accessors(chain = true)
public class UserAdd {
    @Min(0)
    @NotNull
    private Integer organizeId;

    @Length(min = 6,message = "invalid loginName")
    @NotNull
    private String loginName;

    @Length(min = 6, message = "invalid password")
    @NotNull
    private String password;
    @Length(min = 1,message = "invalid userName")
    @NotNull
    private String userName;

    @Length(min = 5, max = 11,message = "invalid mobile")
    @NotNull
    private String mobile;

    @Length(min = 8,message = "invalid email")
    @NotNull
    private String email;
}
