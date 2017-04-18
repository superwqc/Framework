<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
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
			valueField : "id",
			width : 180
		});
	});
</script>
	</head>
	<body class="easyui-layout">
		<div data-options="region:'north',title:'北部',split:true"
			style="height: 100px;">
			xxxx
		</div>
		<div data-options="region:'west',title:'West',split:true"
			style="width: 200px;">

			<div id="aa" class="easyui-accordion"
				style="width: 300px; height: 200px;">
				<div title="Title1" data-options="selected:true,iconCls:'icon-save'"
					style="overflow: auto; padding: 10px;">
					11111
				</div>
				<div title="Title2" data-options="iconCls:'icon-reload'"
					style="padding: 10px;">
					2222
				</div>
				<div title="Title3" data-options="iconCls:'icon-ok'">
					<input id="i1" />
				</div>
			</div>




		</div>
		<div data-options="region:'center',title:'center title'"
			style="padding: 5px;">
			adasdas
		</div>
	</body>
</html>