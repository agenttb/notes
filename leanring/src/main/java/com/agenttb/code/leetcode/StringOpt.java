package com.agenttb.code.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringOpt {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int maxLen = 0;
        List<String> list = new ArrayList<>();
        for (int i = num2.length() - 1; i >= 0; i--) {
            int carryFlag = 0;
            StringBuilder sb = new StringBuilder();
            for (int n = 0; n < num2.length() - i - 1; n++) {
                sb.append(0);
            }
            for (int j = num1.length() - 1; j >= 0; j--) {
                int sum = ((num1.charAt(j) - '0') * (num2.charAt(i) - '0'));
                carryFlag = carryNumber(carryFlag, sb, sum);
            }
            if (carryFlag > 0) {
                sb.append(carryFlag);
            }

            if (sb.length() >= maxLen) {
                maxLen = sb.length();
            }
            list.add(sb.toString());
        }

        int carryFlag = 0;
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < maxLen; index++) {
            int accumulate = 0;

            for (String strNumber : list) {
                if (index < strNumber.length()) {
                    accumulate += strNumber.charAt(index) - '0';
                }
            }
            carryFlag = carryNumber(carryFlag, sb, accumulate);
        }
        if (carryFlag > 0) {
        sb.append(carryFlag);
        }

        return sb.reverse().toString();
    }

    private int carryNumber(int carrayFlag, StringBuilder sb, int accumulate) {
        int remainder;
        if (carrayFlag > 0) {
            accumulate += carrayFlag;
        }
        remainder = accumulate % 10;
        carrayFlag = accumulate / 10;
        sb.append(remainder);
        return carrayFlag;
    }
}
