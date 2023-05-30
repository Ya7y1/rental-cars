<html>
<head>
    <title>Customer information</title>
</head>
<body>
<main>
<form action="Savecustomer" method="post">
    <h1> Customer informations </h1>
    <form method="post" action="/create-customer">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br>
        <label for="num">Phone Number:</label>
        <input type="tel" id="num" name="num" required><br>
        <button type="submit"> Send </button>
    </form>
    ${messageJsp}
    </main>
     <footer>
               <a href="/reservation">reservation</a>
           </footer>
</body>
</html>