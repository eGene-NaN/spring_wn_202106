package cn.wn.repository.impl;

import cn.wn.repository.MyRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author eGene
 * @date 2021/06/22
 * @description
 */
//@Component
@Repository
public class MyRepositoryImpl implements MyRepository {

    @Override
    public String doRepository(Double score) {
        String result = "";
        if (score < 60) {
            result = "不及格";
        } else {
            result = "及格";
        }
        return result;
    }
}
