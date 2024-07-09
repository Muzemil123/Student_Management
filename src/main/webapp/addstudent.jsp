<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  class="bg-light">

<%@include file="navbar.jsp" %>


<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-2 text-center">Add Student</p>
						<c:if test="${not empty sucMsg}">
						<p class="text-center text-success">${sucMsg}</p>
						<c:remove var="sucMsg"/>
						</c:if>
						<c:if test="${not empty errMsg}">
						<p class="text-center text-success">${errMsg}</p>
						<c:remove var="errMsg"/>
						</c:if>
							
						
						<form action="register" method="post">
						<div class="mb-3">
								<label class="form-label">Full Name</label><input
									required="required" name="name" type="text"
									class="form-control">

							</div>
							
							<div class="mb-3">
								<label class="form-label">DOB</label><input
									required="required" name="dob" type="date"
									class="form-control">

							</div>
							

							<div class="mb-3">
								<label class="form-label">Address</label><input
									required="required" name="address" type="text"
									class="form-control">
									
 
							</div>
							
							<div class="mb-3">
								<label class="form-label">Qualification</label><input
									required="required" name="qualification" type="text"
									class="form-control">
									
 
							</div>
							
							
							
							<div class="mb-3">
								<label class="form-label">Email</label><input
									required="required" name="email" type="email"
									class="form-control">

							</div>
							<button type="submit" class="btn bg-primary text-white  col-md-12">Submit</button>
							
						</form>
						
					</div>
				</div>
			</div>
		</div>
	</div>











</body>
</html>