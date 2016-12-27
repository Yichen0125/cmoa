<%@ page language="java" pageEncoding="GBK"%>
<%@ include file="/commons/common.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>�����û�</title>
  </head>
	<script type="text/javascript">
		$(function(){
			
			if("${requestScope.user.id}" != ""){
				$("form:eq(1)").attr("action","${ctp}/user/update");
			}
			$("#EmpButton").click(function(){
				console.log("a");
				$("form:eq(1)").attr("action","${ctp}/system/group/emp/toEmpAddUI");
				$("form:eq(1)").submit();
			})
			
			$("#userName").change(function(){
				var username = $("#userName").val();
				var url = "${ctp }/user/q";
				var args = {"userName":username,"time":new Date()};
				$.post(url,args,function(data){
					console.log(data);
					if(data == "1"){
						$("#errorMessage").html("�û��Ѵ���");
					}
					if(data == "0"){
						$("#errorMessage").html("");
					}
				})
			})
			
		})
	</script>
  <body class="main">
  
  	<form:form action="${ctp }/user/save" method="post" modelAttribute="user">
  	<form:hidden path="salt" />
		<c:if test="${user.id != null }">
	  		<span class="page_title">�û�����&gt;���޸��û�</span>
			<form:hidden path="id"/>
			<input type="hidden" name="_method" value="PUT"/>
		</c:if>
		<c:if test="${user.id == null }">
	  		<span class="page_title">�û�����&gt;���½��û�</span>
		</c:if>
		
		<div class="button_bar">
			<button class="common_button" onclick="javascript:history.go(-1);">����</button>
			<c:if test="${empty token}">
			<button class="common_button" onclick="document.forms[1].submit()">����</button>
			</c:if>
		</div>
		
		<table  class="query_form_table" border="0" cellPadding="3" cellSpacing="0">
			<tr>
				<th class="input_title">�û���</th>
				<td class="input_content">
					<form:input path="name"  id="userName"/>&nbsp;&nbsp;&nbsp;&nbsp;<span id="errorMessage" ></span>
					<%-- <input type="text" name ="name" value="${user.name }" id="userName" > --%>
					<div id='divCheck'></div>
				</td>
				
				<th class="input_title">����</th>
				<td class="input_content">
					<form:password path="password"/>
				</td>
			</tr>
			<tr>
				<th class="input_title">��ɫ</th>
				<td class="input_content">
					<select name="role.name">
        				<c:forEach items="${roles }" var="role">
        					<option <c:if test="${role.name == user.role.name}">selected</c:if>>${role.name }</option>
        				</c:forEach>
        			</select>
				</td>
				<th class="input_title">״̬</th>
				<td class="input_content">
					<form:radiobuttons path="enabled" items="${allStatus }"/>
				</td>
			</tr>
			
		</table>
	</form:form>
				<c:if test="${token != '' && !empty token}">
						<input type="button" value=">>��һ��>>" id="EmpButton">
				</c:if>	
  </body>
</html>
