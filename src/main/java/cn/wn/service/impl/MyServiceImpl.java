package cn.wn.service.impl;

import cn.wn.repository.MyRepository;
import cn.wn.service.MyService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author eGene
 * @date 2021/06/22
 * @description
 */
//@Component
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private MyRepository myRepository;

    @Override
    public String doService(Double score) {
        return myRepository.doRepository(score);
    }
}
