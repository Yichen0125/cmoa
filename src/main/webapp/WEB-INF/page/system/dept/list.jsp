<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script type="text/javascript">
		$(function(){
			
			$("#new").click(function(){
				window.location.href="${ctp}" + "/system/group/dept/toAddUI";
				return false;
			});
			
			$("img[id^='update-']").click(function(){
				var id = this.id.split("-")[1];
				
				window.location.href = "${ctp}/system/group/dept/toEditUI/"+id;
			})
			
			$("img[id^='delete-']").click(function(){
				
				var flag = confirm("确认删除吗");
				if(flag){
					var id = this.id.split("-")[1];
					var thisImg = $(this);
					
					var url = "${ctp}/system/group/dept/delete/"+id;
					var args = {"_method":"DELETE","time":new Date()};
					
					$.post(url,args,function(data){
						if(data == "1"){
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
	<form action="${ctp }/user/list">
		<div class="page_title">
			部门管理
		</div>
		<div class="button_bar">
			<button class="common_button" id="new">新建</button>
		</div>
		<!-- 列表数据 -->
		<br />
		<c:if test="${deptList != null && totalElements > 0 }">
			<table class="data_list_table" border="0" cellPadding="3"
				cellSpacing="0">
				<tr>
					<th class="data_title" style="width: 20px;">
						编号
					</th>
					<th class="data_title" style="width: 30%;">
						部门名称
					</th>
					<th class="data_title" style="width: 10%;">
						负责人
					</th>
					<th class="data_title" style="width: 30%;">
						描述
					</th>
					<th class="data_title" style="width: 20%;">
						创建时间
					</th>
					<th class="data_title" style="width: 40px;">
						操作
					</th>
				</tr>
				
				<c:forEach var="dept" items="${deptList }">
					<tr>
						<td class="data_cell" style="text-align: right; padding: 0 10px;">
						${dept.deptNum}
						</td>
						<td id="nameLable" class="data_cell" style="text-align: center;">
						${dept.deptName}
						</td>
						<td class="data_cell">
						${dept.createUsername}
						</td>
						<td class="data_cell">
						${dept.desp}
						</td>
						<td class="data_cell">
							<fmt:formatDate value="${dept.createTime}"/>
						</td>
						
						<td class="data_cell">
							<img id="delete-${dept.id}"
								title="删除" src="${ctp }/static/images/bt_del.gif" class="op_button" />
							<img id="update-${dept.id}"
								class="op_button" src="${ctp }/static/images/bt_edit.gif" title="编辑" />
						</td>
					</tr>
				</c:forEach>
			</table>
			<%-- 
			<%@include file="/commons/pageHelper.jsp" %>
			 --%>
		</c:if>
		<c:if test="${deptList == null ||totalElements == 0 }">
			没有任何数据
		</c:if>
	</form>
</body>
</html>
