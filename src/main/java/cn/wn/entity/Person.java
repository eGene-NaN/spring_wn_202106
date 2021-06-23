package cn.wn.entity;

import lombok.Data;

/**
 * @author eGene
 * @date 2021/06/21
 * @description
 */
@Data
public class Person {

    private Integer id;
    private String name;
    private Car car;
}
