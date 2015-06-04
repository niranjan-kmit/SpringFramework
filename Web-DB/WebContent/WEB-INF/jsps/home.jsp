<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="${name}"></c:out> <p/>

<sql:query var="rs" dataSource="jdbc/jobsadda">
select id,company,place from jobsadda
</sql:query>

<c:forEach var="row" items="name">
    ID: ${row.id}<br/>
    Name: ${row.company}<br/>
    Place: ${row.place}<br/>
    
</c:forEach>

</body>
</html>