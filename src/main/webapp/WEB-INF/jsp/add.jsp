<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width:500px; margin:0px auto">
    <div style="width:500px">
        <h2 style="text-align:center">添加回复</h2>
    </div>
    <div>
        <form action="${pageContext.request.contextPath}/hhh" method="post">
            <table width="500" border="1" align="center" cellspacing="0">
                <tr>
                    <td width="159" height="85" align="center">回复内容</td>
                    <td width="331" align="center">
                        <input type="hidden" name="invid" value="${re.invid}">
                        <input type="text" name="content" id="content" /></td>
                </tr>
                <tr>
                    <td height="79" align="center">发布时间</td>
                    <td align="center">

                        <input type="date" name="recreatdate" id="recreatdate" /></td>
                </tr>
                <tr>
                    <td height="79" align="center">回复昵称</td>
                    <td align="center">
                        <input type="text" name="replyauthor" id="replyauthor" /></td>
                </tr>
                <tr>
                    <td height="64" colspan="2" align="center"><input type="submit" name="btnadd" id="btnadd" value="提交" />&nbsp;
                        <input type="button" name="btnreset" id="btnreset" value="返回" onclick="history.go(-1)"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>