package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassMapper;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/7 20:06
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;
    @Autowired
    private ClassMapper classMapper;

    @Override
    public int insert(Student stu) {
        return stuMapper.insert(stu);
    }

    @Override
    public List<Student> list() {
        List<Student> list = stuMapper.selectList(null);
        for (int i = 0; i < list.size(); i++) {
            String className = classMapper.getClassNameById(list.get(i).getClassId());
            list.get(i).setClassName(className);
        }
        return list;
    }
}
