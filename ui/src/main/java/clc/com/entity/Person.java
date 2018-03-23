package clc.com.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by chenliancheng on 2018/3/19.
 */

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Person {
    private Integer id;
    private String name;
    private Character sex;
    private Short age;
    private String address;
}
