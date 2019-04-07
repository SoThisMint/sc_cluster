package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/7 20:58
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IStuService stuService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = stuService.list();
        model.addAttribute("list",list);
        return "stuList";
    }

    @RequestMapping("/insert")
    public String insert(Student stu){
        stuService.insert(stu);
        return "redirect:list";
    }
}
