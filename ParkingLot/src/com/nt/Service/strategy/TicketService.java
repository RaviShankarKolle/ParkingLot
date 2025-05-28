package com.nt.Service.strategy;

import java.time.LocalDateTime;

import com.nt.Exceptions.GateNotFoundException;
import com.nt.Exceptions.NoParkingSlotAvailableException;
import com.nt.Exceptions.ParkingLotNotFoundException;
import com.nt.models.Ticket;
import com.nt.models.Vehicle;

public interface TicketService {
	
    Ticket createTicket(Vehicle vehicle, int gateId, int parkingLotId, LocalDateTime entryTime) throws ParkingLotNotFoundException, GateNotFoundException, NoParkingSlotAvailableException;
}


