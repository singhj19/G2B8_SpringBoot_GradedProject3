package com.g2b8.tta.g2b8_bed_gradedproject3.repository;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
