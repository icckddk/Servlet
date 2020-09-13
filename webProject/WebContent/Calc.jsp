<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet Calculation</title>
</head>
<body>
<center>
<h3>Calculator Simple Practice</h3>
<hr>
<form name = "form1" action="/cs.dit.controller/calc" method="post">
<input type = "text" name = "num1" widht = "300" size = "5">
<select name = "operator">
<option selected> + </option>
<option> - </option>
<option> * </option>
<option> / </option>
</select>
<input type = "text" name = "num2" widht ="300" size ="5">
<br><br>
<input type = "submit" value = "calculation">
<input type = "result" value = "retype">
</form>
<hr>
</center>
</body>
</html>