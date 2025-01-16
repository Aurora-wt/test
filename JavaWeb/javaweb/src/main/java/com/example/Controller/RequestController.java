package com.example.Controller;

import com.example.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RequestController {
//    @RequestMapping("/hello")
//    public String hello() {
//        System.out.println("hello world");
//        return "hello world";
//    }

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam String username, int age) {
        System.out.println(username + ":" + age);
        return "OK";
    }
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }
    @RequestMapping("/ListParam")
    public String ListParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "OK";
    }
    @RequestMapping("/DataParam")
    public String DataParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "OK";
    }
    @RequestMapping("/JsonParam")
    public String JsonParam(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable int id) {
        System.out.println(id);
        return "OK";
    }
}
