package cn.wn.entity;

import lombok.Data;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
@Data
public class Account {

    private Integer id;
    private String name;

    public Account() {
        System.out.println("创建了一个 Account 对象。");
    }
}
