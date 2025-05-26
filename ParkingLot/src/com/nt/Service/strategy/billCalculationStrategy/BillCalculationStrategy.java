package com.nt.Service.strategy.billCalculationStrategy;

import java.time.LocalDateTime;

import com.nt.models.Ticket;

public interface BillCalculationStrategy {
	double calculateBillAmount(Ticket ticket, LocalDateTime exitTime);

}
