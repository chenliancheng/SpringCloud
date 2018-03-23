package clc.com.controller;

import clc.com.entity.Person;
import clc.com.service.UIHystrixService;
import clc.com.service.UIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenliancheng on 2018/3/20.
 */

@RestController
public class UIController {

    @Autowired
    private UIHystrixService uiHystrixService;

    @RequestMapping("/getPerson")
    public List<Person> getAllPerson(){
        return uiHystrixService.getAllPerson();
    }
}
