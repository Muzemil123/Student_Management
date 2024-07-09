<%@page import="com.entity.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.Dao.StudentDAO"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<%@page import="com.DbConnect.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="allcss.jsp"%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg-light">
	<%@include file="navbar.jsp"%>


	<div class="container p-4">
		<div class="card">
			<div class="card-body">

				<p class="text-center fs-2">All Student details</p>
				<c:if test="${not empty sucMsg}">
					<p class="text-center text-success">${sucMsg}</p>
					<c:remove var="sucMsg" />
				</c:if>
				<c:if test="${not empty errMsg}">
					<p class="text-center text-success">${errMsg}</p>
					<c:remove var="errMsg" />
				</c:if>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Full Name</th>
							<th scope="col">DOB</th>
							<th scope="col">Address</th>
							<th scope="col">Qualification</th>
							<th scope="col">Email</th>
							<th scope="col">Action</th>

						</tr>
					</thead>
					<tbody>
						<%
						StudentDAO dao = new StudentDAO(DBConnect.getCon());
						List<Student> list = dao.getAllStudent();

						for (Student s : list) {
						%>
						<tr>
							<th scope="row"><%=s.getFullName()%></th>
							<td><%=s.getDate()%></td>
							<td><%=s.getAddress()%></td>
							<td><%=s.getQualification()%></td>
							<td><%=s.getEmail()%></td>

							<td><a href="editstudent.jsp?id=<%=s.getId()%>"
								class="btn btn-sm bg-primary">Edit</a> <a href="delete?id=<%=s.getId()%>"
								class="btn btn-sm bg-danger">Delete</a></td>
						</tr>

						<%
						}
						%>


					</tbody>
				</table>

			</div>
		</div>
	</div>

</body>
</html>