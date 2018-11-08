package com.zlj.fhzj.dataobject;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 09:38
 * @description
 */
@Data
@Entity
@Table(name = "dinner_ticket")
@IdClass(TicketKey.class)
public class DinnerTicketDO extends BaseDO{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Id
    private String dishId;

    private String dishName;

    @Id
    private String userId;

    private String userName;
}
