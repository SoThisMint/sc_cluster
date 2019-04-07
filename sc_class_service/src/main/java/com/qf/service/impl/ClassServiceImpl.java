package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Class;
import com.qf.dao.ClassMapper;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 18:57
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class ClassServiceImpl implements IClassService {

    @Autowired
    private ClassMapper classMapper;

    @Override
    public int insert(Class c) {
        return classMapper.insert(c);
    }

    @Override
    public List<Class> list() {
        return classMapper.selectList(null);
    }
}
