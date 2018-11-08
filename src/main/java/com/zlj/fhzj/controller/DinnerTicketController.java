package com.zlj.fhzj.controller;

import com.zlj.fhzj.manager.DinnerTicketManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tori
 * @version V1.0.0
 * @date 2018-09-21 12:49
 * @description
 */

@RestController
public class DinnerTicketController {

    @Autowired
    private DinnerTicketManager dinnerTicketManager;

    @GetMapping("/save")
    public String save() {
        dinnerTicketManager.createDinnerTicket();
        return "success";
    }
}
