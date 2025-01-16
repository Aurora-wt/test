package com.example.Service.impl;

import com.example.Dao.EmpDao;
import com.example.Dao.impl.EmpDaoA;
import com.example.Service.EmpService;
import com.example.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceA implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            }else {
                emp.setGender("女");
            }
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            }else {
                emp.setJob("就业指导");
            }
        });
        return empList;
    }
}
