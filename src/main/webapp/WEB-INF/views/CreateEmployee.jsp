<!DOCTYPE html>
<html lang="en">
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
                     } </style>
       <meta charset="UTF-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.1.1/crypto-js.min.js"></script>

       <title>Category Creation</title>
       <link rel="stylesheet" type="text/css" href="style.css">
   </head>
   <body>
       <header>
           <h1>Employee Creation</h1>
       </header>
       <main>
           <form action="Saveemployee" method="post">
               <div>
                   <label for="fullname">Employee full name : </label>
                   <input type="text" id="id" name="fullname">
               </div>
               <div>
                   <label for="email">Email : </label>
                   <input type="text" id="id"name="email">
               </div>
                 <div>

                    <label for="password">Password : </label>
                    <input type="password" id="id"name="password">
                     </div>


                    <div>
                    <label for="role">Role : </label>
                    <input type="text" id="id"name="Role">
                     </div>
               <div>
                   <input type="submit" value="Save">
               </div>
           </form>
            ${messageJsp}
       </main>
       <footer>
           <a href="employeeList">Employees list</a>
       </footer>
   </body>
</html>