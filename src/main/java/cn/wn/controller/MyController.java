package cn.wn.controller;

import cn.wn.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author eGene
 * @date 2021/06/22
 * @description
 */
//@Component
@Controller
public class MyController {

    @Autowired
    private MyService myService;

    public String service(Double score) {
        return myService.doService(score);
    }
}
