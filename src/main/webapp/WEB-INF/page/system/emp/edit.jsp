<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>增加员工</title>
<script type="text/javascript">
	
</script>
</head>
<body class="main">
	<center>
		<br>
		<br>
		<br>
		<br>
		<form:form action="${ctp }/system/group/emp/update" method="post" modelAttribute="emp">
			<form:hidden path="userId"/>
			<form:hidden path="createRDate"/>
			<form:hidden path="createTime"/>
			<form:hidden path="createUser"/>
			<form:hidden path="ordered"/>
			<form:hidden path="age"/>
			<form:hidden path="delflag"/>
			<form:hidden path="userId"/>
			<form:hidden path="id"/>
			 <table cellpadding="10" cellspacing="0" border="1">
				<tr>
					<th colspan="4">修改</th>
				</tr>
				
				<tr>
					<td colspan="1">编号:</td>
					<td colspan="3">
						<form:input path="empNum" readonly="true"/>
					</td>
				</tr>
				
				<tr>
					<td>部门:</td>
					<td>
					<form:select path="deptId" items="${deptList }"  itemValue="id" itemLabel="deptName"></form:select>
					</td>
					<td>用户:</td>
					<td>
						<form:input path="createUsername" readonly="true"/>
					</td>
				</tr>
				
				<tr>
					<td>中文姓名:</td>
					<td><form:input path="nameCh" /> </td>
					<td>英文姓名:</td>
					<td><form:input path="nameEn" /></td>
				</tr>
				
				<tr>
					<td>性别:</td>
					<td>
						<form:radiobuttons path="sex" items="${sex }"/>
					</td>
					<td>身份证号：</td>
					<td><form:input path="idNumber" /></td>
				</tr>

				<tr>
					<td>民族:</td>
					<td>
						<form:select path="nation" items="${nations }"></form:select>
					</td>
				</tr>
				
				<tr>
					<!-- 18210101316 -->
					<td colspan="1">生日：</td>
					<td colspan="3">
						<form:input path="birth"/>格式：(xxxx-xx-xx)
					</td>
				</tr>
				
				<tr>
					<td>婚配:</td>
					<td>
						<form:radiobuttons path="marriage" items="${marriage }"/>
					</td>
					<td>最高学历：</td>
					<td>
						<form:select path="education">
							<form:options items="${education }"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<td colspan="1">专业:</td>
					<td colspan="3">
					<form:input path="profession"/>
					</td>
				</tr>

				<tr>
					<td>开户银行:</td>
					<td>
						<form:select path="bank">
							<form:options items="${bank }"/>
						</form:select>
					</td>
					<td>银行卡号:</td>
					<td>
					<form:input path="bankAccount"/>
				</tr>

				<tr>
					<td>家庭住址:</td>
					<td>
						<form:input path="address"/>
					<td>电话:</td>
					<td><form:input path="phone"/></td>
				</tr>

				<tr>
					<td colspan="1">邮箱:</td>
					<td colspan="3"><form:input path="email"/></td>
				</tr>

					
				 <tr>
					<td>职务:</td>
					<td>
						<form:select path="duties" items="${duties }"></form:select>
					</td>
					<td>入职时间:</td>
					<td>
						<%-- <input type="text" name="entryDate" value='<fmt:formatDate value="${emp.entryDate }"/>'> --%>
						<form:input path="entryDate"/>
					</td>
				</tr> 
				<tr>
					<td>职能描述:</td>
					<td>
						<form:textarea path="description" cols="30" rows="4"/>
					</td>
					<td>工资:</td>
					<td><form:input path="salary"/></td>
				</tr>

				<tr>
					<td>在职状态：</td>
					<td>
						<form:radiobuttons path="status" items="${status }"/>
					</td>
				</tr>

				<tr>
					<td colspan="1">是否签订保密协议：</td>
					<td colspan="3">
						<form:radiobuttons path="signed" items="${signed }"/>
					</td>
				</tr>

				<tr>
					<td colspan="4"></td>
				</tr>
				<tr>
					<td colspan="1">备注：</td>
					<td colspan="3"><form:textarea path="remark" cols="30" rows="4"/>
					</td>
				</tr>  
				<tr>
					<td colspan="4">
						<input type="submit" value="保存更改">
					</td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>
