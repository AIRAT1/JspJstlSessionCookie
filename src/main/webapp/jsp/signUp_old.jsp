<%@ page import="ru.ivmit.models.User" %>
<%@ page import="java.util.ArrayList" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList<User>) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>User name</th>
        <th>Birth date</th>
    </tr>
    <%
        for (User user : users) {
    %>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getBirthDate()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
