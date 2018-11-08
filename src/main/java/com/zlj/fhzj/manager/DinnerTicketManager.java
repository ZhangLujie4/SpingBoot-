package com.zlj.fhzj.manager;

import com.zlj.fhzj.dao.DinnerTicketJpaDAO;
import com.zlj.fhzj.dataobject.DinnerTicketDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 12:48
 * @description
 */

@Service
@Slf4j
public class DinnerTicketManager {

    @Autowired
    private DinnerTicketJpaDAO dinnerTicketJpaDAO;

    @Transactional
    public void createDinnerTicket() {
        DinnerTicketDO dinnerTicketDO = new DinnerTicketDO();
        dinnerTicketDO.setDishId("D0000000003");
        dinnerTicketDO.setUserId("U0000000021");
        dinnerTicketDO.setUserName("USERNAME");
        dinnerTicketDO.setDishName("DISHNAME");
        DinnerTicketDO dinnerTicketDO1 = dinnerTicketJpaDAO.save(dinnerTicketDO);
        log.info("dinnerTicket = {}", dinnerTicketDO1);
    }
}
