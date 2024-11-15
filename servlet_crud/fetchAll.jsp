<%@page import="servlet_crud.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<StudentDto> l= (List<StudentDto>) request.getAttribute("k");%>
<table>
<tr>
<th>email</th>
<th>name</th>
<th>mobile</th>
<th>password</th>
<th>gender</th>
<th>country</th>
<th>delete</th>
<th>update</th>
</tr>
<%for(StudentDto s:l){%>
<tr>
<td><%=s.getEmail()%></td>
<td><%=s.getName()%></td>
<td><%=s.getMobile()%></td>
<td><%=s.getPassword()%></td>
<td><%=s.getGender()%></td>
<td><%=s.getCountry()%></td>
<td><a href="did?pk=<%=s.getEmail()%>">delete</a></td>
<td><a href="update.jsp?email=<%=s.getEmail()%>&&name=<%=s.getName()%>&&mobile=<%=s.getMobile()%>&&password=<%=s.getPassword()%>">update</a></td>
</tr>
<%}%>
</table>
</body>
</html>