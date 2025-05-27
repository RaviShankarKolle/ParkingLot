package com.nt.Service.strategy.slotAllocationStrategy;

import com.nt.Exceptions.NoParkingSlotAvailableException;
import com.nt.enums.ParkingSlotStatus;
import com.nt.enums.VehicleType;
import com.nt.models.Gate;
import com.nt.models.ParkingLot;
import com.nt.models.ParkingSlot;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy {

	@Override
	public ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) throws NoParkingSlotAvailableException {
		// TODO Auto-generated method stub
		int floorNumber=entryGate.getFloorNumber();
		for(ParkingSlot slot : parkingLot.getParkingFloors().get(floorNumber).getParkingSlots()) {
			if(slot.getSupportedVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)) {
				return slot;
			}
		}
			int i=floorNumber -1;
			int j=floorNumber+1;
			
			while(i>=0 || j<parkingLot.getParkingFloors().size()) {
				if(i>=0) {
					for(ParkingSlot slot : parkingLot.getParkingFloors().get(floorNumber).getParkingSlots()) {
						if(slot.getSupportedVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)) {
							return slot;
						}
					}
				}if(j<parkingLot.getParkingFloors().size()) {
					for(ParkingSlot slot : parkingLot.getParkingFloors().get(floorNumber).getParkingSlots()) {
						if(slot.getSupportedVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(ParkingSlotStatus.AVAILABLE)) {
							return slot;
						}
					}
				}
				i--;
				j++;
				
			}
		
		throw  new NoParkingSlotAvailableException("NO ParkingSlot available");
	}
	

}
