<!DOCTYPE html>
<html lang="en">

<head>
  <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="style.css">
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Category Creation</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
    }

    header {
      background-color: #f8f9fa;
      padding: 20px;
      text-align: center;
    }

    h1 {
      margin: 0;
    }

    main {
      padding: 20px;
    }

    form {
      max-width: 400px;
      margin: 0 auto;
    }

    label {
      display: block;
      margin-bottom: 10px;
    }

    input[type="text"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      margin-bottom: 20px;
    }

    input[type="submit"] {
      background-color: #007bff;
      color: #fff;
      border: none;
      padding: 10px 20px;
      border-radius: 4px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #0069d9;
    }

    footer {
      background-color: #f8f9fa;
      padding: 20px;
      text-align: center;
    }
  </style>
</head>

<body>
  <header>
    <h1>Category Creation</h1>
  </header>
  <main>
    <form action="Savecategory" method="post">
      <div class="mb-3">
        <label for="name" class="form-label">Category Name:</label>
        <input type="text" id="name" name="name" class="form-control">
      </div>
      <div class="mb-3">
        <label for="description" class="form-label">Description:</label>
        <input type="text" id="description" name="description" class="form-control">
      </div>
      <div>
        <input type="submit" value="Save" class="btn btn-primary">
      </div>
    </form>
    ${messageJsp}
  </main>
  <footer>
    <a href="categoryList">Category List</a>
  </footer>
  <script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
</body>

</html>
