<html>
<body>
	<%="Welcome " + request.getParameter("name")%>
<% String name=request.getParameter("name");  
out.print("welcome "+name); %> 
</body>
</html>