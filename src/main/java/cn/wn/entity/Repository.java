package cn.wn.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author eGene
 * @date 2021/06/21
 * @description
 */
@Data
@Component(value = "myrepo")
public class Repository {

    @Autowired
    @Qualifier(value = "ds")
    private DataSource dataSource;
}
