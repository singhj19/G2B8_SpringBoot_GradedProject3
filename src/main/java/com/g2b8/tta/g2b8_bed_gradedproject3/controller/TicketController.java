package com.g2b8.tta.g2b8_bed_gradedproject3.controller;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
import com.g2b8.tta.g2b8_bed_gradedproject3.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @RequestMapping("/list")
    public String listAllTickets(Model model) {

        List<Ticket> tickets = ticketService.list();
        model.addAttribute("tickets", tickets);

        return "list-tickets";
    }

    @PostMapping("/save")
    public String saveEmployee(
            @ModelAttribute("ticket") Ticket ticket) {

        // save the employee
        ticketService.save(ticket);

        // use a redirect to prevent duplicate submissions
        return "redirect:/ticket/list";
    }

    @RequestMapping("/showTicketForm_Save")
    public String saveEmployee_Step1(Model theModel) {

        // create model attribute to bind form data
        Ticket ticket = new Ticket();

        theModel.addAttribute("ticket", ticket);

        return "ticket-form";
    }

    @PostMapping("/view")
    public String viewTicket(
            @RequestParam("ticketId") long ticketId, Model theModel) {

        Ticket ticket = ticketService.getById(ticketId);

        theModel.addAttribute("ticket", ticket);

        // send over to our form
        return "view-ticket-form";
    }

    @PostMapping("/delete")
    public String deleteTicket(
            @RequestParam("ticketId") long ticketId, Model theModel) {

        ticketService.deleteById(ticketId);
        return "redirect:/ticket/list";

    }

    @PostMapping("/edit")
    public String editTicket(
            @RequestParam("ticketId") long ticketId, Model theModel) {

        Ticket ticket = ticketService.getById(ticketId);


        theModel.addAttribute("ticket", ticket);

        // send over to our form
        return "update-ticket-form";
    }
}
