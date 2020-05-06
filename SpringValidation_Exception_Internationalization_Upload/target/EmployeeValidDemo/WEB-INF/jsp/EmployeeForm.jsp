<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE HTML>
<html>
<head>
	<meta charset="utf-8">
<title>Add Employee Form</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/main.css"/>">
</head>
<body>

	<div id="global">
		<a href="?language=en_US">English</a>|
		<a href="?language=vi_VN">Vietnamese</a>
		<form:form modelAttribute="employee" action="employee" method="POST" enctype="multipart/form-data">
			<fieldset>
				<legend><spring:message code="title" text="Default Title" /></legend>
				<p>
					<form:errors path="*" cssStyle="color : red;" />
				</p>
				<p>
					<label for="id"><spring:message code="Id" text="Default Id" /> </label>
					<form:input path="id" id="id" />
					<div style="text-align: center;">
						<form:errors path="id" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="firstName"><spring:message code="FirstName" text="Default First Name" /> </label>
					<form:input path="firstName" />
					<div style="text-align: center;">
						<form:errors path="firstName" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="lastName"><spring:message code="LastName" text="Default lastName" /> </label>
					<form:input path="lastName" />
					<div style="text-align: center;">
						<form:errors path="lastName" cssStyle="color : red;" />
					</div>
				</p>

				<p>
					<label for="birthDate"><spring:message code="DateOfBirth" text="Default Date Of Birth" /> </label>
					<form:input path="birthDate" id="birthDate" />
					<form:errors path="birthDate" cssStyle="color : red;" />
				</p>
				<p>
					<label for="salaryLevel"><spring:message code="Salary" text="Default Salary" /> </label>
					<form:input path="salaryLevel" id="salaryLevel" />
					<div style="text-align: center;">
						<form:errors path="salaryLevel" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<form:input  id="employeeImage" path="employeeImage" type="file"></form:input>
				</p>
				<h4>Address:</h4>
				<p>
					<label for="street"><spring:message code="Street" text="Default Street" /> </label>
					<form:input path="address.street" id="street" />
					<div style="text-align: center;">
						<form:errors path="address.street" cssStyle="color : red;" />
					</div>
				</p>
				<p>
					<label for="state"><spring:message code="State" text="Default State" /></label>
					<form:input path="address.state" id="state" />
					<div style="text-align: center;">
						<form:errors path="address.state" cssStyle="color : red; " />
					</div>
				</p>
				<p>
					<label for="zipCode"><spring:message code="Zip" text="Default Zip" /> </label>
					<form:input path="address.zipCode" id="zipCode" />
					<div style="text-align: center;">
						<form:errors path="address.zipCode" cssStyle="color : red; " />
					</div>
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4"> 
					<input id="submit" type="submit" tabindex="5" value="Add Employee">
				</p>
			</fieldset>
		</form:form>
	</div>
</body>
</html>
