<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All LOcations</title>
</head>
<body>
      <a href="lead">create new lead</a>
      <h2>Billing | All Bills</h2>
      <hr>
      
         <table border='1'>
           <thead>
                <tr>
                    <th>Id</th>
                    <th>First Name</th>
                    <th> Last Name</th>
                    <th>Email</th>
                    <th>Mobile</th>
                    <th>Product Name</th>
                    <th>Amount</th>
                </tr>
           </thead>
           
           <c:forEach var="bill" items="${bills}">
             <tbody>
                 <tr>
                    <td>${bill.id}</td>
                    <td>${bill.firstName}</td>
                    <td>${bill.lastName}</td>
                    <td>${bill.email}</td>
                    <td>${bill.mobile}</td>
                    <td>${bill.productName}</td>
                    <td>${bill.amount}</td>
                 </tr>
               </tbody>
           </c:forEach>
           
         </table>

</body>
</html>