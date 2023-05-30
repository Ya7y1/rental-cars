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
<h1> Category List </h1>
</header>

<main>
<table>
<tr>
<th> Category Id </th> <th> Category name </th>  <th> Category describtion </th>
</tr>
<c:forEach items ="${categoryJsp}" var="category">
<tr>
<td>${category.id}</td>
<td>${category.name}</td>
<td>${category.description}</td>
<td><a onClick="return confirm"('sure?')"
   href="deleteCategory?id=${category.id}"

   >Delete</a></td>
   <td><a  href="showCategory?id=${category.id}"

      >Edit</a></td>


</tr>
</c:forEach>
</table>

</main>
<footer>
<a href="createCategory"> Category creation </a>
</footer>
</body>
</html>