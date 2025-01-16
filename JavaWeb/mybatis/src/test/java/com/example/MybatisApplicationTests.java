package com.example;

import com.example.mapper.EmpMapper;
import com.example.mapper.UserMapper;
import com.example.pojo.Emp;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private EmpMapper empMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void testDelete(){
        empMapper.delete(20);
    }
    @Test
    public void testInsert(){
        Emp emp=new Emp();
        emp.setUsername("Tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }
    @Test
    public void testUpdate(){
        Emp emp=new Emp();
        emp.setId(21);
        emp.setUsername("Tom");
        emp.setName("汤姆1");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2000,1,1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptID(1);
        empMapper.update(emp);
    }
    @Test
    public void testGetByID(){
        Emp emp=empMapper.getByID(17);
        System.out.println(emp);
    }
    @Test
    public void testList(){
//        List<Emp> empList=empMapper.list("张",(short) 1,LocalDate.of(2010,1,1),LocalDate.of(2020,1,1));
        List<Emp> empList=empMapper.list(null,null,null,null);
        System.out.println(empList);
    }
    @Test
    public void testDeleteByIDs(){
        List<Integer> IDs= Arrays.asList(13,14,15);
        empMapper.deleteByIDs(IDs);
    }
}
