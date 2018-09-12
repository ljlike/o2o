package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import com.imooc.o2o.entity.enums.EnableStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * 商品
 */

@Entity
@Data
@ToString
@Table(name = "commodity")
@EqualsAndHashCode(callSuper = true)
public class Commodity extends AbstractEntity{

    @Column
    private String commodityName; //商品名称

    @Column
    private String commodityDesc; //商品描述

    @Column
    private String imgAddress; //商品缩略图地址

    @Column
    private BigDecimal normalPrice; //商品价格

    @Column
    private BigDecimal promotionPrivce; //商品折扣价

    @Column
    private Integer priority; //商品权重

    @Column
    private EnableStatus enableStatus = EnableStatus.usable; //商品状态

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Shop shop;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private CommodityCategory commodityCategory;

    @OneToMany(mappedBy = "commodity",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<CommodityImg> commodityImgList;
}
