package com.wjk.dockerdemo;

import com.wjk.dockerdemo.entity.Student;
import com.wjk.dockerdemo.service.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jikangwang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudent {

    @Autowired
    StudentServiceImpl studentService;

    @Test
    public void findStudent(){
        Student student=studentService.findStudentById(1L);
        System.out.println(student);
    }
}
