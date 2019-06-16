package com.java;

import java.math.BigDecimal;

public class Main {
    public static void main(String args []) {
        double value = 0.37;
        double dsum = value + value + value;
        System.out.println(dsum);
        //Always convert BigSum to String with to.String Method
        String strVal = Double.toString(dsum);
        System.out.println("New valye of my String:" + strVal);
        BigDecimal bVal = new BigDecimal(strVal);
        BigDecimal bSum = bVal.add(bVal).add(bVal);
        System.out.println("Sum of new value :" + bSum.toString());
    }

}
