package com.example.Dao.impl;

import com.example.Dao.EmpDao;
import com.example.pojo.Emp;
import com.example.utils.XmlParserUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//将当前类交给IOC容器管理,成为IOC容器中的bean
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file=this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
