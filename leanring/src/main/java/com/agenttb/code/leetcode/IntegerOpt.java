package com.agenttb.code.leetcode;

public class IntegerOpt {
    public String countAndSay(int n) {
        String initStr = "1";
        if (n == 1) {
            return initStr;
        }
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < initStr.length(); j++) {
                char initCh = initStr.charAt(j);
                int counter = 0;
                while (j < initStr.length() && initStr.charAt(j) == initCh) {
                    counter++;
                    j++;
                }
                j--;
                sb.append(counter).append(initCh);
            }
            initStr = sb.toString();
        }
        return initStr;
    }
}
