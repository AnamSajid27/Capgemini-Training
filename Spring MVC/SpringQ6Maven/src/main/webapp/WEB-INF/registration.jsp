<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
      <head>
      <style>
            .error {
                color: red
            }
        </style>
      </head>
     
     <form:errors path="customer.*"/>
     

      
     	<form:form action="/springMVCTest/validation.html" modelAttribute="customer">
     	<table>
     	<tr>
     		<td>Username: </td> <td><input type="text" name="username"/>
     		                        <form:errors path="username" cssClass="error"/></td>
     	</tr>
     	<tr>
     		<td>Password: </td> <td><input type="password" name="password"/>
     								<form:errors path="password" cssClass="error"/></td>
     	</tr>
     	<tr>
     		<td>Email: </td> <td><input type="text" name="email"/>
     		                      <form:errors path="email" cssClass="error"/></td>
     	</tr>
     	<tr>
     		<td>Contact: </td> <td><input type="text" name="contact"/>
     		                       <form:errors path="contact" cssClass="error"/> </td>
     	</tr>
     	<tr>
     		<td>City: </td> <td><select name="city" >
										  	<option value="Pune">Pune</option>
										    <option value="Banglore">Banglore</option>
										    <option value="Chennai">Chennai</option>
										    <option value="Mumbai">Mumbai</option>
										</select></td>
     	</tr>
     	<tr>
     		<td>Zip Code: </td> <td><input type="text" name="zipcode"/>
     		                         <form:errors path="zipcode" cssClass="error"/></td>
     	</tr>
     	<tr>
     		 <td><input type="submit" value="submit"/></td>
     	</tr>
     	</table>
     	</form:form>


</body>
</html>