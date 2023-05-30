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
        <title> Employee List </title>
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<header>
<h1> Agency List </h1>
</header>

<main>
<table>
<tr>
<th> Agency Id </th> <th> Agency Full name </th>  <th> Email </th> <th> Role </th>
</tr>
<c:forEach items ="${agencyJsp}" var="agency">
<tr>
<td>${employee.id}</td>
<td>${employee.nume}</td>
<td>${employee.city}</td>
<td>${employee.adress}</td>
<td><a onClick="return confirm"('sure?')"
   href="deleteemployee?id=${employee.id}"

   >Delete</a></td>
   <td><a  href="showemployee?id=${employee.id}"

      >Edit</a></td>


</tr>
</c:forEach>
</table>

</main>
<footer>
<a href="createEmployee"> Employee creation </a>
</footer>
</body>
</html>