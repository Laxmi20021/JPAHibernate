<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success-Page</title>
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: rgba(140, 209, 70, 0.727);
            font-family: apple-system, sans-serif;
        }

        .success-container {
            background-image: url('https://img.freepik.com/free-photo/abstract-green-background_23-2151820835.jpg?t=st=1734190541~exp=1734194141~hmac=a729ee3bc7ac57c0ff70feb3916331f5c4d4c8c6451ce4449ece5a94d0b3be34&w=1060');
            max-width: 600px;
            margin: 70px auto;
            padding: 90px;
            border-radius: 8px;
            box-shadow: 0 5px 30px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h2 {

            font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
            color: #38c316;
            text-align: center;
            text-shadow: 3px 3px 5px #000000df;
            margin-bottom: 20px;
        }

        P{
            font-family:'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            font-weight: 1000;
            color: #f2fcefe9;
            text-shadow: 3px 3px 5px #000000df;
        }

        .btn-custom {
            background-color: #00b35fc6;
            color: white;
            padding: 15px 25px;
            text-decoration: none;
            border-radius: 20px;
        }

        .btn-custom:hover {
            background-color: #26fe00e4;
        }
    </style>

</head>

<body>
    <div class="success-container">
        <h2>Successfully SignUp</h2>
        <p>Welcome to the Xworkz</p>

        <a href="Signin.jsp" class="btn-custom">Go to Signin page</a>
    </div>

</body>

</html>