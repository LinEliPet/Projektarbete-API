<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.weatherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>The weather</title>
<link href="style.css" rel="stylesheet"/>
</head>
<body>



	<%
	weatherBean wBean = (weatherBean) request.getAttribute("wBean");
	out.print("The weather in " + wBean.getCityStr() + " is now with a " + wBean.getCloudsStr() + " " + wBean.getDateStr() + " " + wBean.getTempStr());
	%>




</body>
</html>