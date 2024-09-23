<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<thead>
<tr>
<th> BookID</th>
<th>BookName</th>
<th>BookPrice</th></tr></thead>
<tbody>
   <c:forEach items="${books}" var="booklist">
   <tr> 
     <td>${booklist.bookId}</td>
     <td>${booklist.bookName}</td>
     <td>${booklist.bookPrice}</td>
     </tr>
     </c:forEach>
     </tbody>

</table>
</body>
</html>