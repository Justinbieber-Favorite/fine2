<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>

<body style="width:1000px; margin:0px auto;" onload="chanclo()">
<div style="width:1000px; text-align:center">
    <h2>回复信息列表</h2>
</div>
<form id="search" action="${pageContext.request.contextPath}/detail" method="post">
    <div style="text-align:right; width:900px">
        <a href="${pageContext.request.contextPath}/readd?invid=${sessionScope.id}">添加回复</a>
        <a href="${pageContext.request.contextPath}/list">返回帖子列表</a>
        <input type="hidden" name="pageNo" id="pageNo" value="1">
        <input type="hidden" name="invid" id="invid" value="${requestScope.id}">
    </div>
</form>
<div style="text-align:center; width:1000px"></div>
<table width="1000" border="1" cellspacing="0">
    <tr>
        <th width="82" scope="col">回复内容</th>
        <th width="141" scope="col">回复昵称</th>
        <th width="161" scope="col">发布时间</th>
    </tr>

<%--    model.addAttribute("reply",replydetails);
    model.addAttribute("vid",vid);--%>
    <c:if test="${requestScope.info.list!=null}">
        <c:forEach items="${requestScope.info.list}" var="db">
            <tr align="center">
                <td>${db.content}</td>
                <td>${db.replyauthor}</td>
                <td> <fmt:formatDate value="${db.recreatdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
            </tr>
        </c:forEach>
    </c:if>

    <tr>
        <td colspan="4" align="center"><h3>
            <a href="javascript:do_page(1)">首页</a>
            <a href="javascript:do_page(${requestScope.info.pageNum-1})">上一页</a>
            <a href="javascript:do_page(${requestScope.info.pageNum+1})">下一页</a>
            <a href="javascript:do_page(${requestScope.info.pages})">末页</a>
            ${requestScope.info.pageNum}/${requestScope.info.pages}页
        </h3>
        </td>
    </tr>
</table>

</body>
<script type="application/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="application/javascript" src="js/jquery.form.js"></script>
<script type="application/javascript">
    function do_page(pno) {
        $("#pageNo").val(pno);
        $("#search").submit();
    }

    function chanclo() {
//获取标签
        var arr = document.getElementsByTagName("tr");
//for循环实现换色
        for (i = 1; i< arr.length ; i++) {
//如果行数为偶数，背景颜色变为X色
            if (i % 2 == 0) {
                arr[i].style.background="orange" ;
            }
//如果行数为奇数，背景颜色变为Y色
            else {
                arr[i].style.backgroundColor = "pink";
            }
        }
    }

</script>
</html>
