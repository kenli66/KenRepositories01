<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
	<body>
		<s:form action="echo" >
			<s:textfield name="message" label="訊息" />
			<s:submit />
		</s:form>
	</body>
</html>