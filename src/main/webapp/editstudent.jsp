<%@page import="com.entity.Student"%>
<%@page import="com.DbConnect.DBConnect"%>

<%@page import="com.Dao.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg-light">
<%@include file="navbar.jsp" %>
<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Edit Student</p>
							<%
							
							
							int id = Integer.parseInt(request.getParameter("id"));
							StudentDAO dao1= new StudentDAO(DBConnect.getCon());
							Student s=dao1.getstudentByid(id);
							%>
						
						<form action="updates" method="post">
						<div class="mb-3">
								<label class="form-label">Full Name</label><input
									required="required" name="name" type="text" value="<%=s.getFullName() %>"
									class="form-control">

							</div>
							
							<div class="mb-3">
								<label class="form-label">DOB</label><input
									required="required" name="dob" type="date" value=<%=s.getDate() %>
									class="form-control">

							</div>
							

							<div class="mb-3">
								<label class="form-label">Address</label><input
									required="required" name="address" type="text" value=<%=s.getAddress() %>
									class="form-control">
									
 
							</div>
							
							<div class="mb-3">
								<label class="form-label">Qualification</label><input
									required="required" name="qualification" type="text" value=<%=s.getQualification() %>
									class="form-control">
									
 
							</div>
							
							
							
							<div class="mb-3">
								<label class="form-label">Email</label><input
									required="required" name="email" type="email" value=<%=s.getEmail() %>
									class="form-control">

							</div>
							
							<input type="hidden" name="id" value="<%=s.getId()%>">
							<button type="submit" class="btn bg-primary text-white  col-md-12">Edit</button>
							
						</form>
						
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>