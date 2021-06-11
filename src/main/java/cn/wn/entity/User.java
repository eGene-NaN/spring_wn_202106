package cn.wn.entity;

import lombok.Data;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
@Data
public class User {

    private Integer id;
    private String name;

    public User() {
        System.out.println("创建了一个 User 对象。");
    }
}
