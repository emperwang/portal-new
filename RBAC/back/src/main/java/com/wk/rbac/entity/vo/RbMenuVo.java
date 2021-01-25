package com.wk.rbac.entity.vo;

import com.wk.rbac.entity.po.RbMenu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class RbMenuVo {
    private Integer id;
    private Integer pId;
    private String menuText;
    private String menuUrl;
    private String menuIcon;
    private Integer orderNum;
    private Boolean menuDisable;

    private List<RbMenu> children;
}
