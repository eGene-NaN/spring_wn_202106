package cn.wn.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author eGene
 * @date 2021/06/11
 * @description
 */
@Data
@Component(value = "ds")
public class DataSource {

    @Value("root")
    private String user;
    @Value("wn")
    private String password;
    @Value("jdbc:mysql://localhost:3306/library")
    private String url;
    @Value("com.mysql.cj.jdbc.Driver")
    private String driverName;
}
