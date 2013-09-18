<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String dunsNumber = request.getParameter("duns");
	String user = request.getParameter("user");
	String pwd = request.getParameter("pwd");
	
	if(dunsNumber == null )
	{
		out.write("Error: No DUNS number was passed to the page.");
	}
	else if(user == null )
	{
		out.write("Error: No user name was passed to the page.");
	}
	else if(pwd == null )
	{
		out.write("Error: No password was passed to the page.");
	}
	else
	{
		DnBFullReportFetcher.DBFullReportFetcher report = new DnBFullReportFetcher.DBFullReportFetcher();
		out.write(report.getReportText(dunsNumber, user, pwd));
	}
%>
</body>
</html>