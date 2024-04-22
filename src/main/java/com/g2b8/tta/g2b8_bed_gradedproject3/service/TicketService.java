package com.g2b8.tta.g2b8_bed_gradedproject3.service;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TicketService {
    List<Ticket> list();

    public void save(Ticket ticket);
    public void deleteById(int ticketId);
    public void editById(int ticketId);
}
