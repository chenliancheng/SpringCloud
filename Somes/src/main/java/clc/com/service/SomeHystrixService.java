package clc.com.service;

import clc.com.entity.Person;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenliancheng on 2018/3/20.
 */
@Service
public class SomeHystrixService {
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
@HystrixCommand(fallbackMethod = "fallback")
    public List<Person> getAllPerson(){
        return restTemplate.getForObject("http://person/getAllPerson",List.class);
    }

    public List<Person> fallback(){
        Person p=new Person();
        p.setAddress("断路由机制获取数据");
        List<Person> list=new ArrayList<Person>();
        list.add(p);
        return list;
    }
}
