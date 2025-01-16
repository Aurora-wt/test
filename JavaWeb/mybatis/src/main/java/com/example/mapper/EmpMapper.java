package com.example.mapper;

import com.example.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Mapper
public interface EmpMapper {
    @Delete("delete from emp where id=#{id}")
    public void delete(Integer id);

    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender}," +
            "#{image},#{job},#{entrydate},#{deptID},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    public void update(Emp emp);//动态更新

    @Select("select * from emp where id=#{id}")
    public Emp getByID(Integer id);

//    @Select("select * from emp where name like concat('%',#{name},'%') and gender=#{gender} and " +
//            "entrydate between #{begin} and #{end} order by update_time desc")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

    public void deleteByIDs(List<Integer> IDs);//批量删除
}
