<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="anucana" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | reserve your seat</title>
	<link href="/web/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="/web/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="/web/static/css/flexslider.css" type="text/css" media="screen" />
	<link rel="shortcut icon" href="${contentsBaseURL}/images/icons/favicon.ico" />
	<style type="text/css">
		#personalInfoDiv{
			text-align:left; 
			width:100%; 
			float:left;
			padding-left:20px;
		}
		#personalInfoTable tr td{
		  padding: 4px;
		}
	</style>
</head>
<body>
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
          <div id="anucana_main">
            <div id="grey_wrapper" class="greyLinen_background">
                <div style="margin-top:10px;">

                  <div id="checkoutAccordion" class="startsUgly">
					  <div id="signUpAcc">
						  <h3 class="blueHeader14"><a href="#" id="signInLink">Step 1 - Booking Details</a></h3>
                          <div id="personalInfoAccordian">
                              <div id="personalInfoDiv">
                                <table id="personalInfoTable">
                                  <tr>
                                    <th>Name</th>
                                    <td>:</td>
                                    <td>Arvind Srivastava</td>
                                  </tr>
                                  <tr>
                                    <th>Email</th>
                                    <td>:</td>
                                    <td>arvinds_friend@yahoo.co.in</td>
                                  </tr>
                                  <tr>
                                    <th>Phone</th>
                                    <td>:</td>
                                    <td>
										<div><input type="text" value="9650733522" /><input type="checkbox" name="updatePhone" checked="checked" value="updatePhone" /> Update this on my profile</div>
									</td>
                                  </tr>
                                  <tr>
                                    <th>Community</th>
                                    <td>:</td>
                                    <td>
										<select name="community" id="community">
											<option value="1">Java Community</option>
											<option value="2">Linux Community</option>
											<option value="3" selected>Spring Framework</option>
											<option value="5">Hibernate Community</option>
										</select>
									</td>
                                  </tr>
                                  <tr>
                                    <th>Event</th>
                                    <td>:</td>
                                    <td>
										<select name="event" id="event">
											<option value="1">Spring MVN</option>
											<option value="2">Spring AOP</option>
											<option value="3" selected>Spring Batch</option>
										</select>
									</td>
                                  </tr>
                                  <tr>
                                    <th>Number of seats</th>
                                    <td>:</td>
                                    <td>
										<select name="numberOfSeats" id="numberOfSeats">
											<option value="1" selected>1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
										</select>
									</td>
                                  </tr>
                                </table>
                                <input style="margin-top:10px;" class="blueButton bigButton" type="button" id="checkOutButton" value="Proceed to checkout" tabindex="4" />
                              </div>
                          </div>

                          <h3 class="blueHeader14" id="paymentHeader">Step 2 - Payment</h3>

                          <div>

                            <div style="text-align:left; width:50%; float:left;padding-left:20px;">
                                <table id="ticketSummaryTable">
                                  <tr>
                                    <th>Event</th>
                                    <td>:</td>
                                    <td>Relics of PHP</td>
                                  </tr>
                                  <tr>
                                    <th>Venue</th>
                                    <td>:</td>
                                    <td>Anucana Bhavan, 7 Race Course Road</td>
                                  </tr>
                                  <tr>
                                    <th>Date</th>
                                    <td>:</td>
                                    <td>07-May-2014</td>
                                  </tr>
                                  <tr>
                                    <th>Time</th>
                                    <td>:</td>
                                    <td>10:30am</td>
                                  </tr>
                                  <tr>
                                    <th>Duration</th>
                                    <td>:</td>
                                    <td>180 min</td>
                                  </tr>
                                  <tr>
                                    <th>Seats</th>
                                    <td>:</td>
                                    <td>1</td>
                                  </tr>
                                  <tr>
                                    <th>Total</th>
                                    <td>:</td>
                                    <td id="payAmount">Rs. 1000.00</td>
                                  </tr>
                                  <tr id="discountRow" style="display:none;">
                                    <th></th>
                                    <td></td>
                                    <td>Rs. 800.00 
                                      <span class="roundedCorners" style="background-color:#6FBA54; color:#FFFFFF; padding:3px; margin-left:5px;">
                                        <span class="webSymbol">&nbsp;.</span> 20% discount applied&nbsp;
                                      </span>
                                    </td>
                                  </tr>
                                </table>
                              </div>
                              
							  <div style="width:45%; float:right;" id="bookingSummaryRightBlock">
                                <table>
                                  <tr>
                                    <td style="padding-top:0px;"><img class="photo" src="${contentsBaseURL}/images/featured_project.jpg" /></td>
                                  </tr>
                                  <tr>
                                    <td>
                                      <label for="couponCode">Apply Coupon :</label>
                                      <input id="couponCode" type="text" placeholder="Enter Coupon Code"/>
                                      <input id="applyCouponCode" type="button" class="blueButton verySmallButton" value="Apply" />
                                    </td>
                                  </tr>
                                  <tr ><td><div style="color:#FF614D;">This Coupon Code is Expired.</div></td></tr>
                                </table>
                              </div>

							  <div  style="margin-top=50px; width:100%; float:left;">
								<div id="payment-tabs">
									<ul>
										<li><a href="#payment-tabs-1"><img src="${contentsBaseURL}/images/payments/payu_money.png"></img></a></li>
									</ul>
									<div id="payment-tabs-1">
										<p>Pay using <a href="https://www.payumoney.com/">PayU Money</a>. Its easy, safe and fast.</p> <img src="${contentsBaseURL}/images/payments/pay_modes.png"></img>
										<br/><br/>

										<p>Net payable amount : Rs. 1000</p>
										<input style="margin-top:10px;" id="paymentSubmit" class="blueButton bigButton" type="button" value="Pay Now" />

									</div>
								</div>
							  </div>
                          </div>
                      </div>
                  </div>
                </div>
            </div> <!-- end of grey_wrapper -->
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
    
  <script src="/web/static/js/jquery1.9.1.min.js"></script>
  <script src="/web/static/js/jquery-ui.js"></script>
  <script src="/web/static/js/masonry.pkgd.js"></script>
  <script src="/web/static/js/imagesloaded.pkgd.js"></script>
  <script src="/web/static/js/jquery.flexslider.js"></script>

  <script type="text/javascript">
	$(window).load(function() {
        $(function() {
            var $acc = $("#checkoutAccordion > div").accordion({ header: "> h3", 
              collapsible: false, 
              active: false, 
              heightStyle: "content",
			  beforeActivate: function (event, ui) {
		        if($(event.currentTarget).attr('id') == 0){
					event.preventDefault();
				}
	         }
            });
        })

    //this will open Payment accordian on click of checkOutButton.
    $('#checkOutButton').click(function(){
          $("#signUpAcc").accordion({active:1});
    });

    // Below methods unbind click event on the Payment accordion header and removes hover/foces specific styling to make it look intact
    $('#paymentHeader').unbind('click');

    $("#paymentHeader").hover(function(){
          $(this).removeClass('ui-state-hover').css('cursor','auto');
    });
    $("#paymentHeader").focus(function(){
          $(this).removeClass('ui-state-focus');
    });
    


		$("select").on("change",function(){
			$(".bookingSummary").attr("id",0);
		});

        $('#applyCouponCode').click(function(){
          //Make an ajax call here to apply coupon code, and in case success is returned, display the discounted price else show error.
          $("#payAmount").css("text-decoration","line-through");
          $("#discountRow").show();
        });

		 $(function() {
			$("#payment-tabs").tabs();
		});
	});
  </script>
</body>
</html>
