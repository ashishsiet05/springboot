package org.mysql.demo;

import org.mysql.demo.Ticket;
import org.mysql.demo.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public  class TicketController {

    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTickets")
    public String bookTicket(@RequestBody List<Ticket> tickets) {
        dao.saveAll(tickets);
        return "ticket booked : " + tickets.size();
    }

    @GetMapping("/getTickets")
    public List<Ticket> getTickets() {

        return (List<Ticket>) dao.findAll();
    }

}

