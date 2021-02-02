package com.wk.rbac.sys.service;

import java.util.List;

/**
 * @author: wk
 * @Date: 2021/2/2 13:05
 * @Description
 */
public interface BaseOperate<T> {

    public List<T> query(T t);
    public Integer add(T t);
    public Integer update(T t);
    public Integer delete(T t);
}
