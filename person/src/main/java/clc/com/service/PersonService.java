package clc.com.service;

import clc.com.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenliancheng on 2018/3/19.
 */
@Service
public class PersonService {

    public List<Person>getAllPerson(){
        List<Person>list=new ArrayList<Person>();
        Person person1=new Person(1,"张三",'男',(short)18,"河南");
        Person person2=new Person(2,"李二",'女',(short)19,"北京");
        Person person3=new Person(3,"王五",'男',(short)20,"上海");
        Person person4=new Person(4,"小六",'女',(short)8,"广州");
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        return list;
    }
}
