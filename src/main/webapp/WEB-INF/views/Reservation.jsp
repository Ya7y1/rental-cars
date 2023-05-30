<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation</title>
    <style>
        .error-message {
            color: red;
        }
    </style>
</head>
<body>
<h2>Reservation</h2>

<c:if test="${not empty messageJsp}">
    <p class="message">${messageJsp}</p>
</c:if>

<c:if test="${not empty error}">
    <p class="error-message">${error}</p>
</c:if>



</body>
</html>
