<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="up" method="post">
<input type="text" name="sname" value="<%=request.getParameter("name")%>"><br>
<input type="tel" name="smob" value="<%=request.getParameter("mobile")%>"><br>
<input type="hidden" name="semail" value="<%=request.getParameter("email")%>"><br>
<input type="password" name="spwd" disabled="disabled" value="<%=request.getParameter("password")%>"><br>
Male : <input type="radio" name="gender" value="male"><br>
Female : <input type="radio" name="gender" value="female"><br>
<input type="checkbox" name="cb" >Accept Terms and Conditions<br>
<select name="country">
<option>INDIA</option>
<option>GERMANY</option>
<option>THAILAND</option>
<option>SRILANKA</option>
</select><br>
<button>Submit</button>
<button>Cancel</button>
</form>
</body>
</html>