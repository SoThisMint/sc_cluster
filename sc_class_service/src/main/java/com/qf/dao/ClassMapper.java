package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Class;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 18:58
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface ClassMapper extends BaseMapper<Class> {

    @Select("select class_name from t_class where id=#{id}")
    String getClassNameById(Integer classId);
}
