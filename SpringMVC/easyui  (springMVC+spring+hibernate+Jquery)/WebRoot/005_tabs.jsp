<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<script src="/easyui/jquery-easyui-1.5.1/jquery.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

<link rel="stylesheet"
	href="/easyui/jquery-easyui-1.5.1/themes/default/easyui.css" />
<link rel="stylesheet"
	href="/easyui/jquery-easyui-1.5.1/themes/icon.css" />

<script>
	$(function() {
		$("a:contains(添加)").click(function() {

			if ($("#tt").tabs("exists", "添加用户")) {
				$("#tt").tabs("select", "添加用户");
			} else {
				$("#tt").tabs("add", {
					title : "添加用户",
					closable : true

				});
			}
		});
		$("a:contains(修改)").click(function() {
			if ($("#tt").tabs("exists", "修改用户")) {
				$("#tt").tabs("select", "修改用户");
			} else {
				$("#tt").tabs("add", {
					title : "修改用户",
					closable : true

				});
			}
		});
		$("a:contains(删除)").click(function() {
			if ($("#tt").tabs("exists", "删除用户")) {
				$("#tt").tabs("select", "删除用户");
			} else {
				$("#tt").tabs("add", {
					title : "删除用户",
					closable : true

				});
			}
		});
	});
</script>

<body class="easyui-layout">
	<div data-options="region:'north',title:'North Title',split:true"
		style="height: 100px;"></div>
	<div data-options="region:'west',title:'West',split:true"
		style="width: 200px;">
		<div id="aa" class="easyui-accordion"
			style="width: 190px; height: 90%;">
			<div title="Title1" data-options="iconCls:'icon-save',selected:true"
				style="overflow: auto; padding: 10px;">
				<a>添加</a>
				<br />
				<a>修改</a>
				<br />
				<a>删除</a>
				<br />
			</div>
			<div title="Title2" data-options="iconCls:'icon-reload'"
				style="padding: 10px;">
				2222222222
			</div>
			<div title="Title3">
				333333333
			</div>
		</div>

	</div>
	<div data-options="region:'center',title:'center title'"
		style="padding: 5px; background: #eee;">



		<div id="tt" class="easyui-tabs" style="width: 100%; height: 100%;">

		</div>



	</div>
</body>
