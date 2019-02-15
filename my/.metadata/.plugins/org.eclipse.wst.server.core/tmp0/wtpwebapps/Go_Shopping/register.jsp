<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<header align="center"> <img src="pics/logo1.jpg" alt="logo"
	width="300" height=150"></header>

<body>
	<div class="color">
		<table border='0' width='480px' cellpadding='0' cellspacing='0'
			align='center'>
			<center>
				<tr>
					<td><h1 align="center">User Signup</h1></td>
				</tr>
				<form method="post" action="register">
					<table border='0' width='480px' cellpadding='0' cellspacing='0'
						align='center'>
						<tr>
							<td align='center'><b><i>User Name:</i></b></td>
							<td><input type='text' name='name' placeholder='enter name'
								required></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>

						<td align='center'><b><i>Email:</i></b></td>
						<td><input type='email' name='email'
							placeholder='enter email' required
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align='center'><b><i>Password:</i></b></td>
							<td><input type='password' name='Password'
								placeholder='enter password' required
								pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
								title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td align='center'><b><i>Phone:</i></b></td>
							<td><input type='text' name='Phone'
								placeholder='Phone number' required pattern="[0-9]{10}"
								title="Phone Number should be of 10 digits"></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
						</tr>
						<table border='0' cellpadding='0' cellspacing='0' width='480px'
							align='center'>
							<tr>
								<td align='center'><input type='submit' name='REGISTER'
									value="Register"></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td align='center'><b>Existing User?</b><br> <a
									target="_blank" href="login.jsp">click here</a></td>
							</tr>
							<tr>
								<td>&nbsp;</td>
							</tr>


							</form>
							</center>
						</table>
						</div>
</body>
</html>