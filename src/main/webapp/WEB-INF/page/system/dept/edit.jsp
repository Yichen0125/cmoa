<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		$(function(){
			$("#save").click(function(){
				var deptName = $("#deptName").val();
				console.log(deptName);
				if (deptName == ""){
					alert("请认真填写");
					return false;
				}
			})
			
			$("#nameselect").value="${dept.isparent}"; 
			
		})
</script>
</head>
<body>
<center>
<br>
<br>
<br>
<br>
	<button class="common_button" onclick="javascript:history.go(-1);">返回</button>

<form action="${ctp }/system/group/dept/update" method="post">
	<input type="hidden" value="${dept.id }" name="id">
	<input type="hidden" value="${dept.ordered }" name="ordered">
	<input type="hidden" value="${dept.createUser }" name="createUser">
	<input type="hidden" value="${dept.delflag }" name="delflag">
	<input type="hidden" name="deptNum" value="${dept.deptNum }"/>
	<table cellpadding="10" cellspacing="0" border="1">
			<tr>
				<td colspan="5"><h3>添加部门</h3></td>
			</tr>
			<tr>
				<td>部门名称：</td>
				<td><input type="text" name="deptName" id="deptName" value="${dept.deptName }"/>&nbsp;&nbsp;*必填</td>
			</tr>
			<tr>
				<td>部门编号：</td>
				<td><input type="text" name="deptNum" value="${dept.deptNum }" disabled="disabled"/></td>
			</tr>
			<tr>
				<td>是否父部门：</td>
				<td>
					<c:if test="${dept.isparent }">
						<input type="radio" name="isparent" checked="checked" />是
						<input type="radio" name="isparent"/>否
					</c:if>
					<c:if test="${!dept.isparent }">
						<input type="radio" name="isparent"/>是
						<input type="radio" name="isparent" checked="checked" />否
					</c:if>
				</td>
			</tr>
			<tr>
				<td>父部门ID：</td>
				<td><input type="text" name="parentid" value="${dept.parentid }"></td>
			</tr>
			
			<tr>
				<td>创建时间：</td>
				<td> 
					<input type="text" value=<fmt:formatDate value="${dept.createTime }" /> disabled="disabled">
					<input type="hidden" name="createTime" value="${dept.createTime }">
				</td>
			
			</tr>
			<tr>
				<td>建档时间：</td>
				<td> 
					<input type="hidden" name="createRTime" value="${dept.createRDate }">
					<input type="text" value=<fmt:formatDate value="${dept.createRDate }" /> disabled="disabled">
				</td>
			</tr>
			
			<tr>
				<td>描述：</td>
				<td><textarea cols="35" rows="4" name="desp" >${dept.desp }</textarea></td>
			</tr>
			<tr>
				<td>部门负责人：</td>
				<td>
        			<select name="createUsername">
        				<c:forEach items="${userList }" var="user">
        					<option <c:if test="${user.name == dept.createUsername}">selected</c:if>>${user.name }</option>
        				</c:forEach>
        			</select>
				</td>
			</tr>
			<tr>
				<td>备注：</td>
				<td>
					<textarea rows="4" cols="35" name="remark" >${dept.remark }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="5" align="center"><input type="submit" value="保存部门" id="save"></td>
			</tr>
	</table>
</form>
</center>
</body>
</html>