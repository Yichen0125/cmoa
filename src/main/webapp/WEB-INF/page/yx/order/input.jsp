<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		$(function(){
			if("${requestScope.order.id}" != ""){
				$("form:eq(1)").attr("action","${ctp}/yx/customer/update");
			}
			
			var date = new Date();
			$("#createRDate").val(date.format("yyyy-MM-dd HH:mm:ss"));
			
			 $("#empId").change(function(){
				 var id = $(this).val();
				 $.ajax({
					 type:'get',
				 	 url:'${ctp}/yx/customer/input/q/'+id,
				 	 contentType:'application/json',
				 	 success:(function(data){
				 		console.log(data);
				 		if (data != null && data != ""){
							$("#empNum").val(data);
						}
				 	 })
				 })
				 
			 }) 
			
		})
		
</script>
</head>
<body>
<center>
	<form:form action="add" method="post" modelAttribute="order" >
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>创建时间</th>
				<td colspan="3"><form:input path="createRDate" readonly="true" id="createRDate"/></td>
			</tr>
			 <tr>
				<th>订单编号</th>
				<td colspan="3"><form:input path="ordNum" readonly="true" value="${ordNum }"/></td>
			</tr>
			
			<tr>
				<th>客户名称</th>
				<td>
					<form:input path="customer.cusNameZh" id="cusName"/>
				</td>
				<th>订单创建人</th>
				<td>
					<form:input path="employe.nameCh" value="${user.name }" readonly="true"/>
				</td>
			</tr>
			
			<tr>
				<th>合同编号</th>
				<td>
					<form:input path="contractNum" id="contractNum"/>
				</td>
				<th>地区</th>
				<td>
					<form:input path="customer.cusNameZh" id="cusName"/>
				</td>
			</tr>
			
			<tr>
				<th>联系人</th>
				<td>
					<form:select path="contact.id">
						<%-- <form:option value="0"> - 请选择 - </form:option>
						<form:options /> --%>
					</form:select>
					<a href="addCon">添加联系人</a>
				</td>
				<td>
					<form:select path="ordType">
						<form:option value="0">-- 请选择 --</form:option>
						<form:options items="${ordType }"/>
					</form:select>
				</td>
			</tr>
			
			<!-- ----------------------------------------------------- -->
			<c:if test="${!empty requestScope.customer.id }">
				<form:hidden path="id"/>
				<form:hidden path="createRDate"/>
				<form:hidden path="createTime"/>
				<form:hidden path="createUser"/>
				<form:hidden path="createUsername"/>
				<form:hidden path="depId"/>
				<form:hidden path="delflag"/>
			</c:if>
			
			<tr>
				<td colspan="4" align="center">
					<input type="submit" value="保存">
				</td>
			</tr>
		</table>
	</form:form>
</center>
</body>
</html>