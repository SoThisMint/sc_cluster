package com.qf.service;

import com.qf.entity.Class;

import java.util.List;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 11:05
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface IClassService {

    int insert(Class c);

    List<Class> list();
}
