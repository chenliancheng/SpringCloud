package clc.com.service;

import clc.com.entity.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by chenliancheng on 2018/3/19.
 */
@FeignClient(name = "person",fallback =SomeServiceImpl.class )
public interface SomeService {
    @RequestMapping(method = RequestMethod.GET,value="/getAllPerson")
    public List<Person> getAllPerson();

    @RequestMapping(method = RequestMethod.GET,value="/getCloud")
    public String getPort();
}
