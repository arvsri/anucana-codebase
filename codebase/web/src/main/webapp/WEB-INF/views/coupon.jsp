<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.baseurl.contents')" var="contentsBaseURL"></spring:eval>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>anucana | copuons edit</title>
	<link href="${pageContext.request.contextPath}/static/css/jquery-ui.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/anucana_style.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath}/static/css/custom_fonts.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/colorbox.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/jcrop/jquery.Jcrop.css" type="text/css" />
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/images/icons/favicon.ico" />
	<style type="text/css">
		.eventBannerBlock{
			height: 300px;
			width: 100%;
		}
		.eventImage{
			height: inherit;
			width: inherit;
		}
		.editIcon{
			position: relative;
		}
	</style>
</head>
<body>
	<%@ include file="fragments/headerContent.jsp" %>
	<%@ include file="fragments/sideButtons.jsp" %>

	<div id="anucana_outer_wrapper" class="wrapper_1020">
		<div id="anucana_wrapper" class="wrapper_1020">
          <div id="anucana_main">
	        	<div id="editForm">
					<sf:form action="" method="post" modelAttribute="discountCoupon">
	                    <table style="width:100%;">

                            <tr>
                                <td width="100%" colspan="3">
                                	<p class="description" style="margin-bottom: 0px;margin-left: 10px;"><br/>
                                	 - SEARCH COUPON CODES -----------------------------------------------------------------------------------------------
                                	 <br/><br/></p>
                                </td>
                            </tr>

                            <tr>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Coupon Code Search String" path="searchString"></sf:input></td>
                                <td width="70%" colspan="2"><input type="submit" style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" name="action" value="Search" style="margin-top:15px;" /></td>
                            </tr>
                            <tr>
                                <td width="100%" colspan="3">
                                    <c:if test="${discountCoupon.action == 'Search'}">
                                       <c:choose>
                                         <c:when test="${not empty coupons}">
                                         	<c:forEach items="${coupons}" var="coupon">
                                         		<a href="${pageContext.request.contextPath}/coupon/managed/edit/${coupon.couponId}">${coupon.couponCode}</a>&nbsp;
                                         	</c:forEach>
                                         </c:when>
                                         <c:otherwise>
	                                         <span class="inlineError">Sorry!, no results found</span>
                                         </c:otherwise>
                                       </c:choose>
                                    </c:if>
                                </td>
							</tr>

                            <tr>
                                <td width="100%" colspan="3">
                                	<p class="description" style="margin-bottom: 0px;margin-left: 10px;"><br/><br/> 
                                	- CREATE / EDIT COUPON CODE -----------------------------------------------------------------------------------------------
                                	<br/><br/></p>
                                </td>
                            </tr>

							<c:if test="${ not empty fn:trim(editSuccess)}">
								<tr>
									<td width="100%" colspan="3">
							    	    <h5 style="color: green;">Changes Saved Successfully !!</h5>
									</td>
								</tr>
							</c:if>
							<!-- Coupon Code, Valid From and To Dates -->
                            <tr>
                                <td width="40%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Coupon Code</p></td>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Valid From</p></td>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Valid Until</p></td>
                            </tr>
                            <tr>
                                <td width="40%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Coupon Code ( alphabets and numbers only )" path="couponCode"></sf:input></td>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Valid From ( DD/MM/YYYY HH:mm )" path="validFrom"></sf:input></td>
                                <td width="30%"><sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Valid Until ( DD/MM/YYYY HH:mm )" path="validTo"></sf:input></td>
                            </tr>
                            <tr>
								<td width="40%"><sf:errors path="couponCode" cssClass="inlineError" /></td>
								<td width="30%"><sf:errors path="validFrom" cssClass="inlineError" /></td>
								<td width="30%"><sf:errors path="validTo" cssClass="inlineError" /></td>		                            
							</tr>
							
							<!-- Status, calculation strategy and rate -->
                            <tr>
                                <td width="40%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Coupon Status</p></td>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Discount Calculation Strategy</p></td>
                                <td width="30%"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Rate</p></td>
                            </tr>
                            
                            <tr>
                                <td width="40%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="statusCode">
                                        <c:forEach items="${statuses}" var="status">
                                        	<option value="${status.typeCode}" 
                                        		<c:if test="${status.typeCode eq discountCoupon.statusCode}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${status.typeDescription}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                                <td width="30%">
                                      <select style="margin:10px 10px 10px 10px;height:30px;width:90%" name="calculationStrategy">
                                        <c:forEach items="${calculationStrategies}" var="strategy">
                                        	<option value="${strategy.typeCode}" 
                                        		<c:if test="${strategy.typeCode eq discountCoupon.calculationStrategy}">
                                        			selected
                                        		</c:if> 
                                       		>
											<c:out value="${strategy.typeDescription}"></c:out>
                                        	</option>
                                        </c:forEach>
                                      </select>
                                </td>
                                <td width="30%">
                                	<sf:input cssStyle="margin:10px 10px 10px 10px;height:30px;width:90%" placeholder="Rate" path="rate"></sf:input>
                                </td>
                            </tr>
                            <tr>
								<td width="40%"><sf:errors path="statusCode" cssClass="inlineError" /></td>
								<td width="30%"><sf:errors path="calculationStrategy" cssClass="inlineError" /></td>
								<td width="30%"><sf:errors path="rate" cssClass="inlineError" /></td>		                            
							</tr>
							
							<!-- Coupon description -->
                            <tr>
                                <td width="100%" colspan="3"><p class="description" style="margin-bottom: 0px;margin-left: 10px;">Coupon description</p></td>
                            </tr>
                            <tr>
                                <td width="100%" colspan="3"><sf:textarea rows="2" cssStyle="margin:10px 10px 10px 10px;height:60px;width:97%" 
                                	placeholder="Description ( up to 5000 characters )" path="summary"></sf:textarea></td>
                            </tr>
                            <tr>
								<td width="100%" colspan="3"><sf:errors path="summary" cssClass="inlineError" /></td>		                            
							</tr>
							
                            <tr>
                            	<td colspan="3">
                            		<input style="margin-bottom: 0px;margin-left: 10px;" class="blueButton bigButton" style="margin-top:15px;" type="submit" value="Save" name="action"/>
                            	</td>
                            </tr>
	                    </table>
                    </sf:form>
	            </div> <!-- end of featured project -->
          </div> <!-- end of anucana_main -->
        </div>
		<%@ include file="fragments/footerContent.jsp" %>
    </div> <!-- end of anucana_wrapper -->
    
  <script src="${pageContext.request.contextPath}/static/js/jquery1.9.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery-ui.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/masonry.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/imagesloaded.pkgd.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery.flexslider.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jcrop/jquery.Jcrop.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/js/jquery.colorbox.js"></script>
  <script type="text/javascript">
		$(document).ready(function() {
			// Execute the upload image function
			if(typeof uploadImage !== 'undefined'){
				uploadImage();		
			}
			
			$("button").on("click",function(event){
				$("#action").attr("value",$(this).attr("value"));
				$("form").submit();
			});
		});	
	</script>    
</body>
</html>