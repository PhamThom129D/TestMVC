<%--
  Created by IntelliJ IDEA.
  User: T14
  Date: 10/12/2024
  Time: 3:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thong tin chi tiet</title>
</head>
<body>
<h1>Thong tin chi tiet</h1>
<form action="/employee?action=view&id=${employee.id}">
    <p>Ma nhan vien: ${employee.id}</p>
    <p>Ho va ten: ${employee.name}</p>
    <p>Tuoi: ${employee.age}</p>
    <p>Chuc vu: ${employee.role}</p>
    <p>Phong ban: ${employee.department}</p>
    <p>Luong: ${employee.salary}</p>
</form>

</body>
</html>
