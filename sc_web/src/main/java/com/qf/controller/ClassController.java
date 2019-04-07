package com.qf.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Class;
import com.qf.service.IClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 11:13
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Controller
@RequestMapping("/class")
public class ClassController {

    @Reference
    private IClassService classService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Class> list = classService.list();
        model.addAttribute("classList", list);
        return "ClassList";
    }

    @RequestMapping("/insert")
    public String insert(Class c) {
        classService.insert(c);
        return "redirect:list";
    }
}
