<!DOCTYPE html>
<html>
<head>
<style>

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
}

</style>
  <title>Welcome Page</title>
  <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootsrap.min.css">
</head>
<body>
  <div class="container">
    <h1>Welcome !</h1>
    <p> here is your lists:</p>
    <ul>
    <li><a href="vehicleList">Vehicle</a></li>
      <li><a href="categoryList">Cars categories </a></li>
      <li><a href="employeeList">Emloyees</a></li>
       <li><a href="reservationlist">Reservations</a></li>

    </ul>
  </div>
</body>
</html>


