<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script src="/easyui/jquery-easyui-1.5.1/jquery.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
<script src="/easyui/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

<link rel="stylesheet"
	href="/easyui/jquery-easyui-1.5.1/themes/default/easyui.css" />
<link rel="stylesheet"
	href="/easyui/jquery-easyui-1.5.1/themes/icon.css" />


<script>
	$(function(){
		/*
		$.messager.alert("我是标题","我是内容","question",function() {
			alert(1123);
		});
		*/

		
		/*
		$.messager.show({
			title:"呵呵",
			msg:"看什么看!",
			timeout:1000,
			showType:"fade",
		});
		*/

		/*
		$.messager.confirm("问候", "吃了吗?", function(r) {
			if(r) {
				alert(123);
			} else {
				alert(456);
			}
		});
		*/

		/*
		$.messager.prompt("问候","吃的啥?", function(r){
			alert(r+"好吃不");
		});
		*/

		$.messager.progress({
			title:"加载",
			msg:"哈哈哈",
			text:"^_^",
			
		});

		var b = $.messager.progress("bar");


		
	

	});
</script>


12312321111
