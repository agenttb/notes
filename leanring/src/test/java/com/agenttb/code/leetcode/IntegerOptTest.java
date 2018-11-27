package com.agenttb.code.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerOptTest {
    private IntegerOpt integerOpt;

    @Before
    public void init() {
        integerOpt = new IntegerOpt();
    }

    @Test
    public void testCounterAndSayStr() {
        String res1 = integerOpt.countAndSay(1);
        Assert.assertEquals(res1, "1");

        String res2 = integerOpt.countAndSay(2);
        Assert.assertEquals(res2, "11");

        String res3 = integerOpt.countAndSay(3);
        Assert.assertEquals(res3, "21");

        String res4 = integerOpt.countAndSay(4);
        Assert.assertEquals(res4, "1211");

        String res5 = integerOpt.countAndSay(5);
        Assert.assertEquals(res5, "111221");

        String res6 = integerOpt.countAndSay(6);
        Assert.assertEquals(res6, "312211");

        String res7 = integerOpt.countAndSay(7);
        Assert.assertEquals(res7, "13112221");

        String res8 = integerOpt.countAndSay(8);
        Assert.assertEquals(res8, "1113213211");

        String res9 = integerOpt.countAndSay(9);
        Assert.assertEquals(res9, "31131211131221");

        String res10 = integerOpt.countAndSay(10);
        Assert.assertEquals(res10, "13211311123113112211");
    }
}
