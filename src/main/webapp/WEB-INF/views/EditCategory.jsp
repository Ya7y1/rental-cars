<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
  <head>
        <meta charset ="utc-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" conten="width=device-width, initial-scale=1.0">
        <title> Category Creation </title>
</head>
<body>
<header>
<form action="updatecategory" method="post">


               <div>
                   <label for="id">Category id : </label>
                   <input type="text" id="id" name="id"
                   value="${categoryJsp.id}">
               </div>

               <div>
                   <label for="name">Category Name : </label>
                   <input type="text" id="id" name="name"
                   value="${categoryJsp.name}">
               </div>
               <div>
                   <label for="description">Describtion : </label>
                   <input type="text" id="id"name="description"
                   value="${categoryJsp.description}">
               </div>

               <div>
                   <input type="submit" value="update">
               </div>
               </form>
               </main>
<footer>
<a href="createCategory"> Category List </a>
</footer>
</body>
</html>