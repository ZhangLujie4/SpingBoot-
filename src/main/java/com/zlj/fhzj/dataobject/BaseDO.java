package com.zlj.fhzj.dataobject;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 11:35
 * @description
 */

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class BaseDO implements Serializable {

    @CreatedDate
    @Column(name = "create_time")
    protected Date createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    protected Date updateTime;
}
