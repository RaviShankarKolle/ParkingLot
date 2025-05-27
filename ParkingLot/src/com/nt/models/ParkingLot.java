package com.nt.models;

import java.util.List;

import com.nt.Service.strategy.billCalculationStrategy.BillCalculationStrategy;
import com.nt.Service.strategy.slotAllocationStrategy.SlotAllocationStrategy;
import com.nt.enums.ParkingLotStatus;
import com.nt.enums.VehicleType;

public class ParkingLot extends BaseModel {
	
	private String name;
	private String address;
	private List<ParkingFloor> parkingFloors;
	private ParkingLotStatus parkingLotStatus;
	private List<VehicleType> supportedVehicleType;
	private SlotAllocationStrategy slotAllocationStrategy;
	private BillCalculationStrategy billCalculationStrategy;
	
	
	public ParkingLot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	public ParkingLot(String name, String address, List<ParkingFloor> parkingFloors, ParkingLotStatus parkingLotStatus,
			List<VehicleType> supportedVehicleType, SlotAllocationStrategy slotAllocationStrategy,
			BillCalculationStrategy billCalculationStrategy) {
		super();
		this.name = name;
		this.address = address;
		this.parkingFloors = parkingFloors;
		this.parkingLotStatus = parkingLotStatus;
		this.supportedVehicleType = supportedVehicleType;
		this.slotAllocationStrategy = slotAllocationStrategy;
		this.billCalculationStrategy = billCalculationStrategy;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}
	public void setParkingFloors(List<ParkingFloor> parkingFloors) {
		this.parkingFloors = parkingFloors;
	}
	public ParkingLotStatus getParkingLotStatus() {
		return parkingLotStatus;
	}
	public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
		this.parkingLotStatus = parkingLotStatus;
	}
	public List<VehicleType> getSupportedVehicleType() {
		return supportedVehicleType;
	}
	public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
		this.supportedVehicleType = supportedVehicleType;
	}
	public SlotAllocationStrategy getSlotAllocationStrategy() {
		return slotAllocationStrategy;
	}
	public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
		this.slotAllocationStrategy = slotAllocationStrategy;
	}
	public BillCalculationStrategy getBillCalculationStrategy() {
		return billCalculationStrategy;
	}
	public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
		this.billCalculationStrategy = billCalculationStrategy;
	}
	
	
	
	
	
	

}
