<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<script src="/easyui/jquery-easyui-1.5.1/jquery.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

<link rel="stylesheet"
	href="/easyui/jquery-easyui-1.5.1/themes/default/easyui.css" />
<link rel="stylesheet"
	href="/easyui/jquery-easyui-1.5.1/themes/icon.css" />


<script>
	$(function() {
		$("#i1").combobox( {
			"url" : "/easyui/user/f1.do",
			textField : "name",
			valueField : "id"
		});
	});
</script>

<input id="i1" />


