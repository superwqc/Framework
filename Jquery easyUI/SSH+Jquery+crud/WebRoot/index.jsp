<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<script src="/crud/jquery-easyui-1.5.1/jquery.min.js"></script>
		<script src="/crud/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
		<script src="/crud/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>

		<link rel="stylesheet"
			href="/crud/jquery-easyui-1.5.1/themes/default/easyui.css" />
		<link rel="stylesheet"
			href="/crud/jquery-easyui-1.5.1/themes/icon.css" />

		<script>
	$(function() {
		$("#tb").datagrid( {
			"url" : "/crud/user/find.do",
			fitColumns : true,
			singleSelect:true,
			columns : [ [ {
				field : 'id',
				title : '编号',
				width : 100
			}, {
				field : 'name',
				title : '姓名',
				width : 100
			}, {
				field : 'birthday',
				title : '生日',
				width : 100
			}, {
				field : 'money',
				title : '存款',
				width : 100
			}, ] ],

			toolbar : [ {
				text : "添加",
				iconCls : "icon-add",
				handler : function() {
				$("#save_window").window("open");
				
				}
			}, {
				text : "删除",
				iconCls : "icon-remove",
				handler : function() {
				$.messager.confirm("确认？","你确定删除吗?",function(r){
					if(r){
						var row=$("#tb").datagrid("getSelected");
						if(row==null){
							$.messager.show({
								title:"删除",
								msg:"必须选择一行"
								});
							}else{
								$.ajax({
									type:"post",
									url:"crud/user/delete.do"
										data:{id:row.id},
										success:function(){
											$.messager.show({
												title:"删除操作",
												msg:"删除成功！"
												});
											$("#tb").datagrid("reload");
											}
									});
								}
						}
						});
				}
			},

			{
				text : "修改",
				iconCls : "icon-edit",
				handler : function() {
				}
			}, 
			]
		});
		$("#save_window").window({
			width:300,
			height:200,
			title:"添加用户",
			iconCls:"icon-man",
			closed:true,
			modal:true,
			});
		$("input[name=birthday]").datebox({
			width:200,
			});
		$("#save_btn").click(function(){
			$.ajax({
				type:"post",
				url:"/crud/user/save.do",
				data:$("#save_form").serialize(),
				success:function(){
					$.messager.show({
						title:"添加操作",
						msg:"添加成功！"
						});
					$("#save_window").window("close");
					$("#save_form").form("reset");
					$("#tb").datagrid("reload");
					}
				});
			});
	});
</script>




	</head>

	<body>
		<table id="tb"></table>
		<div id="save_window">
			<form id="save_form">
				姓名:
				<input name="name" />
				<br />
				生日:
				<input name="birthday" />
				<br />
				存款:
				<input name="money" />
				<br />
				<button id="save_btn" type="button">
					GO
				</button>
			</form>

		</div>
	</body>
</html>
