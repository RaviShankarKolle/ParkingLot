package com.nt.models;

import com.nt.enums.PaymentMode;
import com.nt.enums.PaymentStatus;

public class Payment extends BaseModel {
	
	private int amount;
	private PaymentMode paymentMode;
	private String transactionNumber;
	private PaymentStatus paymentStatus;
	private Bill bill;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Payment(int amount, PaymentMode paymentMode, String transactionNumber, PaymentStatus paymentStatus,
			Bill bill) {
		super();
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.transactionNumber = transactionNumber;
		this.paymentStatus = paymentStatus;
		this.bill = bill;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	

}
