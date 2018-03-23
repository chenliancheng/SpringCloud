package clc.com.service;

import clc.com.entity.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by chenliancheng on 2018/3/20.
 */

@FeignClient(name = "person",fallback = UIServiceImpl.class)
public interface UIService {

    @RequestMapping(method = RequestMethod.GET,value="/getAllPerson")
    public List<Person> getAllPerson();
}
