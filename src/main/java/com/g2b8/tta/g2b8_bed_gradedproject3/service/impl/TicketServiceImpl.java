package com.g2b8.tta.g2b8_bed_gradedproject3.service.impl;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepository;
import com.g2b8.tta.g2b8_bed_gradedproject3.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;
    @Override
    public List<Ticket> list() {
        return ticketRepository.findAll();
    }

    @Override
    public void save(Ticket ticket) {
        ticket.setCreatedOn(LocalDate.now());
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
}
