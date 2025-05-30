package com.nt.models;

import java.util.List;

import com.nt.enums.ParkingFloorStatus;

public class ParkingFloor extends BaseModel{
	
	private int floorNumber;
	private List<ParkingSlot> parkingSlots;
	private List<Gate> gates;
	private ParkingFloorStatus parkingFloorStatus;
	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public List<ParkingSlot> getParkingSlots() {
		return parkingSlots;
	}
	public void setParkingSlots(List<ParkingSlot> parkingSlots) {
		this.parkingSlots = parkingSlots;
	}
	public List<Gate> getGates() {
		return gates;
	}
	public void setGates(List<Gate> gates) {
		this.gates = gates;
	}
	public ParkingFloorStatus getParkingFloorStatus() {
		return parkingFloorStatus;
	}
	public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
		this.parkingFloorStatus = parkingFloorStatus;
	}
	
	
	

}
