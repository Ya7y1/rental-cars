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

       <title>Vehicle Creation</title>
       <link rel="stylesheet" type="text/css" href="style.css">
   </head>
   <body>
       <header>
           <h1>Vehicle Creation</h1>
       </header>
       <main>
           <form action="Savevehicle" method="post">
               <div>
                   <label for="name"> Brand : </label>
                   <input type="text" id="id" name="name">
               </div>
               <div>
                   <label for="description">Description : </label>
                   <input type="text" id="id" name="description">
               </div>
                 <div>

                    <label for="price">Price : </label>
                    <input type="text" id="id" name="price">
                     </div>


               <div>
                   <input type="submit" value="Save">
               </div>
           </form>
            ${messageJsp}
       </main>
       <footer>
           <a href="vehicleList">Vehicle list</a>
</footer>
</body>
</html>