package clc.com.controller;

import clc.com.entity.Person;
import clc.com.service.SomeHystrixService;
import clc.com.service.SomeService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by chenliancheng on 2018/3/19.
 */
@RestController
public class SomeController {
    @Autowired
    private SomeService someService;
    @Value("${clould}")
    private String index;
   @Value("${server.port}")
    private String cloud;
    @Autowired
    private SomeHystrixService someHystrixService;

    @RequestMapping("/getAllPerson1")
    public List<Person> getAllPerson1(){
        return someService.getAllPerson();
    }

    @RequestMapping("/getAllPerson2")
    public List<Person> getAllPerson2(){
        return someHystrixService.getAllPerson();
    }


    @RequestMapping("/getCloud1")
    public String getCloud1(){
        return someService.getPort();
    }
    @RequestMapping("/getCloud2")
    public String getCloud2(){
        return index;
    }

}
