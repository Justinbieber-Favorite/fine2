<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
</head>

<body style="width:1000px; margin:0px auto;" onload="chanclo()">
<div style="width:1000px; text-align:center">
    <h2>帖子列表</h2>
</div>
<form id="search" action="${pageContext.request.contextPath}/list" method="post">
    <div style="text-align:center; width:900px">帖子标题：

        <input name="title" type="text" id="title" size="10" value="${requestScope.check.title}"/>
        <input type="hidden" name="pageNo" id="pageNo" value="1">
        <input type="submit" name="btnsearch" id="btnsearch" value="搜索" />
    </div>
</form>
<div style="text-align:center; width:1000px"></div>
<table width="1000" border="1" cellspacing="0">
    <tr>
        <th width="151" scope="col">标题</th>
        <th width="245" scope="col">内容摘要</th>
        <th width="182" scope="col">作者</th>
        <th width="279" scope="col">发布时间</th>
        <th colspan="2" scope="col">更多操作</th>
    </tr>
    <c:if test="${requestScope.info.list!=null}">
        <c:forEach items="${requestScope.info.list}" var="db">
            <tr align="center">
                <td>${db.title}</td>
                <td>${db.summary}</td>
                <td>${db.author}</td>
                <td> <fmt:formatDate value="${db.creatdate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                <td width="${pageContext.request.contextPath}/detail?id=${db.id}">
                    <a href="${pageContext.request.contextPath}/detail?id=${db.id}">查看回复</a></td>
                <td width="javascript:do_delete(${db.id})"><a href="javascript:do_delete(${db.id})">删除</a></td>
            </tr>
        </c:forEach>
    </c:if>

    <tr>
        <td colspan="7" align="center"><h3>
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
    function do_delete(id) {
        if(confirm("确认删除该条发帖及相关内容？")){
            location.href="${pageContext.request.contextPath}/delete?id="+id;
        }

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
