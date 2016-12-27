<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<br>
<center>
<table border="1" cellpadding="10" cellspacing="0">
	<tr>
					<td>
						项目编号
					</td>
					<td>
						文件列表
					</td>
					<td>
						负责人
					</td>
					<td>
						执行状态
					</td>
					<td>
						转码状态
					</td>
					<td>
						创建时间
					</td>
					<td>
						要求
					</td>
					<td>
						描述
					</td>
					<td colspan="2" align="center">
						操作
					</td>
			</tr>
			<c:forEach items="${mediaList }" var="media">
			<tr>
					<td>
						${media.project.pronum }
					</td>
					<td>
						${media.title }
					</td>
					<td>
						${media.project.user.name }
					</td>
					<td>
						<c:if test="${media.project.status == 0 }">未执行</c:if>
						<c:if test="${media.project.status == 1 }">翻译</c:if>
						<c:if test="${media.project.status == 2 }">审校</c:if>
						<c:if test="${media.project.status == 3 }">排版</c:if>
						<c:if test="${media.project.status == 4 }">审核</c:if>
						<c:if test="${media.project.status == 5 }">完成</c:if>
					</td>
					<td>
						<c:if test="${media.convert == true }">已转码</c:if>
						<c:if test="${!media.convert == true }">未转码</c:if>
					</td>
					<td>
						<fmt:formatDate value="${media.uptime }" />
					</td>
					<td>
						${media.project.yq }
					</td>
					<td>
						${media.descript }
					</td>
					<td colspan="2" align="center">
						<c:if test="${media.convert == true }">
							<a href="${ctp }/xm/pro/showMedia/${media.id }">查看</a>
						</c:if>
						<c:if test="${!media.convert == true }">
							未转码
						</c:if>
					</td>
			</tr>
			</c:forEach>
</table>
<a href="${ctp }/xm/pro/list">返回</a>
</center>
</body>
</html>