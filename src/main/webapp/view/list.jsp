<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: T14
  Date: 10/12/2024
  Time: 2:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sach nhan vien</title>
</head>
<body>
<h1>Danh sach nhan vien</h1>
<div>
    <form action="/employee?action=search" method="Get">
        <input type="text" name="keyword">
        <input type="submit" value="Search">
    </form>
</div>
<div>
    <a href="/employee?action=add">
        <button>Them nhan vien moi</button>
    </a>
</div>
<div>
    <table border="1">
        <tr>
            <td>Ma nhan vien</td>
            <td>Ho va ten</td>
            <td>Tuoi</td>
            <td>Chuc vu</td>
            <td>Phong ban</td>
            <td>Luong</td>
            <td>Hanh dong</td>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.age}</td>
                <td>${employee.role}</td>
                <td>${employee.department}</td>
                <td>${employee.salary}</td>
                <td>
                    <a href="/employee?action=update&id=${employee.id}">Sua thong tin</a><br>
                    <a href="/employee?action=delete&id=${employee.id}">Xoa nhan vien</a><br>
                    <a href="/employee?action=view&id=${employee.id}">Xem thong tin</a>
                </td>

            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
