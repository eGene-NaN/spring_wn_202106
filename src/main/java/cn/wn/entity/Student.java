package cn.wn.entity;

import lombok.Data;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
@Data
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private Classes classes;

    public Student() {
        System.out.println("使用无参构造创建对象。");
    }

    public Student(Integer id, String name, Integer age, Classes classes) {
        System.out.println("使用有参构造创建对象。");
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }
}
