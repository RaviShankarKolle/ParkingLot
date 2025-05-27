package com.nt.Service.strategy.slotAllocationStrategy;

import com.nt.Exceptions.NoParkingSlotAvailableException;
import com.nt.enums.VehicleType;
import com.nt.models.Gate;
import com.nt.models.ParkingLot;
import com.nt.models.ParkingSlot;

public interface SlotAllocationStrategy {
	ParkingSlot findParkingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) throws NoParkingSlotAvailableException;
	 
}
