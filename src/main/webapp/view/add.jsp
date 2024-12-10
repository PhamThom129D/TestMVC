<%--
  Created by IntelliJ IDEA.
  User: T14
  Date: 10/12/2024
  Time: 2:23 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Them nhan vien</title>
</head>
<body>
<h1>Them nhan vien moi</h1>
<form action="/employee?action=add" method="post">
   <pre>
        <label>Ho va ten</label>
    <input type="text" name="name" placeholder="Nhap ho va ten" required>
        <label>Tuoi</label>
    <input type="number" name="age" min="0" placeholder="Nhap tuoi" required>
        <label>Chuc vu</label>
    <input type="text" name="role" placeholder="Nhap chuc vu" required>
        <label>Phong ban</label>
    <input type="text" name="department" placeholder="Nhap phong ban" required>
       <label>Luong</label>
    <input type="number" min="0" step="any" name="salary" placeholder="Nhap luong" required>
        <input type="submit" value="Them">
   </pre>
</form>

</body>
</html>
