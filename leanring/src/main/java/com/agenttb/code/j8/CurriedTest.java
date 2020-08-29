package com.agenttb.code.j8;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

public class CurriedTest {

    public static void main(String[] args) {
        DoubleUnaryOperator unaryOperator = curriedConverter(10, 10);
        DoubleBinaryOperator binaryOperator = curriedConverter1(10, 10);
        double v = unaryOperator.applyAsDouble(10);
        System.out.println("curried 1 res  =" + v);
        double v1 = binaryOperator.applyAsDouble(10, 10);
        System.out.println("curried 2 res =" + v1);
    }

    static DoubleUnaryOperator curriedConverter(double f, double b) {
        return (double x) -> x * f + b;
    }

    static DoubleBinaryOperator curriedConverter1(double f, double b) {
        return  (double x, double y) -> x + y + f + b;
    }
}
