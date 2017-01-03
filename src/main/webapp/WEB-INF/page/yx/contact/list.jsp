<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script type="text/javascript">
		$(function(){
			
			$("#new").click(function(){
				window.location.href="${ctp}" + "/yx/contact/toAddUI";
				return false;
			});
			
			$("img[id^='update-']").click(function(){
				var id = this.id.split("-")[1];
				
				window.location.href = "${ctp}/yx/customer/toEditUI/"+id;
			})
			
			$("img[id^='delete-']").click(function(){
				
				var flag = confirm("确认删除吗");
				if(flag){
					var id = this.id.split("-")[1];
					var thisImg = $(this);
					
					 var url = "${ctp}/yx/customer/delete/"+id+"/${pageInfo.pageNum}";
					
					$("#hiddenForm").attr("action",url);
					$("#_method").val("DELETE");
					$("#hiddenForm").submit();
					return false;
				}
			})
		})
	</script>
</head>

<body class="main">
	<form action="${ctp }/yx/customer/list">
		<div class="page_title">
			联系人管理
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
					联系人姓名
				</th>
				<td class="input_content">
					<input type="text" name="search_LIKES_cusNameZh" value="${param.search_LIKES_cusNameZh }"/>
				</td>
				<th class="input_title">
					联系人电话
				</th>
				<td class="input_content">
					<input type="text" name="search_LIKES_cusNameEn" value="${param.search_LIKES_cusNameEn }"/>
				</td>
				
			</tr>
		</table>
		<!-- 列表数据 -->
		<br />
		
		<c:if test="${contactList != null && totalElements > 0 }">
			<table class="data_list_table" border="0" cellPadding="3"
				cellSpacing="0">
				<tr>
					<th class="data_title" style="width: 40px;">
						编号
					</th>
					<th class="data_title" style="width: 50%;">
						联系人姓名
					</th>
					<th class="data_title" style="width: 50%;">
						性别
					</th>
					<th class="data_title" style="width: 20%;">
						联系人电话
					</th>
					<th class="data_title" style="width: 20%;">
						邮箱
					</th>
					<th class="data_title">
						操作
					</th>
				</tr>
				<c:forEach var="con" items="${contactList }">
					<tr>
						<td class="data_cell" style="text-align: right; padding: 0 10px;">
						${con.num}
						</td>
						<td id="nameLable" class="data_cell" style="text-align: center;">
						${con.ccName}
						</td>
						<td id="nameLable" class="data_cell" style="text-align: center;">
						${con.sex}
						</td>
						<td id="nameLable" class="data_cell" style="text-align: center;">
						${con.ccTel}
						</td>
						<td id="nameLable" class="data_cell" style="text-align: center;">
						${con.ccEmail}
						</td>
						<td class="data_cell"  align="center">
							<img id="delete-${cus.id}"
								title="删除" src="${ctp }/static/images/bt_del.gif" class="op_button" />
							<img id="update-${cus.id}"
								class="op_button" src="${ctp }/static/images/bt_edit.gif" title="编辑" />
						</td>
					</tr>
				</c:forEach>
			</table>
			
			<%@include file="/commons/pageHelper.jsp" %>
			
		</c:if>
		<c:if test="${contactList == null ||totalElements == 0 }">
			没有任何数据
		</c:if>
	</form>
	abcd
</body>
</html>
