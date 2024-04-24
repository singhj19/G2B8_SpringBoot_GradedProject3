package com.g2b8.tta.g2b8_bed_gradedproject3.service.impl;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepoClass;
import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepository;
import com.g2b8.tta.g2b8_bed_gradedproject3.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    TicketRepoClass ticketRepoClass;

    @Override
    public List<Ticket> list() {
        return ticketRepository.findAll();
    }

    @Override
    public void save(Ticket ticket) {

        LocalDate currentDate = LocalDate.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);

        ticket.setCreatedOn(sqlDate);
        ticketRepository.save(ticket);
    }

    @Override
    public Ticket getById(long ticketId) {
        return ticketRepository.findById(ticketId).get();
    }

    @Override
    public void deleteById(long ticketId) {
        ticketRepository.deleteById(ticketId);
    }

    public List<Ticket> searchByCreatedOnEmpty(String contentORdescription) {
        List<Ticket> tickets = ticketRepoClass.findByTitleOrDescription(contentORdescription);
        return tickets;
    }
}
