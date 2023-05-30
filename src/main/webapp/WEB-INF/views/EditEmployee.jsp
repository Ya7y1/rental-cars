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
 <form action="Updateemployee" method="post">


                <div>
                    <label for="id">employee id : </label>
                    <input type="text" id="id" name="id"
                    value="${employeeJsp.id}">
                </div>

                <div>
                    <label for="fullname">employee fullname : </label>
                    <input type="text" id="id" name="fullname"
                    value="${employeeJsp.fullname}">
                </div>
                <div>
                    <label for="email">Email : </label>
                    <input type="text" id="id"name="email"
                    value="${employeeJsp.email}">
                </div>
                  <div>
                                    <label for="role">Role : </label>
                                    <input type="text" id="id"name="role"
                                    value="${employeeJsp.role}">
                                </div>

                <div>
                    <input type="submit" value="update">
                </div>
                </form>
                </main>
 <footer>
 <a href="createEmployee"> Employee List </a>
 </footer>
 </body>
 </html>