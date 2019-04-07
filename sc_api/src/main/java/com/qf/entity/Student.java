package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 10:59
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_stu")
public class Student implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    @TableField(value = "class_id")
    private Integer classId;
    @TableField(exist = false)
    private String className;
}
