<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

Languages: <a href="<c:url value="/international?locale=en"/>">English</a> | <a href="<c:url value="/international?locale=fr"/>">French</a>

<h2> <spring:message code="title"></spring:message> </h2>

<p> <spring:message code="hello"></spring:message> </p>

<p> <spring:message code="message"></spring:message> </p>