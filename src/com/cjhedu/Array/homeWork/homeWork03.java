package com.cjhedu.Array.homeWork;


/**
 * @author: phil
 * @ProjectName: javaXunlian08
 * @Date: 2021/3/26
 * 注册用户名较正！
 */
public class homeWork03 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123454";
        String email = "cjh@163.com";
        userRegister(name, pwd, email);
        System.out.println("注册成功！！！");
    }

    //设置一个方法userRegister
    public static void userRegister(String name, String pwd, String email) {

        //过关
        //第一关，判断数子是不是2~4位
        if (!(name != null && name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("用户名的长度应该为2~4位");
        }

        //第二关，判断密码是否是6位并且是否全部是数字
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("用户密码必须是6位且是纯数字！");
        }


        //第三关，邮箱的 . 必粗在@ 前面
        int i = email.indexOf("@");
        int j = email.indexOf(".");
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱的.必须在@之前");
        }


    }

    public static Boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
