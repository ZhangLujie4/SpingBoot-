package com.zlj.fhzj.dao;

import com.zlj.fhzj.FhzjApplicationTests;
import com.zlj.fhzj.dataobject.DinnerTicketDO;
import com.zlj.fhzj.dataobject.TicketKey;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 12:35
 * @description
 */
@Component
@Slf4j
public class DinnerTicketJpaDAOTest extends FhzjApplicationTests {

    @Autowired
    private DinnerTicketJpaDAO dinnerTicketJpaDAO;

    @Test
    @Transactional
    public void save() {
        DinnerTicketDO dinnerTicketDO = new DinnerTicketDO();
        dinnerTicketDO.setDishId("D0000000001");
        dinnerTicketDO.setUserId("U0000000036");
        dinnerTicketDO.setUserName("USERNAME");
        dinnerTicketDO.setDishName("DISHNAME");
        dinnerTicketJpaDAO.save(dinnerTicketDO);
        //dinnerTicketDO.setTicketId("T"+String.format("%010d",dinnerTicketDO.getId()));
    }

    @Test
    public void findOne() {
        Optional<DinnerTicketDO> ticketDO = dinnerTicketJpaDAO.findById(new TicketKey("D0000000001", "U0000000001"));
        if (!ticketDO.isPresent()) {
            log.info("ticket is null");
        }
        DinnerTicketDO dinnerTicketDO = ticketDO.get();
        log.info("ticketDO = {}", dinnerTicketDO);
    }

    @Test
    public void findOne2() {
        DinnerTicketDO dinnerTicketDO = dinnerTicketJpaDAO.findByUserIdAndDishId("U0000000001", "D0000000001");
        log.info("dinnerTicketDO = {}", dinnerTicketDO);
    }
}