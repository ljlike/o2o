package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name = "wechat_auth")
@EqualsAndHashCode(callSuper = true)
public class WechatAuth extends AbstractEntity {

    @Column(unique = true)
    private String openId;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PersonInfo personInfo;

}
