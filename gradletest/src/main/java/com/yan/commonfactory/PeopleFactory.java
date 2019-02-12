package com.yan.commonfactory;

import com.yan.vo.PeopleVO;
import java.io.Serializable;

/**
 * @author: QXY
 * @classDescribe:
 * @createTime: 2019/2/11
 * @version: 1.0
 */
public class PeopleFactory implements Serializable {

    private String yandaye;

    public String getYandaye() {
        return yandaye;
    }

    public void setYandaye(String yandaye) {
        this.yandaye = yandaye;
    }

    public PeopleVO createPeople() {
        PeopleVO peopleVO = new PeopleVO();
        peopleVO.setName("factory people");
        peopleVO.setAge(99);
        return peopleVO;
    }
}
