package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

/**
 * 商品分类
 */

@Entity
@Data
@ToString
@Table(name = "commodity_category")
@EqualsAndHashCode(callSuper = true)
public class CommodityCategory extends AbstractEntity{

    @Column
    private Integer priority; //权重

    @Column
    private String commodityCategoryName; //商品分类名称

    @OneToOne(cascade= CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Shop shop;

}