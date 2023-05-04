<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<style>
		body {
			background-color: #f2f2f2;
			font-family: Arial, sans-serif;
		}
		
		.container {
			width: 400px;
			margin: 0 auto;
			background-color: #fff;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
		}
		
		h1 {
			text-align: center;
			color: #333;
			margin-bottom: 30px;
		}
		
		label {
			display: block;
			margin-bottom: 10px;
			color: #666;
		}
		
		input[type="text"],
		input[type="password"] {
			width: 100%;
			padding: 10px;
			margin-bottom: 20px;
			border-radius: 5px;
			border: none;
			box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
		}
		
		input[type="submit"] {
			background-color: #333;
			color: #fff;
			padding: 10px 20px;
			border-radius: 5px;
			border: none;
			cursor: pointer;
		}
		
		input[type="submit"]:hover {
			background-color: #555;
		}
	</style>
</head>
<body>
	
	<div class="container">
		<h1>Login</h1>
		<form action="processForm" method="post">
			<label for="username">Username</label>
			<input type="text" id="username" name="username" required>
			
			<label for="password">Password</label>
			<input type="password" id="password" name="password" required>
			
			<input type="submit" value="Login">
		</form>
	</div>
</body>
</html>
