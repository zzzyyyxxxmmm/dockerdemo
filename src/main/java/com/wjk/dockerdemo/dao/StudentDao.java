package com.wjk.dockerdemo.dao;

import com.wjk.dockerdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jikangwang
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
    Student findStudentById(Long id);
}
