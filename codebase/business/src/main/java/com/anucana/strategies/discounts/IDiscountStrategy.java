package com.anucana.strategies.discounts;

import com.anucana.value.objects.Discount;

public interface IDiscountStrategy {

	boolean isApplicable(Discount discount);
	
	void apply(Discount discount);
	
}
