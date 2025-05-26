package com.nt.repo;

import java.util.HashMap;

import com.nt.Exceptions.TicketNotFoundException;
import com.nt.models.Ticket;

public class TicketRepository {
	
	private HashMap<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int ticketId) throws TicketNotFoundException {
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for Id : " + ticketId);
        }
        return ticket;
    }

    public Ticket put(Ticket ticket){
        ticketMap.put(ticket.getId(), ticket);
        return ticket;
    }

}
