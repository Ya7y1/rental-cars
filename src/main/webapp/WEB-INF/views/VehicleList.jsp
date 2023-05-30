<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
  <head><style>

        .container {
          max-width: 800px;
          margin: 0 auto;
          text-align: center;
        }

        h1 {
          font-size: 36px;
          margin-top: 50px;
        }

        ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
        }

        li {
          display: inline-block;
          margin: 0 10px;
        }

        a {
          display: inline-block;
          padding: 10px 20px;
          background-color: #3498db;
          color: #fff;
          text-decoration: none;
          border-radius: 5px;
          transition: background-color 0.3s ease;
        }

        a:hover {
          background-color: #2980b9;
        } </style>
        <meta charset ="utc-8">
        <title> Category List </title>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<header>
<h1> Vehicle list </h1>
</header>

<main>
<table>
<tr>
<th> Vehicle Id </th> <th> Vehicle brand </th>  <th> Vehicle describtion </th> <th> Price</th>
</th></tr>
<c:forEach items="${vehicleJsp}" var="vehicle">
	<tr>
		<td>${vehicle.idVehicle}</td>
		<td>${vehicle.name}</td>
		<td>${vehicle.description}</td>
		<td>${vehicle.price}</td>
		<td>
			<a onClick="return confirm('Are you sure you want to delete this vehicle?')"
			   href="deleteVehicle?idVehicle=${vehicle.idVehicle}">Delete</a>
		</td>
		<td>
			<a href="showVehicle?idVehicle=${vehicle.idVehicle}">Edit</a>
			<a href="vehicleDetails?idVehicle=${vehicle.idVehicle}">Details</a> <!-- Add this line to display a button for vehicle details -->
		</td>
	</tr>
</c:forEach>
</table>

</main>
<footer>
<a href="createVehicle"> vehicle creation </a>
</footer>
</body>
</html>