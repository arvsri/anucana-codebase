package com.anucana.strategies.discounts;

import com.anucana.constants.ITypeConstants;
import com.anucana.value.objects.Discount;

public class PercentageDiscount implements IDiscountStrategy {

	@Override
	public boolean isApplicable(Discount discount) {
		return ITypeConstants.TYPE_DISCOUNT_CALC_STRATEGY_PERCENTAGE.equals(discount.getCalculationStrategy());
	}

	@Override
	public void apply(Discount discount) {
		float discountedAmount = (discount.getAmount() * discount.getDiscountRate())/100;
		discount.setDiscountedAmount(discountedAmount);
		discount.setDiscountSummary(discount.getDiscountRate() + "discount applied");
	}

}
