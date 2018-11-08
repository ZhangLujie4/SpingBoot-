package com.zlj.fhzj.dao;

import com.zlj.fhzj.dataobject.DinnerTicketDO;
import com.zlj.fhzj.dataobject.TicketKey;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 12:34
 * @description
 */

public interface DinnerTicketJpaDAO extends JpaRepository<DinnerTicketDO, TicketKey> {


    DinnerTicketDO findByUserIdAndDishId(String userId, String dishId);
}
