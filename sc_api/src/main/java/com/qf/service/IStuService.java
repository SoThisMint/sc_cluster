package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 11:04
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface IStuService {

    int insert(Student stu);

    List<Student> list();
}
