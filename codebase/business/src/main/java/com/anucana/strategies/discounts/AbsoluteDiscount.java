package com.anucana.strategies.discounts;

import com.anucana.constants.ITypeConstants;
import com.anucana.value.objects.Discount;

public class AbsoluteDiscount implements IDiscountStrategy {

	@Override
	public boolean isApplicable(Discount discount) {
		return ITypeConstants.TYPE_DISCOUNT_CALC_STRATEGY_ABSOLUTE.equals(discount.getCalculationStrategy());
	}

	@Override
	public void apply(Discount discount) {
		discount.setDiscountedAmount(discount.getDiscountRate());
		discount.setDiscountSummary("Flat discount of Rs." + discount.getDiscountedAmount() + " applied");
	}

}
