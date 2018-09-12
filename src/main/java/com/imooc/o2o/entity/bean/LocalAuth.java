package com.imooc.o2o.entity.bean;

import com.imooc.o2o.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Data
@ToString
@Table(name = "local_auth")
@EqualsAndHashCode(callSuper = true)
public class LocalAuth extends AbstractEntity {

    @Column
    private String username;

    @Column
    private String password;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PersonInfo personInfo;
}
