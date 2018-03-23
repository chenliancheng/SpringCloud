package clc.com.controller;

import clc.com.entity.Person;
import clc.com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenliancheng on 2018/3/19.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @Value("${server.port}")
    private String cloud;
    @RequestMapping("/getAllPerson")
public List<Person> getAllPerson(){
   return personService.getAllPerson();
}
    @RequestMapping("/getCloud")
    public String getCloud(){
        return cloud;
    }
}
