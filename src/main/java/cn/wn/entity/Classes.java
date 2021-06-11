package cn.wn.entity;

import lombok.Data;

import java.util.List;

/**
 * @author eGene
 * @date 2021/06/10
 * @description
 */
@Data
public class Classes {

    private Integer id;
    private String name;
    private List<Student> studentList;
}
