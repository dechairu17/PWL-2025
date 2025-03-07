<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>POS</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
        }
        .navbar {
            background-color: #343a40;
        }
        .navbar a {
            color: #ffffff;
            margin-right: 15px;
        }
        .navbar a:hover {
            color: #17a2b8;
        }
        .card {
            margin-top: 20px;
            border: none;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            transition: transform 0.3s;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .dropdown-menu a {
            color: #000;
        }
        .dropdown-menu a:hover {
            background-color: #17a2b8;
            color: #ffffff;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="/">POS</a>
        <div>
            <a href="/" class="nav-link d-inline">Home</a>
            <div class="dropdown d-inline">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">Category</a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="/category/food-beverage">Food & Beverage</a></li>
                    <li><a class="dropdown-item" href="/category/beauty-health">Beauty & Health</a></li>
                    <li><a class="dropdown-item" href="/category/home-care">Home Care</a></li>
                    <li><a class="dropdown-item" href="/category/baby-kid">Baby & Kid</a></li>
                </ul>
            </div>
            <a href="/user/2341720169/name/Dimas Adi Bayu Samudra" class="nav-link d-inline">User Profile</a>
            <a href="/sales" class="nav-link d-inline">Sales</a>
        </div>
    </div>
</nav>
<div class="container mt-4">
    @yield('content')
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>