<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:eval expression="@propertyConfigurer.getProperty('config.paymentgateway.provider')" var="service_provider"></spring:eval>
<spring:eval expression="@propertyConfigurer.getProperty('config.paymentgateway.posturl')" var="actionUrl"></spring:eval>
<spring:eval expression="@propertyConfigurer.getProperty('config.paymentgateway.encrypt.key')" var="key"></spring:eval>

<html>
<script type="text/javascript">
	function submitPayuForm() {
      var payuForm = document.forms.payuForm;
      payuForm.submit();
    }
</script>
<body onload="submitPayuForm();">
	<form action="${actionUrl}" method="post" name="payuForm">
		
		<input type="hidden" name="key" value="${key}" />
  		<input type="hidden" name="hash" value="<%= hash %>"/>

  		<input type="hidden" name="txnid" value="<%= txnid %>" />
		<input type="hidden" name="service_provider" value="payu_paisa" />

       	<input type="hidden" name="amount" value="<%= (empty(params.get("amount"))) ? "" : params.get("amount") %>" />

      	<input type="hidden" name="firstname" id="firstname" value="<%= (empty(params.get("firstname"))) ? "" : params.get("firstname") %>" />
		<input type="hidden" name="lastname" id="lastname" value="<%= (empty(params.get("lastname"))) ? "" : params.get("lastname") %>" />

      	<input type="hidden" name="email" id="email" value="<%= (empty(params.get("email"))) ? "" : params.get("email") %>" />
      	<input type="hidden" name="phone" value="<%= (empty(params.get("phone"))) ? "" : params.get("phone") %>" />
		<input type="hidden" name="productinfo" value="<%= (empty(params.get("productinfo"))) ? "" : params.get("productinfo") %>" size="64" />

		<input type="hidden" name="surl" value="<%= (empty(params.get("surl"))) ? "" : params.get("surl") %>"/>
		<input type="hidden" name="furl" value="<%= (empty(params.get("furl"))) ? "" : params.get("furl") %>"/>
      	<input type="hidden" name="curl" value="" /></td>
      	
      	<input type="hidden" name="address1" value="<%= (empty(params.get("address1"))) ? "" : params.get("address1") %>" />
      	<input type="hidden" name="address2" value="<%= (empty(params.get("address2"))) ? "" : params.get("address2") %>" />
      	
      	<input type="hidden" name="city" value="<%= (empty(params.get("city"))) ? "" : params.get("city") %>" />
      	<input type="hidden" name="state" value="<%= (empty(params.get("state"))) ? "" : params.get("state") %>" />
      	<input type="hidden" name="country" value="<%= (empty(params.get("country"))) ? "" : params.get("country") %>" />
      	<input type="hidden" name="zipcode" value="<%= (empty(params.get("zipcode"))) ? "" : params.get("zipcode") %>" />
      	
      	<input type="hidden" name="udf1" value="<%= (empty(params.get("udf1"))) ? "" : params.get("udf1") %>" />
  		<input type="hidden" name="udf2" value="<%= txnid %>" />
      	<input type="hidden" name="udf3" value="<%= (empty(params.get("udf3"))) ? "" : params.get("udf3") %>" />
      	<input type="hidden" name="udf4" value="<%= (empty(params.get("udf4"))) ? "" : params.get("udf4") %>" />
      	<input type="hidden" name="udf5" value="<%= (empty(params.get("udf5"))) ? "" : params.get("udf5") %>" />
      	
        <input type="submit" value="Submit" />
	</form>
</body>
</html>