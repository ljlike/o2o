package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name = "commodity_img")
@EqualsAndHashCode(callSuper = true)
public class CommodityImg extends AbstractEntity{

    @Column
    private String imgAddress; //图片地址

    @Column
    private Integer Priority; //权重

    @Column
    private String imgDesc; //描述

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @PrimaryKeyJoinColumn
    private Commodity commodity;

}