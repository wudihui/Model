package com.fanchen.test;


import com.fanchen.mapper.TeacherMapper;
import com.fanchen.pojo.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    private TeacherMapper teacherMapper;


    @Test
    public void testList() {
        Teacher cs=teacherMapper.get(1);
        if (cs!=null){
            System.out.println(cs.getName());
        }
    }

}
