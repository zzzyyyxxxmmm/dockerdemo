package com.wjk.dockerdemo.controller;

import com.wjk.dockerdemo.entity.Student;
import com.wjk.dockerdemo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author jikangwang
 */
@Controller
public class IndexController {

    @Autowired
    StudentServiceImpl studentService;

    @GetMapping("/")
    public String index(Model model){
        Student student=studentService.findStudentById(1L);
        model.addAttribute("stu",student);
        return "index";
    }
}
