package clc.com.service;

import clc.com.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chenliancheng on 2018/3/21.
 */

@Component
public class SomeServiceImpl implements SomeService {
    @Override
    public List<Person> getAllPerson() {
        System.out.println("启用备份方案");
        return null;
    }

    @Override
    public String getPort() {
        return "加载失败";
    }
}
