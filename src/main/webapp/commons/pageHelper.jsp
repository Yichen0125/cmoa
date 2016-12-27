<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

共 ${pageInfo.total} 条记录 
		&nbsp;&nbsp;
		
		当前第  ${pageInfo.pageNum} 页/共 ${pageInfo.pages} 页
		&nbsp;&nbsp;
		
		<c:if test="${pageInfo.hasPreviousPage}">
			&nbsp;&nbsp;
			<a href="?pageNo=1${queryString}">首页</a>
			&nbsp;&nbsp;
			<a href="?pageNo=${pageInfo.prePage}${queryString}">上一页</a>
		</c:if>	
		
		<c:if test="${pageInfo.hasNextPage}">
			&nbsp;&nbsp;
			<a href="?pageNo=${pageInfo.nextPage}${queryString}">下一页</a>
			&nbsp;&nbsp;
			<a href="?pageNo=${pageInfo.lastPage}${queryString}">末页</a>
		</c:if>			
		
		&nbsp;&nbsp;
		转到 <input id="pageNo" size='1'/> 页
		&nbsp;&nbsp;
	
	<script type="text/javascript" src="${ctp}/static/jquery/jquery-3.1.0.min.js"></script>
	<script type="text/javascript">
	
		$(function(){
			
			$("#pageNo").change(function(){
				
				var pageNo = $(this).val();
				var reg = /^\d+$/;
				if(!reg.test(pageNo)){
					$(this).val("");
					alert("输入的页码不合法");
					return;
				}
				
				var pageNo2 = parseInt(pageNo);
				if(pageNo2 < 1 || pageNo2 > parseInt("${pageInfo.pages}")){
					$(this).val("");
					alert("输入的页码不合法");
					return;
				}
				
				//查询条件需要放入到 class='condition' 的隐藏域中. 
				window.location.href = window.location.pathname + "?pageNo=" + pageNo2 + "${queryString }";
				
			});
		})
	</script>