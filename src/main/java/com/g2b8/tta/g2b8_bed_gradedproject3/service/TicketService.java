package com.g2b8.tta.g2b8_bed_gradedproject3.service;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> list();

    void save(Ticket ticket);

    Ticket getById(long ticketId);

    void deleteById(long ticketId);

    List<Ticket> searchByCreatedOnEmpty(String contentORdescription);
}
