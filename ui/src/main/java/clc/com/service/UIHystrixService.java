package clc.com.service;

import clc.com.entity.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenliancheng on 2018/3/20.
 */

@Service
public class UIHystrixService {
    @Autowired
    private UIService uiService;

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public List<Person> getAllPerson(){
        return uiService.getAllPerson();
    }

    public List<Person>fallbackMethod(){
        Person p=new Person();
        p.setAddress("短路有机制获取数据");
        List<Person> list=new ArrayList<Person>();
        list.add(p);
        return list;
    }
}
