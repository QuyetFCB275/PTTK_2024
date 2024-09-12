<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Form</title>
</head>
<body>
<div align="center">
    <h1>Login Form</h1>
    <form action="<%= request.getContextPath() %>/login" method="post">
        <table style="width: 50%">
            <tr>
                <td>Username</td>
                <td><input type="text" name="username" required /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" required /></td>
            </tr>
        </table>
        <input type="submit" value="Login" />
    </form>
    <%
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
    %>
    <p style="color:red;"><%= errorMessage %></p>
    <%
        }
    %>
</div>
</body>
</html>