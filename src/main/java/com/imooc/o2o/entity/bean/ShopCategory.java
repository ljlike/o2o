package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * 店铺类别
 */

@Entity
@Data
@ToString
@Table(name = "shop_category")
@EqualsAndHashCode(callSuper = true)
public class ShopCategory extends AbstractEntity{

    @Column
    private String shopCategoryName; //店铺名称

    @Column
    private String shopCategoryDesc; //店铺描述

    @Column
    private String shopCategorImg; //店铺图片

    @Column
    private Integer priority; //店铺权重

    @Column
    private Long parentId; //店铺父类ID

}
