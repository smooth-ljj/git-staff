<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/js/common/tags.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="/js/common/metas.jsp" %>
	<!-- 引入EasyUI的样式文件-->
	<link rel="stylesheet" href="<%=request.getContextPath() %>/js/easyui/themes/black/easyui.css" type="text/css"/>
	<!-- 引入EasyUI的图标样式文件-->
	<link rel="stylesheet"href="<%=request.getContextPath() %>/js/easyui/themes/icon.css" type="text/css"/>
	<!-- 引入JQuery -->
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/jquery.min.js"></script>
	<!-- 引入EasyUI -->
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/jquery.easyui.min.js"></script>
	<!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<!-- 引入EasyUI的生成树的插件 -->
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/util-js.js"></script>

	<!-- 引入uploadify的css、js -->
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/js/uploadify/uploadify.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/uploadify/jquery.uploadify.min.js"></script>

<!-- ueditor富文本编辑器 -->
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/js/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/js/ueditor/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/js/ueditor/lang/zh-cn/zh-cn.js"></script>

</head>
<body>

</body>
</html>