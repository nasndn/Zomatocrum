<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save-lead</title> 
</head>
<body>
     <h2>Lead |create mew Lead</h2>
     <hr>
     <form action="save" method="post">
       <pre>
             Email<input type="email" name="email"  required/>
         First Name<input type="text" name="firstName" required/>
         Last name<input type="text" name="lastName" required/>
         Mobile<input type="text" name="mobile"required/>
         
           <select name="leadSource" required >
            <option value="news paper">news paper</option>
             <option value="radio">radio</option>
              <option value="online">online</option>
               <option value="tv">tv</option>
           </select>
           <input type="submit" value="save"/>
        </pre>  
     </form>
</body>
</html>