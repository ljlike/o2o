package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@ToString
@Table(name = "area")
@EqualsAndHashCode(callSuper = true)
public class Area extends AbstractEntity {

    @Column
    private String areaName; //区域名称

    @Column
    private Integer priority; //权重

}
