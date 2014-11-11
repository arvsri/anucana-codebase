<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | reserve your seat</title>
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/flexslider.css" type="text/css" media="screen" />
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
				<jsp:useBean id="paymentProcessingResult" class="com.anucana.value.objects.PaymentProcessingResult" scope="request"></jsp:useBean>
				<sf:form action="${pageContext.request.contextPath}/booking/managed/bookEvent" method="post" modelAttribute="userBooking" >

				<spring:bind path="userBooking">
					<c:if test="${status.error}">
			    	    <h5 style="color:#FF614D">
			        	   	<img src="${contentsBaseURL}/images/icons/login_error_black.png" />&nbsp;&nbsp;${status.errorMessage}
			            </h5>
			            </br>
					</c:if>
			    </spring:bind>

				<c:set var="paymentReceived" value="false" scope="request"></c:set>
			    <c:if test="${paymentProcessingResult.userEventId != 0}">
					<c:choose>
						<c:when test="${paymentProcessingResult.processingSuccess}">
				    	    <h4 style="color: green;">
				    	    	Thanks You ! You have successfully booked your seat. 
				    	    	<c:if test="${paymentProcessingResult.notificationSuccess}"> We have send the receipt at your email address.</c:if>
								<br/>You can also download your receipt <a href="${pageContext.request.contextPath}/booking/managed/viewAll">here</a>.				    	    		    	
				    	    </h4>
				    	    <c:set var="paymentReceived" value="true" scope="request"></c:set>
						</c:when>
						<c:otherwise>
				    	    <h5 style="color:#FF614D">
				        	   	<img src="${contentsBaseURL}/images/icons/login_error_black.png" />&nbsp;&nbsp;Sorry, an error occured while processing payment.
				        	   	<br/>Reason : ${paymentProcessingResult.errorReason}
				            </h5>
						</c:otherwise>
					</c:choose>			    
			    </c:if>
			                          		

                  <div id="checkoutAccordion">
					  <div id="signUpAcc">
						  <h3 class="blueHeader14 firstPanel"><a href="#" id="signInLink">Step 1 - Booking Details</a></h3>
                          <div id="personalInfoAccordian">
                              <div id="personalInfoDiv">
                                <table id="personalInfoTable">
                                  <tr>
                                    <th>Name</th>
                                    <td>:</td>
                                    <td><security:authentication property="principal.firstName"/>&nbsp;<security:authentication property="principal.LastName"/></td>
                                  </tr>
                                  <tr>
                                    <th>Email</th>
                                    <td>:</td>
                                    <td><security:authentication property="principal.username"/></td>
                                  </tr>
                                  <tr>
                                    <th>Phone</th>
                                    <td>:</td>
                                    <td>
										<div><sf:input placeholder="Phone number" path="phone" /> <sf:checkbox path="updateProfilePhone" value="Y"/>Update this on my profile</div>
									</td>
                                  </tr>
                                  <tr>
                                  	<th></th>
                                  	<td></td>
                                  	<td><sf:errors path="phone" cssClass="inlineError" /></td>
                                  </tr>
                                  <tr>
                                    <th>Community</th>
                                    <td>:</td>
                                    <td>
		                                <select name="communityId">
		                                     <c:forEach items="${communities}" var="community">
			                                      <option value="${community.communityId}"
		                                                <c:if test="${community.communityId eq userBooking.communityId}">
		                                                  selected
		                                                </c:if>
		                                           >      
			                    						<c:out value="${community.name}"></c:out>
			                                      </option>
		                                     </c:forEach>
		                                </select>
									</td>
                                  </tr>
                                  <tr>
                                    <th>Event</th>
                                    <td>:</td>
                                    <td>
		                                <select name="eventId">
		                                     <c:forEach items="${events}" var="event">
			                                      <option value="${event.eventId}"
		                                                <c:if test="${event.eventId eq userBooking.eventId}">
		                                                  selected
		                                                </c:if>
		                                           >      
			                    						<c:out value="${event.name}"></c:out>
			                                      </option>
		                                     </c:forEach>
		                                </select>
									</td>
                                  </tr>
                                  <tr>
                                    <th>Number of seats</th>
                                    <td>:</td>
                                    <td>
										<select name="numberOfSeats" id="numberOfSeats">
											<c:forEach var="i" begin="0" end="${userBooking.numberOfAvailableSeats}">
												<option value="${i}"
	                                                <c:if test="${i eq userBooking.numberOfSeats}">
	                                                  selected
	                                                </c:if>
												>${i}</option>
											</c:forEach>										
										</select>
									</td>
                                  </tr>
                                  <tr>
                                    <th></th>
                                    <td></td>
                                    <td><sf:errors path="numberOfSeats" cssClass="inlineError" /></td>
                                  </tr>
                                  
                                </table>
                                <c:if test="${not paymentReceived}">
                                	<input style="margin-top:10px;" class="blueButton bigButton" name="action" type="submit" value="Continue" tabindex="4" />
                                </c:if>
                              </div>
                          </div>
							
							<c:set var="activePanelId" value="0"></c:set>
							<c:if test="${not empty userBooking.event}" >
								<c:set var="activePanelId" value="1"></c:set>
							</c:if>
							
                          <h3 class="blueHeader14 secondPanel" id="${activePanelId}"><a href="#">Step 2 - Payment</a></h3>

                          <div>
                          	<c:if test="${not empty userBooking.event}" >
                            <div style="text-align:left; width:50%; float:left;padding-left:20px;">
                                <table id="ticketSummaryTable">
                                  <tr>
                                    <th>Event</th>
                                    <td>:</td>
                                    <td>${userBooking.event.name}</td>
                                  </tr>
                                  <tr>
                                    <th>Venue</th>
                                    <td>:</td>
                                    <td>${userBooking.event.addressLine1} ${userBooking.event.addressLine2} Pincode - ${userBooking.event.pinCode}</td>
                                  </tr>
                                  <tr>
                                    <th>Date</th>
                                    <td>:</td>
                                    <td>${userBooking.event.eventDateBreakup.date}-${userBooking.event.eventDateBreakup.month}-${userBooking.event.eventDateBreakup.year}</td>
                                  </tr>
                                  <tr>
                                    <th>Time</th>
                                    <td>:</td>
                                    <td>${userBooking.event.eventDateBreakup.hour}:${userBooking.event.eventDateBreakup.minute} ${userBooking.event.eventDateBreakup.amOrPm}</td>
                                  </tr>
                                  <tr>
                                    <th>Duration</th>
                                    <td>:</td>
                                    <td>${userBooking.event.durationInMinutes}</td>
                                  </tr>
                                  <tr>
                                    <th>Seats</th>
                                    <td>:</td>
                                    <td>${userBooking.numberOfSeats}</td>
                                  </tr>
                                  <tr>
                                    <th>Total</th>
                                    <td>:</td>
                                    <td id="payAmount">Rs. ${userBooking.payment}<sf:hidden path="payment" /></td>
                                  </tr>
                                  <c:if test="${not empty userBooking.discount}" >
	                                  <tr id="discountRow">
	                                    <th></th>
	                                    <td></td>
	                                    <td>Rs. ${userBooking.netPayment} 
	                                      <span class="roundedCorners" style="background-color:#6FBA54; color:#FFFFFF; padding:3px; margin-left:5px;">
	                                        <span class="webSymbol">&nbsp;.</span> ${userBooking.discount.discountSummary}&nbsp;
	                                      </span>
	                                    </td>
                                  	</tr>
                                  </c:if>
                                </table>
                              </div>
                              
							  <div style="width:45%; float:right;" id="bookingSummaryRightBlock">
                                <table>
                                  <tr>
                                    <td style="padding-top:0px;"><img class="photo" src="${userBooking.event.bannerUrl}" /></td>
                                  </tr>
                                  <c:if test="${not paymentReceived}">
	                                  <tr>
	                                    <td>
	                                      <label for="couponCode">Apply Coupon :</label>
	                                      <sf:input path="discountCouponCode" id="couponCode" placeholder="Enter Coupon Code" />
	                                      <input id="applyCouponCode" type="submit" class="blueButton verySmallButton" name="action" value="Apply" />
	                                    </td>
	                                  </tr>
	                                  <tr><td><sf:errors path="discountCouponCode" cssClass="inlineError" /></td></tr>
                                  </c:if>
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

										<p>Net payable amount : Rs. ${userBooking.netPayment}</p>
										<sf:hidden path="netPayment" />
										<c:if test="${not paymentReceived}">
											<input style="margin-top:10px;" id="paymentSubmit" class="blueButton bigButton" type="submit" name="action" value="Pay Now" />
										</c:if>	
									</div>
								</div>
							  </div>
                          </c:if>
                          </div>
                      </div>
                  </div>
                  
				  </sf:form>
				  
                </div>
            </div> <!-- end of grey_wrapper -->
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
    
  <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/masonry.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery.flexslider.js"></script>

  <script type="text/javascript">
	$(window).load(function() {
        $(function() {
            var $acc = $("#checkoutAccordion > div").accordion({ header: "> h3", 
              collapsible: false, 
              active: ${activePanelId}, 
              heightStyle: "content",
			  beforeActivate: function (event, ui) {
		        if($(event.currentTarget).attr('id') == 0){
					event.preventDefault();
				}
	         }
            });
        })

		$("select").on("change",function(){
			$(".secondPanel").attr("id",0);
		});

        <c:if test="${not empty userBooking.discount}">
	        $("#payAmount").css("text-decoration","line-through");
	        $("#discountRow").show();
        </c:if>

        $(function() {
			$("#payment-tabs").tabs();
		});
	});
  </script>
</body>
</html>
