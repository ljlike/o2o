package com.imooc.o2o.entity.bean;


import com.imooc.o2o.entity.AbstractEntity;
import com.imooc.o2o.entity.enums.EnableStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name = "shop")
@EqualsAndHashCode(callSuper = true)
public class Shop extends AbstractEntity {

    @Column
    private String shopName; //店铺名称

    @Column
    private String shopDesc; //店铺描述

    @Column
    private Integer priority; //店铺权重

    @Column
    private String shopAddress; //地址

    @Column
    private String shopImg; //图片

    @Column
    private String phone; //电话

    @Column
    private EnableStatus enableStatus; //店铺状态

    @Column
    private String advice; //店铺建议

    @OneToOne(cascade= CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PersonInfo personInfo;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Area area;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private ShopCategory shopCategory;




}