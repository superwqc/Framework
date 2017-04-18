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
		// 将选中的div，变为一个easyui中的窗口
		// 这里控制了window的初始状态

		$("#d1").window( {
			width : 300,
			height : 200,
			modal : true,
			title : "注册用户",
			collapsible : true,
			minimizable : true,
			maximizable : true,
			closable : true,
			closed : true,
			draggable : true,
			shadow : true,
			border : false,
			top : 0,
			left : 0,
			onMove : function() {
				alert(111);
			}

		});

		// 点击按钮时，让window显示出来
		$("button:eq(0)").click(function() {
			/*
			$("#d1").window({
				closed:false
			})
			 */

			// easyui中，调用方法的语法!
				$("#d1").window("open");
			});

	});
</script>

<button>
	Go
</button>

<div id="d1">
	<form>
		账户:
		<input />
		<br />
		密码:
		<input />
		<br />
		<button>
			注册
		</button>
	</form>
</div>