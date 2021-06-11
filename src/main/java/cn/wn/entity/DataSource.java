package cn.wn.entity;

import lombok.Data;

/**
 * @author eGene
 * @date 2021/06/11
 * @description
 */
@Data
public class DataSource {

    private String user;
    private String password;
    private String url;
    private String driverName;
}
