package com.xingchen.web.web;

import com.xingchen.web.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/web")
public class WebController {
    @RequestMapping(name="/getUser")
    public List<User> getUser() {
        List<User> list = new ArrayList<>();

        User user1=new User();
        user1.setName("小明");
        user1.setAge(12);
        user1.setPass("123456");
        list.add(user1);
        User user2=new User();
        user1.setName("小D");
        user1.setAge(13);
        user1.setPass("123456");
        list.add(user2);
        return list;

    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
            }
        }
    }
}
