package com.nt.Service.strategy;

import java.time.LocalDateTime;

import com.nt.Exceptions.GateNotFoundException;
import com.nt.Exceptions.NoParkingSlotAvailableException;
import com.nt.Exceptions.ParkingLotNotFoundException;
import com.nt.models.Gate;
import com.nt.models.ParkingLot;
import com.nt.models.ParkingSlot;
import com.nt.models.Ticket;
import com.nt.models.Vehicle;
import com.nt.repo.GateRepository;
import com.nt.repo.ParkingLotRepository;
import com.nt.repo.TicketRepository;

public class TicketServiceImpl implements TicketService {

	 private ParkingLotRepository parkingLotRepository;
	    private GateRepository gateRepository;
	    private TicketRepository ticketRepository;

	    public TicketServiceImpl(ParkingLotRepository parkingLotRepository, GateRepository gateRepository, TicketRepository ticketRepository) {
	        this.parkingLotRepository = parkingLotRepository;
	        this.gateRepository = gateRepository;
	        this.ticketRepository = ticketRepository;
	    }

	    @Override
	    public Ticket createTicket(Vehicle vehicle, int gateId, int parkingLotId, LocalDateTime entryTime) throws ParkingLotNotFoundException, GateNotFoundException, NoParkingSlotAvailableException {
	        ParkingLot parkingLot = parkingLotRepository.get(parkingLotId);
	        Gate gate = gateRepository.get(gateId);
	        ParkingSlot assignedParkingSlot = parkingLot.getSlotAllocationStrategy().findParkingSlot(vehicle.getVehicleType(), parkingLot, gate);
	        Ticket ticket = new Ticket();
	        ticket.setEntryTime(entryTime);
	        ticket.setVehicle(vehicle);
	        ticket.setParkingSlot(assignedParkingSlot);
	        return ticketRepository.put(ticket);
	    }

}
