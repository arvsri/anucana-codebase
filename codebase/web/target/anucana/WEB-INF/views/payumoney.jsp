<html>
<script type="text/javascript">
	function submitPayuForm() {
      var payuForm = document.forms.payuForm;
      payuForm.submit();
    }
</script>
<body onload="submitPayuForm();">
	<form action="${paymentRequest.posturl}" method="post" name="payuForm">
		
		<input type="hidden" name="key" value="${paymentRequest.key}" />
  		<input type="hidden" name="hash" value="${paymentRequest.hash}"/>

  		<input type="hidden" name="txnid" value="${paymentRequest.txnid}" />
		<input type="hidden" name="service_provider" value="${paymentRequest.service_provider}" />

       	<input type="hidden" name="amount" value="${paymentRequest.amount}" />

      	<input type="hidden" name="firstname" id="firstname" value="${paymentRequest.firstname}" />
		<input type="hidden" name="lastname" id="lastname" value="${paymentRequest.lastname}" />

      	<input type="hidden" name="email" value="${paymentRequest.email}" />
      	<input type="hidden" name="phone" value="${paymentRequest.phone}" />
		<input type="hidden" name="productinfo" value="${paymentRequest.htmlCharEscapedProductinfo}"/>

		<input type="hidden" name="surl" value="${paymentRequest.surl}"/>
		<input type="hidden" name="furl" value="${paymentRequest.furl}"/>
      	<input type="hidden" name="curl" value="${paymentRequest.curl}" />
      	
      	<input type="hidden" name="address1" value="${paymentRequest.address1}" />
      	<input type="hidden" name="address2" value="${paymentRequest.address2}" />
      	
      	<input type="hidden" name="city" value="${paymentRequest.city}" />
      	<input type="hidden" name="state" value="${paymentRequest.state}" />
      	<input type="hidden" name="country" value="${paymentRequest.country}" />
      	<input type="hidden" name="zipcode" value="${paymentRequest.zipcode}" />
      	
      	<input type="hidden" name="udf1" value="${paymentRequest.udf1}" />
  		<input type="hidden" name="udf2" value="${paymentRequest.udf2}" />
      	<input type="hidden" name="udf3" value="${paymentRequest.udf3}" />
      	<input type="hidden" name="udf4" value="${paymentRequest.udf4}" />
      	<input type="hidden" name="udf5" value="${paymentRequest.udf5}" />
      	<input type="hidden" name="udf6" value="${paymentRequest.udf6}" />
  		<input type="hidden" name="udf7" value="${paymentRequest.udf7}" />
      	<input type="hidden" name="udf8" value="${paymentRequest.udf8}" />
      	<input type="hidden" name="udf9" value="${paymentRequest.udf9}" />
      	<input type="hidden" name="udf10" value="${paymentRequest.udf10}" />
      	
	</form>
</body>
</html>