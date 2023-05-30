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
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" conten="width=device-width, initial-scale=1.0">
                <link rel="stylesheet" type="text/css" href="style.css">
        <title> Vehicle creation </title>
</head>
<body>
<header>
<form action="updatevehicle" method="post">


               <div>
                   <label for="idVehicle">Vehicle id : </label>
                   <input type="text" id="idVehicle" name="idVehicle"
                   value="${vehicleJsp.idVehicle}">
               </div>

               <div>
                   <label for="name">Vehicle brand : </label>
                   <input type="text" id="id" name="name"
                   value="${vehicleJsp.name}">
               </div>
               <div>
                   <label for="description"> Describtion : </label>
                   <input type="text" id="id"name="description"
                   value="${vehicleJsp.description}">
               </div>
                    <div>
                                  <label for="price"> Price : </label>
                                  <input type="text" id="id"name="price"
                                  value="${vehicleJsp.price}">
                              </div>


               <div>
                   <input type="submit" value="update">
               </div>
               </form>
               </main>
<footer>
<a href="createVehicle"> Vehicle List </a>
</footer>
</body>
</html>