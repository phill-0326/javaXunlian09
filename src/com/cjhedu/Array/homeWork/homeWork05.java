package com.cjhedu.Array.homeWork;

import java.util.Enumeration;

/**
 * @author: phil
 * @ProjectName: javaXunlian08
 * @Date: 2021/3/26
 * 判断大小写字母和数字有多少个？？？
 */
public class homeWork05 {
    public static void main(String[] args) {
        String str = "ASca12309Z";
        panDuan(str);

    }

    //写一个方法判断个数
    public static void panDuan(String str) {
        char[] chars = str.toCharArray();
        int num = 0;
        int upChar = 0;
        int lowChar = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= '9' && chars[i] >= '0') {
                num++;

            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowChar++;
            } else {
                upChar++;
            }
        }
        System.out.println("数字有："+ num);
        System.out.println("小写字母有："+ lowChar);
        System.out.println("大写字母有："+ upChar);
    }
}
