package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ：Tony
 * @date ：Created in 2019/4/6 11:02
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_class")
public class Class implements Serializable {

    private Integer id;
    @TableField(value = "class_name")
    private String className;
}
