package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import com.imooc.o2o.entity.enums.EnableStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@ToString
@Table(name = "head_line")
@EqualsAndHashCode(callSuper = true)
public class Banner extends AbstractEntity {

    @Column
    private String lineName; //名称

    @Column
    private String lineLink; //头条链接

    @Column
    private String lineImg; //头条图片

    @Column
    private Integer priority; //权重

    @Column
    private EnableStatus enableStatus = EnableStatus.usable; //状态

}
