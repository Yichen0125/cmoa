<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script type="text/javascript">
		$(function(){
			
			$("#new").click(function(){
				window.location.href="${ctp}" + "/system/group/emp/toUserAddUI";
				return false;
			});
			
			$("img[id^='update-']").click(function(){
				var id = this.id.split("-")[1];
				
				window.location.href = "${ctp}/system/group/emp/toEditUI/"+id;
			})
			$("img[id^='delete-']").click(function(){
				var id = this.id.split("-")[1];
				
				window.location.href = "${ctp}/system/group/emp/toDeleteUI/"+id;
				
			})
			
			/* $("img[id^='delete-']").click(function(){
				
				var flag = confirm("确认删除吗");
				if(flag){
					var id = this.id.split("-")[1];
					var thisImg = $(this);
					
					var url = "${ctp}/system/group/emp/delete/"+id;
					var args = {"_method":"DELETE","time":new Date()};
					
					$.post(url,args,function(data){
						if(data == "1"){
							alert("删除成功");
							thisImg.parent().parent().remove();
						}
						
					});
				}
			}) */
		})
	</script>
</head>

<body class="main">
	<form action="${ctp }/system/group/emp/list">
		<div class="page_title">
			用户管理
		</div>
		<div class="button_bar">
			<button class="common_button" id="new">新建</button>
			<button class="common_button" onclick="document.forms[1].submit();">
				查询
			</button>
		</div>
		
		<table class="query_form_table" border="0" cellPadding="3"
			cellSpacing="0">
			<tr>
				<th class="input_title">
					用户名
				</th>
				<td class="input_content">
					<input type="text" name="search_LIKES_empName" value="${param.search_LIKES_empName }"/>
				</td>
				<th class="input_title">
					部门
				</th>
				<td class="input_content">
					<select name="search_EQS_deptName">
						<option value="">
							全部
						</option>
						<c:forEach items="${deptList }" var="dept">
							<option>
								${dept.deptName }
							</option>
						</c:forEach>
					</select>
				<%-- 	<select name="search_EQS_enabled" >
						<option value="1" <c:if test="${param.search_EQS_enabled == 1 }">
							selected="selected"
						</c:if> >
							有效
						</option>
						<option value="0" <c:if test="${param.search_EQS_enabled == 0 && !empty param.search_EQS_enabled}">
							selected="selected"
						</c:if> >
							无效
						</option>
					</select> --%>
				</td>
			</tr>
		</table>
		<!-- 列表数据 -->
		<br />
		
		<c:if test="${empList != null && totalElements > 0 }">
			<table class="data_list_table" border="0" cellPadding="3"
				cellSpacing="0" align="center">
				<tr>
					<th class="data_title" style="width: 10px;">
						员工编号
					</th>
					<th class="data_title" style="width: 15%;">
						员工姓名
					</th>
					<th class="data_title" style="width: 15%;">
						部门
					</th>
					<th class="data_title" style="width: 2%;">
						性别
					</th>
					<th class="data_title" style="width: 18%;">
						手机
					</th>
					<th class="data_title" style="width: 18%;">
						邮箱
					</th>
					<th class="data_title" style="width: 20%;">
						入职时间
					</th>
					<th class="data_title">
						操作
					</th>
				</tr>
				<c:forEach var="emp" items="${empList }">
					<tr>
						<td class="data_cell" style="text-align: right; padding: 0 10px;">
						${emp.empNum}
						</td>
						<td id="nameLable" class="data_cell" style="text-align: center;">
						${emp.nameCh}
						</td>
						<td class="data_cell">
						${emp.dept.deptName }
						</td>
						<td class="data_cell" align="center">
							<c:if test="${emp.sex }">
								男
							</c:if>
							<c:if test="${!emp.sex }">
								女
							</c:if>
						</td>
						<td class="data_cell">
						${emp.phone }
						</td>
						<td class="data_cell">
						${emp.email }
						</td>
						<td class="data_cell">
							<fmt:formatDate value="${emp.entryDate }"/>
						</td>
						<td class="data_cell">
							<img id="delete-${emp.id}"
								title="删除" src="${ctp }/static/images/bt_del.gif" class="op_button"/>
							<img id="update-${emp.id}"
								class="op_button" src="${ctp }/static/images/bt_edit.gif" title="编辑" />
						</td>
					</tr>
				</c:forEach>
			</table>
		<%@include file="/commons/pageHelper.jsp" %>
		</c:if>
		<c:if test="${empList == null ||totalElements == 0 }">
			没有任何数据
		</c:if>
	</form>
</body>
</html>
