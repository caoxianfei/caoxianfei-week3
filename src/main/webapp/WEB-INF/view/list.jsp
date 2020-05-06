<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/css/index3.css" rel="stylesheet">
</head>
<body>
	
	<form action="list.do" method="post">
	
	
		
		<table>
					<tr>
							<td colspan="10">
							姓名<input type="text" name="hname" value="${v.hname }">&emsp;       <!-- 模糊查询的所有条件 -->
							手机<input type="text" name="phone" value="${v.phone }">&emsp;
							房型<input type="text" name="name" value="${v.name }">&emsp;
							房价<input type="text" name="f1" value="${v.f1 }">-<input type="text" name="f2" value="${v.f2 }">&emsp;
							日期<input type="text" name="t1" value="${v.t1 }">-<input type="text" name="t2" value="${v.t2 }">&emsp;
								<input type="submit" value="查询">
							</td>
					</tr>
				<tr>
						<td colspan="10">
							<a href="adds.do">添加一百条数据</a>
							<a href="add.do">新增一条信息</a>
						</td>
				</tr>
				<tr>
						<td>预定日期</td>
						<td>姓名</td>
						<td>手机</td>
						<td>房型</td>
						<td>房价</td>
						<td>备注</td>
				</tr>
				<c:forEach items="${list }" var="c">
						<tr>
								
								<td><fmt:formatDate value="${c.htime }" pattern="yyyy-MM-dd"/></td>
								<td>${c.hname }</td>
								<td>${c.phone }</td>
								<td>${c.name }</td>
								<td>${c.price }</td>
								<td>${c.scope }</td>
						</tr>
				</c:forEach>
				<tr>
						<td colspan="10">
								当前第${info.pageNum }/${info.pages }页,共${info.total }条数据      <!-- 分页查询 -->
								<button name="pageNum" value="1">首页</button>
								<button name="pageNum" value="${info.prePage==0?1:info.prePage }">上一页</button>
								<button name="pageNum" value="${info.nextPage==0?info.pages:info.nextPage }">下一页</button>
								<button name="pageNum" value="${info.pages }">尾页</button>
						</td>
				</tr>
		</table>
		
		</form>	
			
</body>
</html>