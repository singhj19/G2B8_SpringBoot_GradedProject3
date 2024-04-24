package com.g2b8.tta.g2b8_bed_gradedproject3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ticket_title")
    private String ticketTitle;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "content")
    private String content;

    @Column(name = "created_on")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdOn;
}
