<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ctp }/static/jquery/jquery-3.1.0.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#fileList").on("change",$("tr td input"),function(){
				
					/*  var fileName = $("tr td input")[$("tr td input").length-2].files[0];
					console.log($("tr td input")[$("tr td input").length-2]);
					
					$($("tr td input")[$("tr td input").length-2]).parent().next().children(":input:eq(0)").val(fileName.name); 
					 */
					var $tr = $("<tr></tr>");
					$tr.append("<td><input type='file' class='fileUrl' name='myMedias'></td>");
					$("#fileList").append($tr);
			})
			
			$("#addAll").click(function(){
				var proid = $("select").val();
				console.log(proid);
				var url = "addAll/"+proid;
				$("#addAllForm").attr("action",url);
				console.log(url);
				$("#addAllForm").submit();
				return false;
			})
			
		})
	</script>
</head>
<body>
	<center>
	<br>
	<br>
	<br>
		<select>
			<c:forEach items="${projectList }" var="project">
				<option value="${project.id }">${project.pronum } / ${project.name }</option>
			</c:forEach>
		</select>
	
	<br>
	<br>
	<form action="addAll" method="post" id="addAllForm" enctype="multipart/form-data">
		<table border="1" cellpadding="10" cellspacing="0" id="fileList">
			<tr>
				<td>
					<input type="file" class="fileUrl" name="myMedias">
					
				</td>
			</tr>
					
		</table>
	</form>
	<input type="button" value="全部提交" id="addAll">
	<a href="${ctp }/xm/pro/sp/list">返回</a>
	</center>
</body>
</html>