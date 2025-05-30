package com.nt.repo;

import java.util.HashMap;

import com.nt.Exceptions.ParkingSlotNotFoundException;
import com.nt.models.ParkingSlot;

public class ParkingSlotRepository {
	
	 private HashMap<Integer, ParkingSlot> parkingSlotMap;

	    public ParkingSlotRepository() {
	        this.parkingSlotMap = new HashMap<>();
	    }

	    public ParkingSlot get(int parkingSlotId) throws ParkingSlotNotFoundException {
	        ParkingSlot parkingSlot = parkingSlotMap.get(parkingSlotId);
	        if(parkingSlot == null){
	            throw new ParkingSlotNotFoundException("ParkingSlot not found for Id : " + parkingSlotId);
	        }
	        return parkingSlot;
	    }

	    public ParkingSlot put(ParkingSlot parkingSlot){
	        parkingSlotMap.put(parkingSlot.getId(), parkingSlot);
	        return parkingSlot;
	    }

}
