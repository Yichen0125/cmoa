<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/commons/common.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>增加员工</title>
</head>
<body class="main">
	<center>
		<br>
		<br>
		<br>
		<br>
		<form action="${ctp }/system/group/emp/add" method="post">
			 <table cellpadding="10" cellspacing="0" border="1">
				<tr>
					<th colspan="4">添加员工</th>
				</tr>
				
				<tr>
					<td colspan="1">编号:</td>
					<td colspan="3"><input type="text" value="${empNum }"
						disabled="disabled"> <input type="hidden"
						value="${empNum }" name="empNum"></td>
				</tr>
				
				<tr>
					<td>部门:</td>
					<td><select name="dept.id">
						<option>-- 请选择 --</option>
							<c:forEach items="${deptList }" var="dept">
								<option value="${dept.id }">${dept.deptName }</option>
							</c:forEach>
					</select></td>
					<td>用户:</td>
					<td><input type="text" value="${sessionScope.TmpUser.name }"
						disabled="disabled"> <input type="hidden"
						value="${sessionScope.TmpUser.name }" name="user.name"></td>
				</tr>
				
				<tr>
					<td>中文姓名:</td>
					<td><input type="text" name="nameCh"></td>
					<td>英文姓名:</td>
					<td><input type="text" name="nameEn"></td>
				</tr>
				
				<tr>
					<td>性别:</td>
					<td><input type="radio" name="sex" value="1">男
					<input type="radio" name="sex" value="0">女 </td>
					<td>身份证号：</td>
					<td><input type="text" name="idNumber"></td>
				</tr>

				<tr>
					<td>民族:</td>
					<td><select name="nation">
							<option>-- 请选择 --</option>
							<c:forEach items="${nations }" var="nation"> 
								<option>${nation }</option>
							</c:forEach>
					</select></td>
				</tr>
				
				<tr>
					<td colspan="1">生日：</td>
					<td colspan="3">
						<input type="text" name="birth">格式：(xxxx-xx-xx)
					</td>
				</tr>
				
				<tr>
					<td>婚配:</td>
					<td><input type="radio" name="marriage" value="1">已婚
					<input type="radio" name="marriage" value="0">未婚</td>
					<td>最高学历：</td>
					<td><select name="education">
							<option>-- 请选择 --</option>
							<option value="1">博士研究生</option>
							<option value="2">硕士研究生</option>
							<option value="3">本科毕业</option>
							<option value="4">大学专科</option>
					</select></td>
				</tr>

				<tr>
					<td colspan="1">专业:</td>
					<td colspan="3"><input type="text" name="profession">
					</td>
				</tr>

				<tr>
					<td>开户银行:</td>
					<td><select name="bank">
							<option>中国银行</option>
							<option>邮政储蓄银行</option>
							<option>建设银行</option>
							<option>工商银行</option>
							<option>农业银行</option>
					</select></td>
					<td>银行卡号:</td>
					<td><input type="text" name="bankAccount"></td>
				</tr>

				<tr>
					<td>家庭住址:</td>
					<td><input type="text" name="address"></td>
					<td>电话:</td>
					<td><input type="text" name="phone"></td>
				</tr>

				<tr>
					<td colspan="1">邮箱:</td>
					<td colspan="3"><input type="text" name="email"></td>
				</tr>

					
				 <tr>
					<td>职务:</td>
					<td><select name="duties">
							<option value="0">-- 请选择 --</option>
							<option value="1">总经理</option>
							<option value="2">总监</option>
							<option value="3">经理</option>
							<option value="4">项目经理</option>
							<option value="5">职员</option>
					</select></td>
					<td>入职时间:</td>
					<td><input type="text" name="entryDate"></td>
				</tr> 
					
			
				<tr>
					<td>职能描述:</td>
					<td><textarea rows="4" cols="30" name="description"></textarea>
					</td>
					<td>工资:</td>
					<td><input type="text" name="salary"></td>
				</tr>

				<tr>
					<td>在职状态：</td>
					<td><input type="radio" name="status" value="1">在职 <input
						type="radio" name="status" value="0">离职</td>
				</tr>

				<tr>
					<td colspan="1">是否签订保密协议：</td>
					<td colspan="3"><input type="radio" name="signed" value="1">已签订
						<input type="radio" name="signed" value="0">未签订</td>
				</tr>

				<tr>
					<td colspan="4"></td>
				</tr>
				<tr>
					<td colspan="1">备注：</td>
					<td colspan="3"><textarea rows="4" cols="60" name="remark"></textarea>
					</td>
				</tr>  
				<tr>
					<td colspan="4" align="center"><input type="submit" value="提交">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
