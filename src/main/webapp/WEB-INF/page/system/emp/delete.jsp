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
			var date = new Date();
			$("#leavingTime").val(date.format("yyyy-MM-dd"));
		})
	</script>
</head>
<body>
<center>
	<br>
	<br>
	<br>
	<form action="${ctp }/system/group/emp/delete/${id}" method="post">
			<table border="1" cellpadding="10" cellspacing="0">
					<tr>
						<td>离职时间：</td>
						<td>
							<input type="text" id="leavingTime" name="leavingTime" readonly="readonly">
						</td>
					</tr>
					<tr>
						<td>离职原因:</td>
						<td><textarea rows="4" cols="30" name="leavingReason"></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center" >
							<input type="submit" value="保存">
						</td>
					</tr>
			</table>		
	</form>
	
</center>
</body>
</html>