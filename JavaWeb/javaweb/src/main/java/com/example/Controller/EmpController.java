package com.example.Controller;

import com.example.Service.EmpService;
import com.example.Service.impl.EmpServiceA;
import com.example.pojo.Emp;
import com.example.pojo.Result;
import com.example.utils.XmlParserUtils;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    @Resource(name = "empServiceB")
    private EmpService empService;
    @RequestMapping("/listEmp")
    public Result list(){
        List<Emp> empList = empService.listEmp();
        return Result.success(empList);
    }
}
