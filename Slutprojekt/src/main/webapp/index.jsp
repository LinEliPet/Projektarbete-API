<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
Cookie ck[] = request.getCookies();
//for loop i request.getCookies() 
for (int i = 0; i < ck.length; i++) {

	//if ck = cname printa "searchHistory"
	if (ck[i].getName().equals("searchHistory")) {
		System.out.println(ck[i].getName());

		System.out.println(ck[i].getValue());
		
		//skicka vidare till cookieMonter-servlet
		RequestDispatcher rd = request.getRequestDispatcher("cookieMonster");
		rd.forward(request, response);
	}

}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>OpenWeather</title>
<link href="style.css" rel="stylesheet" />

</head>
<body>

	<h1>Weather forecast</h1>
	<br />

	<form action="OWservlet" method="get">
		City: <input type="text" name="city" /><br />
		<br /> Country (Language code): <input type="text" name="country" /><br />
		<br />
		<br /> <input type="submit" value="Seach" />
	</form>




</body>
</html>