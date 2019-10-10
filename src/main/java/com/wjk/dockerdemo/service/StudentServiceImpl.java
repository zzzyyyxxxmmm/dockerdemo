package com.wjk.dockerdemo.service;

import com.wjk.dockerdemo.dao.StudentDao;
import com.wjk.dockerdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jikangwang
 */
@Service
public class StudentServiceImpl {

    @Autowired
    StudentDao studentDao;
    public Student findStudentById(Long id){
        return studentDao.findStudentById(id);
    }
}
