package com.anucana.strategies.discounts;

import java.util.ArrayList;
import java.util.Collection;

import com.anucana.value.objects.Discount;

public class DiscountCalculationContext {

	public static Collection<IDiscountStrategy> discountStategies = new ArrayList<IDiscountStrategy>();
	
	private final Discount discount;
	
	static{
		discountStategies.add(new AbsoluteDiscount());
		discountStategies.add(new PercentageDiscount());
	}
	
	public DiscountCalculationContext(Discount discount){
		this.discount = discount;
	}
	
	public Discount calculate(){
		for(IDiscountStrategy stategy : discountStategies){
			if(stategy.isApplicable(discount)){
				stategy.apply(discount);
				break;
			}
		}
		return this.discount;
	}
	
}
