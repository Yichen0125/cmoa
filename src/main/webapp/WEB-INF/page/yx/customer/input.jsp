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
			if("${requestScope.customer.id}" != ""){
				$("form:eq(1)").attr("action","${ctp}/yx/customer/update");
			}
			
			var date = new Date();
			$("#createRDate").val(date.format("yyyy-MM-dd"));
			
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
	<form:form action="add" method="post" modelAttribute="customer" >
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>建档时间</th>
				<td colspan="3"><form:input path="createRDate" readonly="true" id="createRDate"/></td>
			</tr>
			 <tr>
				<th>客户编号</th>
				<td colspan="3"><form:input path="cusNum" readonly="true" value="${cusNum }"/></td>
			</tr>
			
			<tr>
				<th>客户姓名-C</th>
				<td><form:input path="cusNameZh"/></td>
				<th>客户姓名-E</th>
				<td><form:input path="cusNameEn"/></td>
			</tr>
				
			<tr>
				<th>责任员工</th>
				<td>
					<form:select path="empId">
						<form:option value="">-- 请选择 --</form:option>
						<form:options items="${empList }" itemLabel="nameCh" itemValue="id" id="empId"/>
					</form:select>
				</td>
				<th>员工编号</th>
				<td><form:input path="empNum" readonly="true" id="empNum"/></td>
			</tr>
		
			<tr>
				<th>客户类型</th>
				<td>
					<form:radiobuttons path="cusType" items="${cusType }"/>
				</td>
				<th>公司性质</th>
				<td><form:select path="cusNature"><form:options  items="${cusNature }"/> </form:select></td>
			</tr>
				
			<tr>
				<th>地址</th>
				<td>
					<form:input path="address"/>
				</td>
				<th>英文地址</th>
				<td><form:input path="addressEn"/></td>
			</tr>
		
			<tr>
				<th>来源</th>
				<td>
					<form:select path="source">
						<form:options items="${source }"/>
					</form:select>
				</td>
				<th>审批状态</th>
				<td>
					<c:if test="${isapproval != null }">
						<form:radiobuttons path="isapproval" items="${isapproval }"/>
					</c:if>
					<c:if test="${isapproval == null }">
						<input type="radio" value="0" checked="checked" name="isapproval" readonly="readonly">未审批
						<input type="radio" value="1" name="isapproval" readonly="readonly">已审批
					</c:if>
				</td>
			</tr>
				
			<tr>
				<th>审批人</th>
				<td>
					<c:if test="${approval != null}">
						<form:select path="approval">
							<form:options items="${approval }"/>
						</form:select>
					</c:if>
					<c:if test="${approval == null}">
						<form:input path="approval" readonly="true"/>
					</c:if>
				</td>
				<th>目标下单额</th>
				<td>
					<form:input path="xdeAims"/>
				</td>
			</tr>
			
			<tr>
				<c:if test="${level != null }">
					<th>客户级别</th>
					<td>
						<form:select path="level">
							<form:options items="${level }" />
						</form:select>
					</td>
				</c:if>
				<c:if test="${level == null }">
					<th>客户级别</th>
					<td>
						<input type="text" value="C级客户" readonly="readonly">
					</td>
				</c:if>
				
				<th>开户银行</th>
				<td>
					<form:select path="bank">
						<form:options items="${bank }"/>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<th>银行卡号</th>
				<td colspan="3">
					<form:input path="bankAccount"/>
				</td>
			</tr>
			
			<tr>
				<th>银行国际代码</th>
				<td colspan="3">
					<form:input path="swiftCode"/>
				</td>
			</tr>
		
			<tr>
				<th>竞争对手名称</th>
				<td>
					<form:input path="opponentName"/>
				</td>
				<th>与竞争对手比所处位置</th>
				<td>
					<form:select path="opponentPosition" items="${position }"></form:select>
				</td>
			</tr>
			
			<tr>
				<th>销售机会所处阶段</th>
				<td colspan="3">
					<form:select path="opponentStage" items="${stage }"></form:select>
				</td>
				
			</tr>
			
			<%-- <tr>
					<th>客户关系突破行动目标</th>
					<td colspan="3">
						<form:textarea path="khtpAction" rows="4" cols="30" />
					</td>
			</tr> --%>
				
			<tr>
				<th>成单量</th>
				<td>
					<form:input path="cdl" />
				</td>
				<th>满意度</th>
				<td>
					<form:select path="myd" items="${myd }" ></form:select>
				</td>
			</tr>
			<tr>
				<th>客户信誉分</th>
				<td>
					<form:select path="xyd" items="${xyd }"></form:select>
				</td>
				<th>客户状态</th>
				<td>
					<form:select path="status" items="${cusStatus }"></form:select>
				</td>
			</tr>
			<tr>
				<th>备注</th>
				<td colspan="3">
					<form:textarea path="remark" rows="4" cols="30"/>
				</td>
			</tr>
			
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