<%@page import="DnBFullReportFetcher.DnBDunsSearch"%>
<%@page import="DnBFullReportFetcher.WebHelper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {font:12px verdana,sans-serif;color:#0b333c;}
p {font:12px bold verdana,sans-serif;color:#0b333c;}
</style>
</head>
<body>
<%
	String dunsNumber = WebHelper.getParameter(request.getParameter("duns"));
	String search = WebHelper.getParameter(request.getParameter("search"));
	String companyName = WebHelper.getParameter(request.getParameter("companyname"));
	String postCode = WebHelper.getParameter(request.getParameter("postcode"));
	String address = WebHelper.getParameter(request.getParameter("address1"));
	String companyRegNo = WebHelper.getParameter(request.getParameter("companyregno"));
	// TODO : Soon - read from config !!
	String user = application.getInitParameter("DBUserName");
	String pwd = application.getInitParameter("DBPassword");
	out.write(user);
	out.write(pwd);
	if(user == null || user.length()==0)
	{
		out.write("There is no D&B user name configured.");
	}
	else if(pwd == null || pwd.length()==0)
	{
		out.write("There is no D&B password configured.");
	}
	else 
	{
		if(dunsNumber == null || dunsNumber.length()==0 )
		{
	%>
		<form action="index.jsp" >
			<table>
			<tr><td>Enter DUNS number</td><td><INPUT TYPE="text" name="duns"></td><td><input TYPE="submit"></td></tr>
			</table>
		</form>
		<br />
		<form action="index.jsp" >
			<table>
			<tr><td colspan="2">If you do not know the DUNS of the company you require then please search using the form below</td></tr>
			<tr><td colspan="2">&nbsp</td></tr>
			<tr><td>Company Name</td><td><INPUT TYPE="text" name="companyname" size="50" value="<%=companyName%>"></td></tr>
			<tr><td>Company registration number</td><td><INPUT TYPE="text" name="companyregno" value="<%=companyRegNo%>"></td></tr>
			<tr><td>Address Line 1</td><td><INPUT TYPE="text" name="address1" size="50" value="<%=address%>"></td></tr>
			<tr><td>Post Code</td><td><INPUT TYPE="text" name="postcode" value="<%=postCode%>"></td></tr>
			<tr><td><input TYPE="hidden" name="search" value="y"><input TYPE="submit" value="Search"></td><td>&nbsp;</td></tr>
			</table>
		</form>
	<%
	
			if(search != null && search.length()>0)
			{
				DnBDunsSearch searchClient = new DnBDunsSearch(user, pwd);
				String searchResult = searchClient.lookupDuns(companyName, postCode, address, companyRegNo);
				out.write(searchResult);
			}
		}
		else
		{
			DnBFullReportFetcher.DBFullReportFetcher report = new DnBFullReportFetcher.DBFullReportFetcher();
			out.write(report.getReportText(dunsNumber, user, pwd));
		}
	}
%>
</body>
</html>