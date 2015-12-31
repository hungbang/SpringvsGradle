<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Form Annotation Configuration</h2>
<c:url value="/savePerson" var="url"></c:url>

<form:form action="${url}" commandName="person">
	<form:hidden path="id"/>
	<fieldset>
		<div class="form-group">
			<label for="personName">
				<fmt:message key="form.personName"/>:
			</label>
			
			<form:input path="personName" class="form-control"/>
		</div>
		<div class="form-group">
			<label for="address">
				<fmt:message key="form.address"/>:
			</label>
			<span>
				<form:input path="address"/>
			</span>
		</div>
		<div class="form-group">
			<div>
				<input name="submit" type="submit" value='<fmt:message key="form.button"/>' class="btn btn-primary" />
			</div>
		</div>
		
	</fieldset>
</form:form>


