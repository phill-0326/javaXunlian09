package com.cjhedu.Array.homeWork;

/**
 * @author: phil
 * @ProjectName: javaXunlian08
 * @Date: 2021/3/26
 * 数组方法的简单应用
 */
public class homeWork {
    public static void main(String[] args) {
        String str = "Chi jian Hua";
        printName(str);
    }
    public static void printName(String str){

        if (str == null){
            System.out.println("str不能为空");
        }

        String [] names = str.split(" ");
        if (names.length != 3){
            System.out.println("输入的数组有误！！！！");
            return;
        }

        String format = String.format("%s,%s .%c ", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
