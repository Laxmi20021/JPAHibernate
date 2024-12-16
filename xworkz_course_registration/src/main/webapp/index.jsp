<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <title>SIGNUP-Xworkz</title>

    <style>
        body {
            background-color: rgba(140, 209, 70, 0.727);
            color: black;
            font-family: apple-system, sans-serif;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .form-container {
            background-image: url('https://img.freepik.com/free-photo/green-ball-green-ball-with-word-it_1340-35545.jpg?t=st=1734161206~exp=1734164806~hmac=5bea8daad46b496fb756f803b1219beb69f8e51f0564c484cf9f17a070af4fda&w=740');
            background-color: #97ff48da;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.5);
            width: 100%;
            max-width: 400px;
        }

        .form-container h3 {
            color: #f9f9f9;
            text-align: center;
            text-shadow: 2px 2px 4px #000;
            margin-bottom: 20px;
        }

        .form-container h2 {
            font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
            color: #38c316;
            text-align: center;
            text-shadow: 3px 3px 5px #000000df;
            margin-bottom: 20px;
        }

        .form-control {
            background-color: #dcf4b0e1;
            border: 1px solid #84ff00;
            color: white;
            border-radius: 5px;
        }

        .form-control:focus {
            border-color: #bbf44ac2;
            box-shadow: 0 0 5px rgba(147, 226, 50, 0.5);
        }

        .form-group {
            margin-bottom: 15px;
        }

        .btn-success{
            width: 100%;
        }
        </style>
</head>

<body>
    <div class="form-container">

        <h2>Welcome to Sign Up</h2>
        <h3>Enter your details</h3>
        <form action="signup" method="post">
            <div class="form-group">
                <input type="text" class="form-control" name="name" placeholder="Enter your name" required>
            </div>

            <div class="form-group">
                <input type="email" class="form-control" name="email" placeholder="Enter your email" required>
            </div>


            <div class="form-group">
                <input type="text" class="form-control" name="age" placeholder="Enter your age" required>
            </div>

            <div class="form-group">
                <input type="password" class="form-control" name="password" placeholder="Enter your password" required>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="confirmPassword" placeholder="Confirm your password"
                    required>
            </div>

            <div class="form-group">
                <button type="submit" class="btn btn-success">SIGN UP</button>
            </div>
        </form>

        <c:if test="${not empty failure}">
            <div class="error">${failure}</div>
        </c:if>

        <c:if test="${not empty success}">
            <div class="success">${success}</div>
        </c:if>
    </div>
</body>

</html>