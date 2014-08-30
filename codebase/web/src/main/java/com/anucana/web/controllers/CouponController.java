package com.anucana.web.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.anucana.constants.ITypeConstants;
import com.anucana.entity.search.conditions.CouponSearchConditions;
import com.anucana.service.contracts.ServiceException;
import com.anucana.service.contracts.ServiceRequest;
import com.anucana.service.contracts.ServiceResponse;
import com.anucana.services.ICouponService;
import com.anucana.services.IUtilityService;
import com.anucana.utils.SpringUtil;
import com.anucana.value.objects.DiscountCoupon;
import com.anucana.value.objects.TypeGroup;
import com.anucana.web.common.IWebConfigsProvider;

/**
 * Controls flow to all CRUD operations on the discount / promotional / marketing coupons
 * 
 * @author asrivastava
 * @since August 23, 2014
 * 
 */
@Controller
@RequestMapping(value="/coupon/managed/**")
public class CouponController extends AccessController{

	@Autowired
	private IUtilityService utiltiyService;
    @Autowired
    private IWebConfigsProvider configProvider;
    @Autowired
    private ICouponService couponService;

	
	@RequestMapping(value= "edit",method = RequestMethod.GET)
	public ModelAndView createEvent() throws Exception {
		return new ModelAndView("redirect:/coupon/managed/edit/0");
	}
	
	@RequestMapping(value= "edit/{couponId}",method = RequestMethod.GET)
	public ModelAndView editCoupon(@PathVariable long couponId,@RequestParam(value="editSuccess",required = false) String editSuccess) throws Exception {
		ModelAndView mv = new ModelAndView("coupon");
		mv.addObject("editSuccess", editSuccess);
		
		if(couponId == 0l){
			setViewDetails(mv, new DiscountCoupon());
		}else{
			ServiceResponse<DiscountCoupon> response =  
					couponService.getCouponDetail(new ServiceRequest<Long>(couponId), getLoggedInUserDetails(), configProvider.getClientDetails());
			setViewDetails(mv, response.getTargetObject());
		}
		
		return mv;
	}

	
	@RequestMapping(value= "edit/{couponId}",params="action=Save" ,method = RequestMethod.POST)
	public ModelAndView saveCoupon(DiscountCoupon coupon) throws Exception {
		ModelAndView mv = new ModelAndView("coupon");

		ServiceResponse<DiscountCoupon> response =  
				couponService.saveCouponDetail(new ServiceRequest<DiscountCoupon>(coupon), getLoggedInUserDetails(), configProvider.getClientDetails());

		if(response.getBindingResult().hasErrors()){
			mv.addObject(SpringUtil.getVariableName(response.getBindingResult()),response.getBindingResult());
			setViewDetails(mv, coupon);
			
		}else{
			mv = new ModelAndView("redirect:/coupon/managed/edit/" + response.getTargetObject().getCouponId());
			mv.addObject("editSuccess", true);
		}
		return mv;
		
	}
	
	@RequestMapping(value= "edit/{couponId}",params="action=Search",method = RequestMethod.POST)
	public ModelAndView searchCoupons(DiscountCoupon coupon) throws Exception {
		ModelAndView mv = new ModelAndView("coupon");
		
		CouponSearchConditions searchConditions = new CouponSearchConditions(CouponSearchConditions.MODE.SEARCH_BY_NAME);
		searchConditions.setSearchString(coupon.getSearchString());
		
		ServiceResponse<List<DiscountCoupon>> coupons = 
				couponService.searchCoupons(new ServiceRequest<CouponSearchConditions>(searchConditions), getLoggedInUserDetails(),configProvider.getClientDetails());
        mv.addObject("coupons",coupons.getTargetObject());
		
		setViewDetails(mv, coupon);
		return mv;
	}
	
	private void setViewDetails(ModelAndView mv,DiscountCoupon discountCoupon) throws ServiceException{
		// Get the status code
        ServiceResponse<Collection<TypeGroup.Type>> statusTypes = utiltiyService.getTypesByGroup(new ServiceRequest<String>(ITypeConstants.TYPE_GRP_DISCOUNT_COUPON_STATUS));
        mv.addObject("statuses",statusTypes.getTargetObject());

		// Get calculation strategy
        ServiceResponse<Collection<TypeGroup.Type>> calculationStrategies = 
        		utiltiyService.getTypesByGroup(new ServiceRequest<String>(ITypeConstants.TYPE_GRP_DISCOUNT_CALC_STRATEGY_TYPE));
        mv.addObject("calculationStrategies",calculationStrategies.getTargetObject());
        
        // set the discount coupon
        mv.addObject("discountCoupon",discountCoupon);
	}
	
}
