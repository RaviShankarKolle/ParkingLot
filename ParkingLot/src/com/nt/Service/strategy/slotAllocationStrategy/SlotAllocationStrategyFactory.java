package com.nt.Service.strategy.slotAllocationStrategy;

public class SlotAllocationStrategyFactory {
	
	public static SlotAllocationStrategy getSlotAllocationStrategy() {
		return new NearestSlotAllocationStrategy();
	}

}
