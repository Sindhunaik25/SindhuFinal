<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<style>
body {
	background-image: url(pics/colo.jpeg);
	font-color
	="red";
}

.color {
	color: antiquewhite;
}
</style>

</head>
<header align='center'>
	<img src="pics/logo1.jpg" alt="logo" width="300" height=150">
</header>
<body>
	<div class="color">
		<table border="0" width="480px" cellpadding="0" cellspacing="0"
			align="center">
			<center>
				<tr>
					<td><h1 align='center'>User Login</h1></td>
				</tr>
				<form action="login" method="post">
					<table border='0' width='480px' cellpadding='0' cellspacing='0'
						align='center'>
						<h2 align="center"> ${invalidMessage}
								<br>
								${existingUser} </h2>
						<tr>
							<td align='center'><i>Email Id:</i></td>
							<td><input type='email' name="email"
								placeholder='enter email' required></td>
						</tr>

						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align='center'><i>Password:</i></td>
							<td><input type='password' name="password"
								placeholder='enter password' required></td>
						</tr>

						<table border='0' cellpadding='0' cellspacing='0' width='48px'
							align='center'>

							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'><input type="submit" value="Login"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>

							<tr>
								<td align='center'><b> New User? </b><a href="register.jsp">click
										here</a></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<td align='center'>
								<!-- <img src="pics/register.jpg" alt="logo" width="500" height=300"> -->
								
								</form>
								</center>
						</table>
						</div>
</body>
</html>
