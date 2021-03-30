<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<header>
<a href="/SpringQ8/login.html?siteLanguage=en">English</a>|<a href="/SpringQ8/login.html?siteLanguage=fr">French</a>|<a href="/SpringQ8/login.html?siteLanguage=vi">Vietnamese</a>
</header>
<body>

<table>
    <tr>
        <td><spring:message code="label.userName"/></td><td> <input type="text" name="userName"/></td>
    </tr>
    <tr>
       <td><spring:message code="label.password"/></td><td> <input type="text" name="password"/></td>
    </tr>
    <tr>
    <td>
    <spring:message code="label.login" var ="labelLogin"></spring:message>
     <input type="submit" value="${labelLogin}" /> </td>
       </tr>

</body>
</html>