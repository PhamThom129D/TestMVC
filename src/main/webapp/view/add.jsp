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
    <input type="text" name="name" placeholder="Nhap ho va ten">
        <label>Tuoi</label>
    <input type="text" name="age" placeholder="Nhap tuoi">
        <label>Chuc vu</label>
    <input type="text" name="role" placeholder="Nhap chuc vu">
        <label>Phong ban</label>
    <input type="text" name="department" placeholder="Nhap phong ban">
       <label>Luong</label>
    <input type="text" name="salary" placeholder="Nhap luong">
        <input type="submit" value="Them">
   </pre>
</form>

</body>
</html>
