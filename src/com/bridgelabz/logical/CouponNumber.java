package com.bridgelabz.logical;

import java.util.Random;

public class CouponNumber {
    public String createRandomCouponNumber(int couponCodeLength) {
        char[] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String s = new String();
        Random random = new Random();
        for (int i = 0; i < couponCodeLength; i++) {
            char c = chars[random.nextInt(chars.length)];
            s = s + c;
        }
        return s;
    }

    public static void main(String[] args) {
        CouponNumber cn = new CouponNumber();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Coupon Code:" + cn.createRandomCouponNumber(10));
        }
    }
}

