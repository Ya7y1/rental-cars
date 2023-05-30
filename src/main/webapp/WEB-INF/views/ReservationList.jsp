<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Reservation List</title>
  </head>
  <body>
    <h1>Reservation List</h1>
    <table>
      <tr>
        <th>ID</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Reservation Date</th>
        <th>Price</th>
        <th>Customer Name</th>
        <th>Vehicle Name</th>
      </tr>
      <c:forEach items="${reservations}" var="reservation">
        <tr>
          <td>${reservation.id}</td>
          <td>${reservation.dateS}</td>
          <td>${reservation.dateE}</td>
          <td>${reservation.reservationDate}</td>
          <td>${reservation.price}</td>
          <td>${reservation.customer.name}</td>
          <td>${reservation.vehicle.name}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
