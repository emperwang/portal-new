package com.wk;

import com.wk.rbac.util.ExUtil;
import org.junit.Test;

public class exceptionTest {

    @Test
    public void test(){
        Exception exception = new Exception("this is exception");
        String s = ExUtil.buildErrorMessage(exception);
        System.out.printf(s);
    }
}
