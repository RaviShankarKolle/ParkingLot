package com.nt.models;

import java.time.LocalDateTime;

import com.nt.enums.TIcketStatus;

public class Ticket extends BaseModel {
	
	private LocalDateTime entryTime;
	private Vehicle vehicle;
	private ParkingSlot parkingSlot;
	private Gate gate;
	private TIcketStatus ticketStatus;
	public LocalDateTime getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(LocalDateTime entryTime) {
		this.entryTime = entryTime;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public ParkingSlot getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(ParkingSlot parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
	public Gate getGate() {
		return gate;
	}
	public void setGate(Gate gate) {
		this.gate = gate;
	}
	public TIcketStatus getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(TIcketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	 

}
