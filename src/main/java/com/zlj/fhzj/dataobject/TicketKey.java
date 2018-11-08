package com.zlj.fhzj.dataobject;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 12:31
 * @description
 */

@Data
public class TicketKey implements Serializable {

    private String dishId;

    private String userId;

    public TicketKey(String dishId, String userId) {
        this.dishId = dishId;
        this.userId = userId;
    }

    public TicketKey() {
    }
}
