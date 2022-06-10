package com.zhangqi.Controller;

import com.zhangqi.bean.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class FirstController {


    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Person findPerson(){
        Person person  = new Person();
//        person.setId(personId);
        person.setName("张三");
        return person;
    }
}
