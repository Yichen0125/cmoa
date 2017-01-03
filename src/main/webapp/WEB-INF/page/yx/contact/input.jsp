<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>增加联系人</title>
<script type="text/javascript">
	
</script>
</head>
<body class="main">
	<center>
		<br>
		<br>
		<form:form action="${ctp }/yx/contact/add" method="post" modelAttribute="contact">
			 <table cellpadding="10" cellspacing="0" border="1">
				<tr>
					<td colspan="1">编号:</td>
					<td>
						<form:input path="ccNum" readonly="true"/>
					</td>
				</tr>
				
				<tr>
					<td>首要:</td>
					<td>
					<form:select path="isprimary">
						<form:options items="${primary }"/>
					</form:select>
					
				</tr>
				<tr>
					<td>客户名称:</td>
					<td>
						<form:select path="cusId">
							<form:options items="${customerList }" itemLabel="cusNameZh" itemValue="id"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<td>姓名:</td>
					<td><form:input path="ccName" /> </td>
				</tr>
				<tr>
					<td>性别:</td>
					<td>
						<form:radiobuttons path="sex" items="${sex }"/>
					</td>
				</tr>
				<tr>
					<td>电话：</td>
					<td><form:input path="ccTel" /></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><form:input path="ccEmail" /></td>
				</tr>
				<tr>
					<td>职务：</td>
					<td><form:input path="duties" /></td>
				</tr>
				<tr>
					<td>地址:</td>
					<td>
						<form:input path="ccAdress" />
					</td>
				</tr>
				<tr>
					<!-- 18210101316 -->
					<td colspan="1">生日：</td>
					<td >
						<form:input path="birth"/>格式：(xxxx-xx-xx)
					</td>
				</tr>
				
				<tr>
					<th>传真：</th>
					<td >
						<form:input path="ccFax"/>
					</td>
				</tr>
				<tr>
					<th>QQ：</th>
					<td>
						<form:input path="ccQq"/>
					</td>
				</tr>
				<tr>
					<th>微信：</th>
					<td>
						<form:input path="ccWx"/>
					</td>
				</tr>
				<tr>
					<td colspan="1">兴趣:</td>
					<td align="center">
					<form:textarea path="hobbies" cols="30" rows="4"/>
					</td>
				</tr>

				<tr>
					<td colspan="1">补充描述:</td>
					<td  align="center">
						<form:textarea path="ccDesp" cols="30" rows="4"/>
					</td>
				</tr>
				<tr>
					<td colspan="1">岗位情况:</td>
					<td>
						<form:textarea path="ccGwqk" cols="30" rows="4"/>
					</td>
				</tr>
				
				<tr>
					<th>采购力角色:</th>
					<td>
						<form:select path="ccCgljs">
							<form:options items="${ccCgljs }"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<th>反应类型:</th>
					<td>
						<form:select path="ccFylx">
							<form:options items="${ccFylx }"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<td>决策重要度:</td>
					<td>
						<form:select path="ccJczyd">
							<form:options items="${ccJczyd }"/>
						</form:select>
				</tr>
				<tr>
					<td>需求分类:</td>
					<td>
						<form:select path="ccXqfl">
							<form:options items="${ccXqfl }"/>
						</form:select>
					</td>
				</tr>

				<tr>
					<td colspan="1">个人需求描述:</td>
					<td  >
						<form:textarea path="ccXqms" cols="30" rows="4"/>
					</td>
				</tr>

					
				 <tr>
					<td>覆盖支持度描述:</td>
					<td  >
						<form:select path="ccFgzcdms">
							<form:options items="${ccFgzcdms }"/>
						</form:select>
					</td>
				</tr> 
				<tr>
					<td>评价分数可见事实:</td>
					<td   >
						<form:textarea path="ccPjreason" cols="30" rows="4"/>
					</td>
				</tr>
				<tr>
					<td>动机:</td>
					<td  >
						<form:textarea path="ccMotiv" cols="30" rows="4"/>
					</td>
				</tr>
				<tr>
					<td>社交风格:</td>
					<td  >
						<form:textarea path="ccSocial" cols="30" rows="4"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="保存更改">
					</td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>
