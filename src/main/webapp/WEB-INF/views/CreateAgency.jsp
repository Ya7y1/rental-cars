<!DOCTYPE html>
<html lang="en">
   <head>
       <meta charset="UTF-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <title>Office Creation</title>
   </head>
   <body>
       <header>
           <h1>Office creation</h1>
       </header>
       <main>
           <form action="Saveagency" method="post">
               <div>
                   <label for="num">Office phone : </label>
                   <input type="text" id="id" name="num">
               </div>
               <div>
                   <label for="city">City: </label>
                   <input type="text" id="id"name="city">
               </div>
                <div>
                                  <label for="adress">Adress: </label>
                                  <input type="text" id="id"name="adress">
                              </div>
               <div>
                   <input type="submit" value="Save">
               </div>
           </form>
           ${messageJsp}
       </main>
       <footer>
           <a href="agencyList">Agency List</a>
       </footer>
   </body>
</html>