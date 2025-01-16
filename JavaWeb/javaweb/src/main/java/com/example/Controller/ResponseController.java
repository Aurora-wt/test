package com.example.Controller;

import com.example.pojo.Address;
import com.example.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("hello world");
        //return new Result(1,"success","hello world");
        return Result.success("hello world");
    }

    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address address = new Address();
        address.setCity("深圳");
        address.setProvince("广东");
        return Result.success(address);
    }

    @RequestMapping("/listAddr")
    public Result listAddr() {
        ArrayList<Address> list = new ArrayList<>();
        list.add(new Address("广东", "深圳"));
        list.add(new Address("陕西", "西安"));
        return Result.success(list);
    }
}
