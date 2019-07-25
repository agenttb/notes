package com.agenttb.code.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringOptTest {
    private StringOpt strOpt;

    @Before
    public void init() {
        strOpt = new StringOpt();
    }
    @Test
    public void testMultiplyMethod() {
        String num1 = "123";
        String num2 = "456";
        String resStr = strOpt.multiply(num1, num2);
        Assert.assertEquals("56088", resStr);

        String resStr1 = strOpt.multiply("2", "3");
        Assert.assertEquals("6", resStr1);

        String resStr2 = strOpt.multiply("0", "11111");
        Assert.assertEquals("0", resStr2);
    }
}
