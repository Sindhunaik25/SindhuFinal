<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head></head>
<body bgcolor="aqua" >
 
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<center><tr>
 <td><h1 align="center" >User Login</h1></td>
</tr>
 <form action="login" method="post">
<table border='0' width='480px' cellpadding='0' cellspacing='0' align='center'>
<tr>
    <td align='center'><i>User Name:</i></td>
    <td><input type='text' name="name" placeholder='enter name' required></td>
</tr>
<!-- <tr> <td>&nbsp;</td> </tr>

    <td align='center'><i>Email:</i></td>
    <td><input type='text' name='name' placeholder='enter email' required></td>
</tr> -->
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'><i>Password:</i></td>
    <td><input type='password' name="password" placeholder='enter password' required></td>
</tr>

<table border='0' cellpadding='0' cellspacing='0' width='48px' align='center'>

<tr> <td>&nbsp;</td> </tr>
<tr>
<td align='center' ><input type="submit" value="Login"></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<tr>
<td align='center' >
<b> New User? </b><input type='submit' name='REGISTER' value="Register"></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<td align='center'>
<img src="register.jpg" alt="logo" width="500" height=300">
</form>
</center>
</table>
</body>
</html>