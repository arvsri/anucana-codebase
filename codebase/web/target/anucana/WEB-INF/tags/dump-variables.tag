<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%
	String str = "<br>";
	java.util.Enumeration enumeration = request.getAttributeNames();
	while(enumeration.hasMoreElements()){ 
		String attrName =  enumeration.nextElement().toString();
%>	
		<%=str %><%=str %>
		<%=attrName %>
		<%=str %>
		<%=request.getAttribute(attrName) %>
	
<%}%>
