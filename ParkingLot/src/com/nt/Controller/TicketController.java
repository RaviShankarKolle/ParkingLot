package com.nt.Controller;


import java.time.LocalDateTime;

import com.nt.Exceptions.GateNotFoundException;
import com.nt.Exceptions.ParkingLotNotFoundException;
import com.nt.models.Ticket;
import com.nt.models.Vehicle;
import com.nt.repo.GateRepository;
import com.nt.repo.ParkingLotRepository;
import com.nt.repo.TicketRepository;

import parkingLot.dto.TicketRequestDTO;
import parkingLot.dto.TicketResponseDTO;
import parkingLot.exception.NoEmptyParkingSlotAvailableException;
import parkingLot.service.TicketService;
import parkingLot.service.TicketServiceImpl;

public class TicketController {
    private TicketService ticketService;

    public TicketController(ParkingLotRepository parkingLotRepository, GateRepository gateRepository, TicketRepository ticketRepository) {
        this.ticketService = new TicketServiceImpl(parkingLotRepository, gateRepository, ticketRepository);
    }

    public TicketResponseDTO createTicket(TicketRequestDTO ticketRequestDTO) throws NoEmptyParkingSlotAvailableException, ParkingLotNotFoundException, GateNotFoundException {
        Vehicle vehicle = new Vehicle(ticketRequestDTO.getNumber(), ticketRequestDTO.getName(), ticketRequestDTO.getColor(), ticketRequestDTO.getVehicleType());
        Ticket ticket = ticketService.createTicket(vehicle, ticketRequestDTO.getGateId(), ticketRequestDTO.getParkingLotId(), LocalDateTime.now());

        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        ticketResponseDTO.setEntryTime(ticket.getEntryTime().toString());
        ticketResponseDTO.setSlotNumber(ticket.getParkingSlot().getNumber());
        ticketResponseDTO.setVehicleNumber(ticket.getVehicle().getNumber());
        return ticketResponseDTO;
    }
}
