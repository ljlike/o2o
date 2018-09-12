package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import com.imooc.o2o.entity.enums.EnableStatus;
import com.imooc.o2o.entity.enums.GenderType;
import com.imooc.o2o.entity.enums.UserType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name="person_info")
@EqualsAndHashCode(callSuper = true)
public class PersonInfo extends AbstractEntity {

    @Column
    private String nickName; //昵称

    @Column
    private String profileImg; //头像

    @Column
    private String email; //邮箱

    @Column
    @Enumerated(EnumType.ORDINAL)
    private GenderType gender; //性别

    @Column
    @Enumerated(EnumType.ORDINAL)
    private EnableStatus enableStatus = EnableStatus.usable; //账户的状态

    @Column
    @Enumerated(EnumType.ORDINAL)
    private UserType userType; //身份标识

    @OneToOne(mappedBy="personInfo")
    private LocalAuth localAuth;

}
