<%--
  Created by IntelliJ IDEA.
  User: T14
  Date: 10/12/2024
  Time: 2:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cap nhat thong tin</title>
</head>
<body>
<h1>Cap nhat thong tin nhan vien</h1>
<form action="/employee?action=update&id=${employee.id}" method="post">
   <pre>
        <label>Ho va ten</label>
    <input type="text" name="name" value="${employee.name}" placeholder="Nhap ho va ten" required>
        <label>Tuoi</label>
    <input type="text" name="age" value="${employee.age}" placeholder="Nhap tuoi" required>
        <label>Chuc vu</label>
    <input type="text" name="role" value="${employee.role}" placeholder="Nhap chuc vu" required>
        <label>Phong ban</label>
    <input type="text" name="department" value="${employee.department}" placeholder="Nhap phong ban" required>
       <label>Luong</label>
    <input type="text" name="salary" value="${employee.salary}" placeholder="Nhap luong" required>
        <input type="submit" value="Cap nhat">
   </pre>
</form>
</body>
</html>
