package com.g2b8.tta.g2b8_bed_gradedproject3.service;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> list();

    public void save(Ticket ticket);
    public Ticket getById(long ticketId);
    public void deleteById(long ticketId);
}
