<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Vehicle Details</title>
</head>
<body>
	<h1>Vehicle Details</h1>

	<table>
		<tr>
			<th>Vehicle Id</th>
			<td>${vehicle.idVehicle}</td>
		</tr>
		<tr>
			<th>Vehicle Brand</th>
			<td>${vehicle.name}</td>
		</tr>
		<tr>
			<th>Vehicle Description</th>
			<td>${vehicle.description}</td>
		</tr>
		<tr>
			<th>Price</th>
			<td>${vehicle.price} DH </td>
		</tr>
	</table>




	<form method="post" action="Savereservation">
	<meta charset="UTF-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<meta http-equiv="X-UA-Compatible" content="ie=edge">
    	<title>Reservation</title>
    	<!-- Bootstrap CSS -->
    	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
    		crossorigin="anonymous">
    	<!-- Font Awesome CSS -->
    	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css"
    		integrity="sha256-F5d+pc7Y47aaRiKjtbVXgyLn+uP7V5b5K5ueCRVZqno="
    		crossorigin="anonymous" />
    	<!-- Custom CSS -->
    	<style>
    		body {
    			font-family: 'Open Sans', sans-serif;
    			color: #777;
    		}

    		h2 {
    			font-size: 24px;
    			font-weight: bold;
    			color: #333;
    			margin-bottom: 20px;
    		}

    		.form-group {
    			margin-bottom: 20px;
    		}

    		.label {
    			font-size: 16px;
    			font-weight: bold;
    			color: #333;
    		}

    		.form-control {
    			background-color: #f2f2f2;
    			border: none;
    			border-radius: 0;
    			box-shadow: none;
    			font-size: 16px;
    			color: #777;
    			padding: 15px;
    			height: auto;
    			-webkit-box-shadow: none;
    			box-shadow: none;
    		}

    		.btn-secondary {
    			background-color: #007bff;
    			color: #fff;
    			border: none;
    			border-radius: 0;
    			font-size: 18px;
    			font-weight: bold;
    			padding: 15px 30px;
    			transition: all 0.3s ease-in-out;
    			-webkit-transition: all 0.3s ease-in-out;
    			-moz-transition: all 0.3s ease-in-out;
    			-ms-transition: all 0.3s ease-in-out;
    			-o-transition: all 0.3s ease-in-out;
    		}

    		.btn-secondary:hover,
    		.btn-secondary:focus {
    			background-color: #0056b3;
    			color: #fff;
    			border: none;
    			outline: none;
    		}
    	</style>
    </head>
    <body>
    	<section class="ftco-section ftco-no-pt bg-light">
    		<div class="container">
    			<div class="row no-gutters">
    				<div class="col-md-12 featured-top">
    					<div class="row no-gutters">
    						<div class="col-md-4 d-flex align-items-center">
    							<form action="Savereservation" class="request-form ftco-animate bg-primary">
    								<h2>Make Your Reservation</h2>
    								<div class="form-group">
    									<label for="dateJsp">Start Date:</label>
        <input type="date" id="dateE" name="dateS"  required><br><br>
        <label for="dateE">End Date:</label>
        <input type="date" id="dateE" name="dateE" required><br><br>



        <h3>Customer Information</h3>

        <label for="name">Name:</label>

        <input type="text" id="name" name="customer.name" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="customer.email" required><br><br>

        <label for="num">Phone Number:</label>
        <input type="text" id="num" name="customer.num" required><br><br>

        <input type="submit" value="Reserve">
    </form>
    <footer><a href="vehicleList">Back to Vehicle List</a>
    </footer>
</body>
</html>






