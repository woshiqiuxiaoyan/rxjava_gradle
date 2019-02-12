package com.yan.vo;

import java.io.Serializable;
import lombok.Data;
import lombok.ToString;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/11
 * @version: 1.0
 */
@Data
@ToString
public class PeopleVO implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
