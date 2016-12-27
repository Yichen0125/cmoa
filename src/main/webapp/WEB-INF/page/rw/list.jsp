<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script type="text/javascript">
		$(function(){
			
			$(".xxBtn").click(function(){
				var id = $(this).next(":hidden").val();
				window.location.href="${ctp }/xm/pro/rw/list/"+id;
				return false;
			})
			
			$("#new").click(function(){
				window.location.href="${ctp}" + "/user/toAddUI";
				return false;
			});
			
			$("img[id^='update-']").click(function(){
				var id = this.id.split("-")[1];
				
				window.location.href = "${ctp}/user/toEditUI/"+id;
			})
			
			$("img[id^='delete-']").click(function(){
				
				var flag = confirm("确认删除吗");
				if(flag){
					var id = this.id.split("-")[1];
					var thisImg = $(this);
					
					var url = "${ctp}/xm/pro/delete/"+id;
					var args = {"_method":"DELETE","time":new Date()};
					
					$.post(url,args,function(data){
						if(data == 1){
							alert("删除成功");
							thisImg.parent().parent().remove();
						}
						
					});
				}
			})
		})
	</script>
</head>

<body class="main">
<center>
	<form action="${ctp }/xm/pro/rw/list">
	<br>
	<br>
	<br>
	<br>
	
	<br>
	<br>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
				<th>
					项目名称	
				</th>
				<td>
					<input type="text" name="search_LIKES_title" value="${param.search_LIKES_title }"/>
				</td>
				<td colspan="5" align="center">
				<button class="common_button">
			<!-- 	 onclick="document.forms[1].submit();" -->
				查询
				</button>
				</td>
		</tr>
		<tr>
					<th>
						任务名称
					</th>
					<th>
						所属项目
					</th>
					<th>
						任务描述
					</th>
					
					<th>
						执行状态
					</th>
					
					<th>
						要求
					</th>
					<th>
						创建时间
					</th>
					<th align="center">
						操作
					</th>
			</tr>
			<c:if test="${empty mediaList }">
				<tr>
					<td colspan="7">暂时没有项目</td>
				</tr>
			</c:if>
			<c:if test="${!empty mediaList }">
				<c:forEach var="media" items="${mediaList }">
					<tr>
						<%-- <td>
						${media.id}
						</td> --%>
						<td>
						${media.title}
						</td>
						<td>
						${media.project.pronum}
						</td>
						<td>
						${media.descript}
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
						${media.project.yq}
						</td>
						<td>
							<fmt:formatDate value="${media.uptime }"/>
						</td>
						<td>
							<c:if test="${media.convert == true }">
							<a href="${ctp }/xm/pro/showMedia/${media.id }">查看</a>
						</c:if>
						<c:if test="${!media.convert == true }">
							未转码
						</c:if>
						</td>
					</tr>
					
				</c:forEach>
			</c:if>
					<tr align="center">
						<td colspan="8" align="center">
							<%@include file="/commons/pageHelper.jsp" %>
						</td>
					</tr>
	</table>

	</form>
</center>
</body>
</html>
