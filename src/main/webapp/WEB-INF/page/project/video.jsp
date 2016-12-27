<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/commons/common.jsp" %>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>video</title>
	<link rel="stylesheet" href="${ctp }/css/video.css">
	<script src="${ctp }/tool/jquery-3.1.1.min.js"></script>
</head>
<body>
	<section>
		<div id="videoDiv">
			<div class="videoDiv">
				<video>
				<%--  --%>
		    			<source src="${ctp }/source/syc/${path }" />
		    			你的浏览器不支持html5 video标签 
		    			<!-- <track label="English" kind="subtitles" srclang="en" src="./source/sintel-en.vtt" > -->
		    			<track label="Chinese" kind="subtitles" src="${ctp }/source/sintel-en.vtt" srclang="zh" default>
	  			</video>
	  			<!-- 暂停图层 -->
	  			<!-- <div class="maskLayer"></div> -->
	  			<!-- 浮层字幕 -->
	  			<!-- <div class="subtitle">
	  				<p>Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur, vel eos dolorem sint ea necessitatibus maiores. Illum sint, architecto dicta molestiae, ab ipsa! Odio eaque incidunt itaque dolorem veniam doloribus.</p>
	  				<p>Lorem ipsum dolor sit amet Lorem ipsum dolor sit amet, consectetur adipisicing elit. Consectetur, vel eos dolorem sint ea necessitatibus maiores. Illum sint, architecto dicta molestiae, ab ipsa! Odio eaque incidunt itaque dolorem veniam doloribus.</p>
	  			</div> -->
			</div>
	  		<div class="progress">
	  			<span class="spanStyle"></span>
	  			<div class="line"></div>
	  			<div class="progressDiv"></div>
	  		</div>
	  		<div class="buttonDiv">
	  			<ul>
	  				<li><a href="javascript:void(0);" onclick="playAndPause()">播放/暂停</a></li>
	  				<li><a href="javascript:void(0);" onclick="playbackRateUp()">加速播放</a></li>
	  				<li><a href="javascript:void(0);" onclick="playbackRateDown()">减速播放</a></li>
	  				<li><a href="javascript:void(0);" onclick="getCurrentTime()">获取播放时间</a></li>
	  				<li><a href="javascript:void(0);" onclick="refurbish()">刷新</a></li>
	  				<li class="urlLi">
	  					<a href="javascript:void(0);" >切换视频</a>
	  					<ul >
	  						<li onclick="changeURL(this)">高清</li>
	  						<li onclick="changeURL(this)">普通</li>
	  						<li onclick="changeURL(this)">流畅</li>
	  					</ul>
	  				</li>
	  			</ul>
	  		</div>
		</div>
		<div id="editorSubtitle">
			<form action="">
				<input type="file" name="file"/>
    				<button>保存</button>
    				<textarea></textarea>
			</form>
			<div class="subtitleList">
				<div class="subtitleRow">
					<div class="subtitleTime"></div>
					<div class="subtitleContent"></div>
				</div>
			</div>
		</div>
	</section>
</body>
<script src="${ctp }/js/video.js"></script>
</html>