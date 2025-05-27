package com.nt.models;

import com.nt.enums.ParkingSlotStatus;
import com.nt.enums.VehicleType;

public class ParkingSlot extends BaseModel {
	
	private int number;
	private VehicleType supportedVehicleType;
	private Vehicle vehicle;
	private ParkingSlotStatus parkingSlotStatus;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public VehicleType getSupportedVehicleType() {
		return supportedVehicleType;
	}
	public void setSupportedVehicleType(VehicleType supportedVehicleType) {
		this.supportedVehicleType = supportedVehicleType;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public ParkingSlotStatus getParkingSlotStatus() {
		return parkingSlotStatus;
	}
	public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
		this.parkingSlotStatus = parkingSlotStatus;
	}
	public ParkingSlot(int number, VehicleType supportedVehicleType, Vehicle vehicle,
			ParkingSlotStatus parkingSlotStatus) {
		super();
		this.number = number;
		this.supportedVehicleType = supportedVehicleType;
		this.vehicle = vehicle;
		this.parkingSlotStatus = parkingSlotStatus;
	}
	public ParkingSlot() {
		super();
		// TODO Auto-generated constructor stub
	}
	 public ParkingSlot(int id, int number, VehicleType supportedVehicleType) {
	        super(id);
	        this.number = number;
	        this.supportedVehicleType = supportedVehicleType;
	        this.parkingSlotStatus = ParkingSlotStatus.AVAILABLE;
	    }
	
	
	

}
