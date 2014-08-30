package com.anucana.value.objects;

import java.io.Serializable;

public class Discount implements Serializable {

	private static final long serialVersionUID = 1L;

	private float amount;
	
	private float discountRate;
	
	private String calculationStrategy;

	
	private float discountedAmount;
	
	private String discountSummary;
	
	
	public Discount(){
		
	}
	
	public Discount(float amount,float discountRate, String calculationStrategy) {
		super();
		this.amount = amount;
		this.discountRate = discountRate;
		this.calculationStrategy = calculationStrategy;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCalculationStrategy() {
		return calculationStrategy;
	}

	public void setCalculationStrategy(String calculationStrategy) {
		this.calculationStrategy = calculationStrategy;
	}

	public float getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(float discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public String getDiscountSummary() {
		return discountSummary;
	}

	public void setDiscountSummary(String discountSummary) {
		this.discountSummary = discountSummary;
	}

	public float getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
}
