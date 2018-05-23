package com.izxjf.liao.disklrucachedemo;

import java.io.Serializable;

/**
 * 创建日期:2018/5/23 on 22:33
 * 作   者:张辽
 * 邮   箱:Zl13484407109@sina.com
 * 描   述:
 */

public class UserBean implements Serializable {
    String Name;
    int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserBean(String name, int age) {
        Name = name;
        this.age = age;
    }


}

