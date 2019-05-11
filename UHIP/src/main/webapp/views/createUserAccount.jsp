<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Under Construction</h2>
	<font color="green">${sucess}</font>
	<font color="green">${failure}</font>
	<form:form action="createUserAccount" method="POST" modelAttribute="userAccountModel">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>

			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="userEmail" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><form:input path="userPwd" type="password"/></td>
			</tr>
			<tr>
				<td>Date of Birth</td>
				<td><form:input path="dob" type="date" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobuttons path="gender" items="${gender}"/></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><form:select path="role" items="${role}"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="reset"></td>
				<td><input type="submit" value="Account Create"></td>
			</tr>
		</table>
</form:form>


</body>
</html>