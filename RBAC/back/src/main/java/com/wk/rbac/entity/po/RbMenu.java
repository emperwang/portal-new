package com.wk.rbac.entity.po;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class RbMenu {
    private Integer id;
    private Integer pId;
    private String menuText;
    private String menuUrl;
    private String menuIcon;
    private boolean menuDisable;
}
