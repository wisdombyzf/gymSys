<%--
  Created by IntelliJ IDEA.
  User: cxyzf
  Date: 2018/4/4
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加队伍</title>
</head>
<body>
<h1>添加队伍</h1>

<form action="admin_addTeam.action" method="post">
    <table>
        <tr>
            <td>队名：</td>
            <td><input type="text" name="teamName"></td>
        </tr>
        <tr>
            <td>队账号：</td>
            <td><input type="text" name="teamAccount"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="teampassword"></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center">
                <input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
